package com.ms.springboot.controller;

import org.springframework.stereotype.Component;

@Component
public class LoginService {

	public boolean isValidUser(String username, String password) {
		return "manoj".equals(username) && "manoj".equals(password);
	}
}
