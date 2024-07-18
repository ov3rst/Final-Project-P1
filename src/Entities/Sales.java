package Entities;

import java.util.Date;

public class Sales {
	private int saleid;
	private User user;
	private String clientname;
	private int identificationcard;
	private String invoicenumber;
	private double amountpaid, changeamount, totalamount;
	private Date registrationdate;
	
	public Sales(int saleid, User user, String clientname, int identificationcard, String invoicenumber,
			double amountpaid, double changeamount, double totalamount, Date registrationdate) {
		this.saleid = saleid;
		this.user = user;
		this.clientname = clientname;
		this.identificationcard = identificationcard;
		this.invoicenumber = invoicenumber;
		this.amountpaid = amountpaid;
		this.changeamount = changeamount;
		this.totalamount = totalamount;
		this.registrationdate = registrationdate;
	}

	public int getSaleid() {
		return saleid;
	}

	public User getUser() {
		return user;
	}

	public String getClientname() {
		return clientname;
	}

	public int getIdentificationcard() {
		return identificationcard;
	}

	public String getInvoicenumber() {
		return invoicenumber;
	}

	public double getAmountpaid() {
		return amountpaid;
	}

	public double getChangeamount() {
		return changeamount;
	}

	public double getTotalamount() {
		return totalamount;
	}

	public Date getRegistrationdate() {
		return registrationdate;
	}
}
