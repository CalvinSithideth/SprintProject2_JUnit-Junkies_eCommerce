package com.myStore;

public class Products {
	private int SKU;
	private int CategoryID;
	private int SupplierID;
	private String productName;
	private String productDescription;
	private double unitPrice;
	private double unitWeight;
	private int unitsInStock;
	private int UnitsOnOrder;
	private int ReOrderLevel;

	public Products(int sKU, int categoryID, int supplierID, String productName, String productDescription,
			double unitPrice, double unitWeight, int unitsInStock, int unitsOnOrder, int reOrderLevel) {
		SKU = sKU;
		CategoryID = categoryID;
		SupplierID = supplierID;
		this.productName = productName;
		this.productDescription = productDescription;
		this.unitPrice = unitPrice;
		this.unitWeight = unitWeight;
		this.unitsInStock = unitsInStock;
		UnitsOnOrder = unitsOnOrder;
		ReOrderLevel = reOrderLevel;
	}

	public int getSKU() {
		return SKU;
	}

	public void setSKU(int sKU) {
		SKU = sKU;
	}

	public int getCategoryID() {
		return CategoryID;
	}

	public void setCategoryID(int categoryID) {
		CategoryID = categoryID;
	}

	public int getSupplierID() {
		return SupplierID;
	}

	public void setSupplierID(int supplierID) {
		SupplierID = supplierID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getUnitWeight() {
		return unitWeight;
	}

	public void setUnitWeight(double unitWeight) {
		this.unitWeight = unitWeight;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	public int getUnitsOnOrder() {
		return UnitsOnOrder;
	}

	public void setUnitsOnOrder(int unitsOnOrder) {
		UnitsOnOrder = unitsOnOrder;
	}

	public int getReOrderLevel() {
		return ReOrderLevel;
	}

	public void setReOrderLevel(int reOrderLevel) {
		ReOrderLevel = reOrderLevel;
	}
}
