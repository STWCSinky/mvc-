package com.sinky.service;

import java.util.List;

import com.sinky.entity.UserDto;

public interface UserService {
  public UserDto getUser(int id);
  public List<UserDto> getAllUser();
  public UserDto getUserByName(String name);
}
