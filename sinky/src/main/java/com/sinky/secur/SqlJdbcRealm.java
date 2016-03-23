package com.sinky.secur;

import javax.sql.DataSource;

import org.apache.shiro.realm.jdbc.JdbcRealm;


public class SqlJdbcRealm extends JdbcRealm {

	@Override
	public void setDataSource(DataSource dataSource)
	{
		super.setDataSource(dataSource);
	}
	@Override
	public void setAuthenticationQuery(String authenticationQuery)
	{
		super.setAuthenticationQuery(authenticationQuery);
	}
	@Override
	public void setUserRolesQuery(String userRolesQuery)
	{
		super.setUserRolesQuery(userRolesQuery);
	}
	@Override
	public void setPermissionsQuery(String permissionsQuery)
	{
		super.setPermissionsQuery(permissionsQuery);
	}

}
