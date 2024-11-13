package org.example.expert.domain.todo.repository;

import java.util.Optional;

import org.example.expert.domain.todo.entity.QTodo;
import org.example.expert.domain.todo.entity.Todo;
import org.example.expert.domain.user.entity.QUser;
import org.springframework.data.repository.query.Param;

import com.querydsl.jpa.impl.JPAQueryFactory;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CustomTodoRepositoryImpl implements CustomTodoRepository{

	@PersistenceContext
	private EntityManager entityManager;

	private final JPAQueryFactory jpaQueryFactory;

	public Optional<Todo> findByIdWithUser(@Param("todoId") Long todoId) {
		QTodo qTodo = QTodo.todo;
		QUser qUser = QUser.user;

		Todo todo = jpaQueryFactory
			.selectFrom(qTodo)
			.leftJoin(qTodo.user, qUser)
			.fetchJoin()
			.where(qTodo.id.eq(todoId))
			.fetchOne();

		return Optional.ofNullable(todo);
	}
}
