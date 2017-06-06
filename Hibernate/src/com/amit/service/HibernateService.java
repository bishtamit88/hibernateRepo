package com.amit.service;

import com.amit.bean.LoginBean;
import com.amit.dao.AccountDao;

public class HibernateService {

	public static void authenticateUser(LoginBean loginBean)
	{
		AccountDao dao=null;
		dao.authenticateUser(loginBean);
	}
}
