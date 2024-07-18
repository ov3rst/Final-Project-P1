package Entities;

import java.sql.Date;

public class Supplier {
	private int supplierid;
	private String businessname;
	private int rnc, phone;
	private String email;
	private Date registrationdate;
	
	public Supplier(int supplierid, String businessname, int rnc, int phone, String email, Date registrationdate) {
		this.supplierid = supplierid;
		this.businessname = businessname;
		this.rnc = rnc;
		this.phone = phone;
		this.email = email;
		this.registrationdate = registrationdate;
	}

	public int getSupplierid() {
		return supplierid;
	}

	public String getBusinessname() {
		return businessname;
	}

	public int getRnc() {
		return rnc;
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
