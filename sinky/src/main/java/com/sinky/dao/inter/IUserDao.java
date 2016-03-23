package com.sinky.dao.inter;

import java.util.List;

import com.sinky.entity.UserDto;

public interface IUserDao {

	public UserDto getUserById(int id);
	
	public UserDto getUserByName(String name);
	
	public List<UserDto> getAllUser();
}
