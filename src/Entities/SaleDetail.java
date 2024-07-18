package Entities;

public class SaleDetail {
	private int saledetailid;
	private Sales sales;
	private Products product;
	private double saleprice;
	private int amount;
	private double totalamount;
	
	public SaleDetail(int saledetailid, Sales sales, Products product, double saleprice, int amount,
			double totalamount) {
		this.saledetailid = saledetailid;
		this.sales = sales;
		this.product = product;
		this.saleprice = saleprice;
		this.amount = amount;
		this.totalamount = totalamount;
	}

	public int getSaledetailid() {
		return saledetailid;
	}

	public Sales getSales() {
		return sales;
	}

	public Products getProduct() {
		return product;
	}

	public double getSaleprice() {
		return saleprice;
	}

	public int getAmount() {
		return amount;
	}

	public double getTotalamount() {
		return totalamount;
	}
}
