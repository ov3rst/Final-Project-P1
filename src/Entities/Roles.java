package Entities;

import java.util.Date;

public class Roles {
	private int roleid;
	private String rolename;
	private Date registrationdate;
	
	public Roles(int roleid, String rolename, Date registrationdate) {
		this.roleid = roleid;
		this.rolename = rolename;
		this.registrationdate = registrationdate;
	}

	public int getRoleid() {
		return roleid;
	}

	public String getRolename() {
		return rolename;
	}

	public Date getRegistrationdate() {
		return registrationdate;
	}
}
