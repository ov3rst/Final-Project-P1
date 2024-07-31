package Entities;

import java.util.Date;

public class Employees {

	private int employeeid;
	private String fullname;
	private Date birthdate;
	private int identificationcard;
	private int phone;
	private String email;
	private String position;
	private double salary;
	private Date registrationdate;
	
	public Employees(int employeeid, String fullname, Date birthdate, int identificationcard, int phone, String email, String position, double salary,
			Date registrationdate) {
		this.employeeid = employeeid;
		this.fullname = fullname;
		this.birthdate = birthdate;
		this.identificationcard = identificationcard;
		this.phone = phone;
		this.email = email;
		this.position = position;
		this.salary = salary;
		this.registrationdate = registrationdate;
	}
	
	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	public int getIdentificationcard() {
		return identificationcard;
	}
	public void setIdentificationcard(int identificationcard) {
		this.identificationcard = identificationcard;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Date getRegistrationdate() {
		return registrationdate;
	}
	public void setRegistrationdate(Date registrationdate) {
		this.registrationdate = registrationdate;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	public int getId() {
		return employeeid;
	}
}
