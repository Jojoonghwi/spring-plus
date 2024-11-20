package org.example.expert.domain.todo.repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;

import org.example.expert.domain.todo.dto.response.TodoKeywordResponse;
import org.example.expert.domain.todo.entity.Todo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

public interface CustomTodoRepository {

	Optional<Todo> findByIdWithUser(@Param("todoId") Long todoId);

	Page<TodoKeywordResponse> findByTodoWithKeyword(
		Pageable pageable,
		@Param("titleKeyword") String titleKeyword,
		@Param("nickNameKeyword") String nickNameKeyword);

	//필수 Lv1-5 쿼리DSL로 변경
	// Page<Todo> findByCondition(
	// 	@Param("weather") String weather,
	// 	@Param("startDate") LocalDateTime startDate,
	// 	@Param("endDate") LocalDateTime endDate,
	// 	Pageable pageable);
}
