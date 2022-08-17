package com.springboot.first.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.first.app.dto.UserDto;
import com.springboot.first.app.service.UserService;


@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping()
	public ResponseEntity<UserDto> createdUser(@RequestBody UserDto userDto){
		int i=10;
		if(i<15) {
			i=5;
		}
		return new ResponseEntity<UserDto> (userService.createUser(userDto), HttpStatus.OK) ;
		
	}
	@GetMapping
	public ResponseEntity<List<UserDto>> gettingAllUser(){
		return ResponseEntity.ok(userService.getAllUser());
	}
}
