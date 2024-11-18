package org.example.expert.domain.todo.repository;

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
}
