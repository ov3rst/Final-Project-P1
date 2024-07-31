package Entities;

import java.util.Date;

public class User {
	private int userid;
	private Roles rol;
	private Employees employee;
	private String username;
	private String password;
	private Date registrationdate;
	
	public User(int userid, Roles rol, Employees employye, String username, String password, Date registrationdate) {
		this.userid = userid;
		this.rol = rol;
		this.employee = employye;
		this.username = username;
		this.password = password;
		this.registrationdate = registrationdate;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public Roles getRol() {
		return rol;
	}

	public void setRol(Roles rol) {
		this.rol = rol;
	}

	public Employees getEmployee() {
		return employee;
	}

	public void setEmployee(Employees employee) {
		this.employee = employee;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getRegistrationdate() {
		return registrationdate;
	}

	public void setRegistrationdate(Date registrationdate) {
		this.registrationdate = registrationdate;
	}
	
	
}
