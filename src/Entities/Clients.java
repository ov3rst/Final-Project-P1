package Entities;

import java.util.Date;

public class Clients {
	private int clientid;
	private String fullname;
	private Date birthdate;
	private int identificationcard;
	private int phone;
	private String email;
	private Date registrationdate;
	
	public Clients(int clientid, String fullname, Date birthdate, int identificationcard, int phone, String email,
			Date registrationdate) {
		this.clientid = clientid;
		this.fullname = fullname;
		this.birthdate = birthdate;
		this.identificationcard = identificationcard;
		this.phone = phone;
		this.email = email;
		this.registrationdate = registrationdate;
	}

	public int getClientid() {
		return clientid;
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
