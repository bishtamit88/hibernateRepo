package com.amit.dao;

import com.amit.bean.LoginBean;

public interface AccountDao {
	
	public void authenticateUser(LoginBean loginBean);

}
