package Entities;

import java.util.Date;

public class User {
	private int userid;
	private Roles rol;
	private String fullname;
	private Date birthdate;
	private  int identificationcard;
	private int phone;
	private String email;
	private Date registrationdate;
	
	public User(int userid, Roles rol, String fullname, Date birthdate, int identificationcard, int phone, String email,
			Date registrationdate) {
		super();
		this.userid = userid;
		this.rol = rol;
		this.fullname = fullname;
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
