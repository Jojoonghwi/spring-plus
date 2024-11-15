package org.example.expert.domain.todo.dto.response;

import lombok.Getter;

@Getter
public class TodoKeywordRespose {
	private final Long todoId;
	private final String title;
	private final int managerCount;
	private final int commentCount;

	public TodoKeywordRespose(Long todoId, String title, int managerCount, int commentCount) {
		this.todoId = todoId;
		this.title = title;
		this.managerCount = managerCount;
		this.commentCount = commentCount;
	}
}


