package com.onlinegasbooking.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;



/*****************************************************************
 * @Entity annotation defines that a class can be mapped to a table
 ****************************************************************/
@Entity

/************************************************************************************
 * @Table annotation specifies the name of the database table to be used for mapping.
 * **********************************************************************************/
@Table(name = "egas_login")


public class Login {
 
	/*********************************************************************************
	 * @Id annotation specifies the primary key of an entity 
	 *********************************************************************************/
	@Id
	@Column(name = "user_id")
	private Integer userId;
	
	@NotBlank(message = "Password name can not be null.")
	@Size(min=8 , max=12)
	@Column(name="login_password",length=25)
	private String password;
	
	@NotBlank(message = "Role cannot be Null.")
	@Column(name="login_role",length=25)
	private String role;
	
	@NotBlank
	@Size(min=3 , max=50, message = "User name must contain atleast 3 characters.")
	@Column(name="user_name",length=30)
	private String userName;
    
	
	/*********************************************************************************************************
	 * @OneToOne. annotation declares that a relationship between two entities is one-to-one
	 * Eager will by default load ALL of the relationships related to a particular object loaded by Hibernate.
	 ******************************************************************************************************** */
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cust_id")
	private Customer customer ;

	
	public Login() {
		super();
	}

	public Login(Integer userId, String password, String role, String userName) {
		super();
		this.userId = userId;
		this.password = password;
		this.role = role;
		this.userName = userName;
	}
	
	
	/* @return current customer */
    public Customer getCustomer() {
		return customer;
	}


	/*@param customer to set (Customer customer)*/
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	
	/* @return UserById */
	public Integer getUserId() {
		return userId;
	}
	
	
	/*@param customer to set (Integer userId)*/
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/* @return password */
	public String getPassword() {
		return password;
	}

	/*@param customer to setPassword (String password)*/
	public void setPassword(String password) {
		this.password = password;
	}

	/* @return role */
	public String getRole() {
		return role;
	}

	
	/*@param customer to setRole (String role)*/
	public void setRole(String role) {
		this.role = role;
	}

	/* @return userName */
	public String getUserName() {
		return userName;
	}

	/*@param customer to setUserName(String userName)*/
	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "Login [userId=" + userId + ", password=" + password + ", role=" + role + ", userName=" + userName
				+ ", customer=" + customer + "]";
	}
	
	
	
}
