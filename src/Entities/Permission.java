package Entities;

import java.util.Date;

public class Permission {
	private int permissionid;
	private Roles rol;
	private String permissionName;
	private Date registrationdate;
	
	public Permission(int permissionid, Roles rol, String permissionName, Date registrationdate) {
		super();
		this.permissionid = permissionid;
		this.rol = rol;
		this.permissionName = permissionName;
		this.registrationdate = registrationdate;
	}

	public int getPermissionid() {
		return permissionid;
	}

	public Roles getRol() {
		return rol;
	}

	public String getPermissionName() {
		return permissionName;
	}

	public Date getRegistrationdate() {
		return registrationdate;
	}
	
	
}
