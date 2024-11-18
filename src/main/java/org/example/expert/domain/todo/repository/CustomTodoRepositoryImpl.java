package org.example.expert.domain.todo.repository;

import java.util.List;
import java.util.Optional;

import org.example.expert.domain.comment.entity.QComment;
import org.example.expert.domain.manager.entity.QManager;
import org.example.expert.domain.todo.dto.response.TodoKeywordResponse;
import org.example.expert.domain.todo.entity.QTodo;
import org.example.expert.domain.todo.entity.Todo;
import org.example.expert.domain.user.entity.QUser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.JPAExpressions;
import com.querydsl.jpa.impl.JPAQueryFactory;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CustomTodoRepositoryImpl implements CustomTodoRepository{

	@PersistenceContext
	private EntityManager entityManager;

	private final JPAQueryFactory jpaQueryFactory;
	QTodo qTodo = QTodo.todo;
	QUser qUser = QUser.user;
	QComment qComment = QComment.comment;
	QManager qManager = QManager.manager;

	@Override
	public Optional<Todo> findByIdWithUser(@Param("todoId") Long todoId) {

		Todo todo = jpaQueryFactory
			.selectFrom(qTodo)
			.leftJoin(qTodo.user, qUser)
			.fetchJoin()
			.where(qTodo.id.eq(todoId))
			.fetchOne();

		return Optional.ofNullable(todo);
	}

	@Override
	public Page<TodoKeywordResponse> findByTodoWithKeyword(
		Pageable pageable,
		@Param("titleKeyword") String titleKeyword,
		@Param("nickNameKeyword") String nickNameKeyword)
	{
		BooleanBuilder conditions = new BooleanBuilder();


		if (titleKeyword != null && !titleKeyword.isEmpty()) {
			conditions.and(qTodo.title.containsIgnoreCase(titleKeyword));
		}

		if (nickNameKeyword != null && !nickNameKeyword.isEmpty()) {
			conditions.and(qTodo.user.nickname.containsIgnoreCase(nickNameKeyword));
		}

		List<TodoKeywordResponse> results = jpaQueryFactory
			.select(Projections.constructor(
				TodoKeywordResponse.class,
				qTodo.id,
				qTodo.title,
				qTodo.managers.size(),
				qTodo.comments.size()
			))
			.from(qTodo)
			.leftJoin(qTodo.user, qUser)
			.where(conditions)
			.orderBy(qTodo.createdAt.desc())
			.offset(pageable.getOffset())
			.limit(pageable.getPageSize())
			.fetch();

		// 전체 데이터 수 카운트
		Long count = Optional.ofNullable(
			jpaQueryFactory.select(qTodo.count())
				.from(qTodo)
				.leftJoin(qTodo.user, qUser)
				.where(conditions)
				.fetchOne()
		).orElse(0L);

		// Page 객체 생성
		return new PageImpl<>(results, pageable, count);
	}
}
