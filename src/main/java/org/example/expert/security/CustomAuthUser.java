package org.example.expert.security;

import java.util.Collection;
import java.util.Collections;

import org.example.expert.domain.user.entity.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Getter;

@Getter
public class CustomAuthUser implements UserDetails{

	private final User user;

	public CustomAuthUser(User user) {
		this.user = user;
	}

	@Override
	public String getUsername() {
		return user.getEmail();
	}

	@Override
	public String getPassword() {
		return user.getPassword();
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return Collections.singletonList(new SimpleGrantedAuthority(user.getUserRole().name()));
	}

	public String getNickname() {
		return user.getNickname();
	}

	@Override
	public boolean isAccountNonExpired() {//계정의 만료 여부를 확인
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {//계정이 잠겼는지 확인
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {//사용자의 자격 증명 (예: 비밀번호)의 만료 여부를 확인
		return true;
	}

	@Override
	public boolean isEnabled() {//계정이 활성화되었는지 확인
		return true;
	}
}
