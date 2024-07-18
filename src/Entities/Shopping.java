package Entities;

import java.util.Date;

public class Shopping {
	private int shoppingid;
	private User user;
	private Supplier supplier;
	private String invoicenumber;
	private double totalamount;
	private Date registrationdate;
	
	public Shopping(int shoppingid, User user, Supplier supplier, String invoicenumber, double totalamount,
			Date registrationdate) {
		this.shoppingid = shoppingid;
		this.user = user;
		this.supplier = supplier;
		this.invoicenumber = invoicenumber;
		this.totalamount = totalamount;
		this.registrationdate = registrationdate;
	}

	public int getShoppingid() {
		return shoppingid;
	}

	public User getUser() {
		return user;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public String getInvoicenumber() {
		return invoicenumber;
	}

	public double getTotalamount() {
		return totalamount;
	}

	public Date getRegistrationdate() {
		return registrationdate;
	}
}
