package com.springboot.first.app.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.first.app.dto.UserDto;
import com.springboot.first.app.entity.User;
import com.springboot.first.app.repository.UserRepo;
import com.springboot.first.app.service.UserService;

import net.bytebuddy.asm.Advice.This;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepo userRepo;

	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public UserDto createUser(UserDto userdto) {
		User user = this.modelMapper.map(userdto, User.class);
		User savedUser = userRepo.save(user);
		return this.modelMapper.map(savedUser, UserDto.class);
	}

	@Override
	public UserDto updateUser(UserDto userDto, Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDto> getAllUser() {

		List<User> user = userRepo.findAll();
		List<UserDto> userDto = user.stream().map((st) -> this.modelMapper.map(st, UserDto.class)).collect(Collectors.toList());
		return userDto;
		
	}

	@Override
	public List<UserDto> getByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
