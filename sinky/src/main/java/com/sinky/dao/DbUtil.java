package com.sinky.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DbUtil {

	@Autowired
	private SqlSessionFactory  sessionFactory;
	
	
	
	public <T> T getMapper(Class<T> t)
	{
		SqlSession session = sessionFactory.openSession();
		
		return (T) session.getMapper(t);
	}



	public void setSessionFactory(SqlSessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
	
}
