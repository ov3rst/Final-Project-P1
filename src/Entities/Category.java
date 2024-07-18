package Entities;

import java.util.Date;

public class Category {
	private int categoryid;
	private String descriptions;
	private Date registrationdate;
	
	public Category(int categoryid, String descriptions, Date registrationdate) {
		super();
		this.categoryid = categoryid;
		this.descriptions = descriptions;
		this.registrationdate = registrationdate;
	}

	public int getCategoryid() {
		return categoryid;
	}

	public String getDescriptions() {
		return descriptions;
	}

	public Date getRegistrationdate() {
		return registrationdate;
	}
}
