package com.springboot.first.app.service;

import java.util.List;

import com.springboot.first.app.dto.UserDto;

public interface UserService {

	UserDto createUser(UserDto userdto);
	UserDto updateUser(UserDto userDto, Integer userId);
	List<UserDto> getAllUser();
	List<UserDto>getByName(String name);
	
	
}
