package com.sinky.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinky.dao.DbUtil;
import com.sinky.dao.inter.IUserDao;
import com.sinky.entity.UserDto;
import com.sinky.service.UserService;


@Service("userService") 
public class UserServiceImp implements UserService {

	
	private DbUtil dbUtil ;
	
	public UserDto getUser(int id) {
        IUserDao udao =dbUtil.getMapper(IUserDao.class);
        UserDto u = udao.getUserById(id);
		return u;
	}
	
	public List<UserDto> getAllUser()
	{
		IUserDao udao =dbUtil.getMapper(IUserDao.class);
		List<UserDto> list = udao.getAllUser();
		return list;
	}
	
	public UserDto getUserByName(String name)
	{
		IUserDao udao =dbUtil.getMapper(IUserDao.class);
		UserDto u = udao.getUserByName(name);
		return u;
	}
	
	@Autowired
	public void setDbUtil(DbUtil dbUtil) {
		this.dbUtil = dbUtil;
	}
	
	

}
