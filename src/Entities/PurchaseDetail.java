package Entities;

import java.util.Date;

public class PurchaseDetail {
	private int purchasedetailid;
	private Shopping shopping;
	private Products product;
	private double purchaseprice, saleprice;
	private int amount;
	private Date registrationdate;
	
	public PurchaseDetail(int purchasedetailid, Shopping shopping, Products product, double purchaseprice,
			double saleprice, int amount, Date registrationdate) {
		super();
		this.purchasedetailid = purchasedetailid;
		this.shopping = shopping;
		this.product = product;
		this.purchaseprice = purchaseprice;
		this.saleprice = saleprice;
		this.amount = amount;
		this.registrationdate = registrationdate;
	}

	public int getPurchasedetailid() {
		return purchasedetailid;
	}

	public Shopping getShopping() {
		return shopping;
	}

	public Products getProduct() {
		return product;
	}

	public double getPurchaseprice() {
		return purchaseprice;
	}

	public double getSaleprice() {
		return saleprice;
	}

	public int getAmount() {
		return amount;
	}

	public Date getRegistrationdate() {
		return registrationdate;
	}
}
