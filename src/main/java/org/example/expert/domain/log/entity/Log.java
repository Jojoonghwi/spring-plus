package org.example.expert.domain.log.entity;

import java.time.LocalDateTime;

import org.example.expert.domain.common.entity.Timestamped;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Getter
@Entity
@Table
public class Log {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(unique = false)
	private boolean isSuccessful;

	@Column(unique = false)
	private String logMsg;

	@Column(unique = false)
	private Long userId;

	@Column(unique = false)
	private Long todoId;

	@Column(unique = false)
	private LocalDateTime createdAt;

	protected Log() {

	}

	public Log(String Msg, boolean isSuccessful, Long userId, Long todoId){
		this.logMsg = Msg;
		this.isSuccessful = isSuccessful;
		this.userId = userId;
		this.todoId = todoId;
		this.createdAt = LocalDateTime.now();
	}
}

