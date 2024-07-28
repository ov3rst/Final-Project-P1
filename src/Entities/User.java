package Entities;

import java.util.Date;

public class User {
	private int userid;
	private Roles rol;
	private String fullname;
	private String username;
	private String password;
	private Date birthdate;
	private  int identificationcard;
	private int phone;
	private String email;
	private Date registrationdate;
	
	public User(int userid, Roles rol, String fullname, String username, String password, Date birthdate, int identificationcard, int phone, String email,
			Date registrationdate) {
		this.userid = userid;
		this.rol = rol;
		this.fullname = fullname;
		this.username = username;
		this.password = password;
		this.birthdate = birthdate;
		this.identificationcard = identificationcard;
		this.phone = phone;
		this.email = email;
		this.registrationdate = registrationdate;
	}

	public int getUserid() {
		return userid;
	}

	public Roles getRol() {
		return rol;
	}

	public String getFullname() {
		return fullname;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public int getIdentificationcard() {
		return identificationcard;
	}

	public int getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public Date getRegistrationdate() {
		return registrationdate;
	}
	
}
