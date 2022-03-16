package com.onlinegasbooking.serviceImplementation;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.onlinegasbooking.entity.Login;
import com.onlinegasbooking.repository.LoginRepository;
import com.onlinegasbooking.service.LoginService;


/********************************************************************************************  
 *     @author  Sneha Soni
 *     Description : It is a service implementation class that provides the services for adding new User ,
 *     deleteUser , getting user by Id 
 * 
 ********************************************************************************************** */

@Service
public class LoginServiceImplementation implements LoginService{
	@Autowired
	private LoginRepository loginRepository;
	
	 /*****************************************************************************************
	  * Method :  addUser
	  * Description : To add user .
	  *               Used inbuilt save() method to add user 
	  *  @param useradd : User that must be added  
	  *  @returns : Newly  added User Record         
	  * 
	  ****************************************************************************************/
	
	 
	 public Login addUser(Login useradd) {
			return loginRepository.save(useradd);
		}
	 
	 
	 /*****************************************************************************************
	  * Method :  deleteUserById
	  * Description : To delete user .
	  *               Used inbuilt delete() method to delete user 
	  *  @param userId : user that must be added            
	  *  @returns : Message User Record is deleted successfully 
	  ****************************************************************************************/
	
	 
	  public String deleteUserById(Login userId) {
		 loginRepository.delete(userId);
		 return "User record is deleted successfully" ;
		 
	}
	  
	  /*****************************************************************************************
		  * Method :  getUserById
		  * Description : To get user by id  .
		  *               Used to getUserById
		  *  @param userId : user that must be added            
		  *  @returns : A user's detail that has been fetched by id 
		  ****************************************************************************************/
	 
	 
	 public Login getUserById(Integer userId) {
			return loginRepository.findById(userId).get();
		}
           
	 
	 /*****************************************************************************************
	  * Method :  getAllUser
	  * Description : To get all User   .
	  *               Used to getAllUser
	  *            
	  * 
	  ****************************************************************************************/
	 

	 public List<Login> getAllUser(){
			return loginRepository.findAll();
		}

}
