package com.onlinegasbooking.service;

import java.util.List;
//import java.util.Map;




import com.onlinegasbooking.entity.Login;

public interface LoginService {

	

	public Login addUser(Login useradd);
	public Login getUserById(Integer userId);
	public String deleteUserById(Login userId);	
	public List<Login> getAllUser();
	
	

}
