package Entities;

import java.util.Date;

public class Products {
	private int productid;
	private String code, productname;
	private Category category;
	private int stock;
	private double purchaseprice, saleprice;
	private Date registrationdate;
	
	public Products(int productid, String code, String productname, Category category, int stock, double purchaseprice,
			double saleprice, Date registrationdate) {
		super();
		this.productid = productid;
		this.code = code;
		this.productname = productname;
		this.category = category;
		this.stock = stock;
		this.purchaseprice = purchaseprice;
		this.saleprice = saleprice;
		this.registrationdate = registrationdate;
	}

	public int getProductid() {
		return productid;
	}

	public String getCode() {
		return code;
	}

	public String getProductname() {
		return productname;
	}

	public Category getCategory() {
		return category;
	}

	public int getStock() {
		return stock;
	}

	public double getPurchaseprice() {
		return purchaseprice;
	}

	public double getSaleprice() {
		return saleprice;
	}

	public Date getRegistrationdate() {
		return registrationdate;
	}
}
