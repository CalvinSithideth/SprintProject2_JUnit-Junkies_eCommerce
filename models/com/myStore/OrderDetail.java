package com.myStore;

public class OrderDetail {
	int orderNumber;
	int SKU;
	int quantity;
	double salePrice;
	double discount;
	public OrderDetail(int orderNumber, int sKU, int quantity, double salePrice, double discount) {
		this.orderNumber = orderNumber;
		SKU = sKU;
		this.quantity = quantity;
		this.salePrice = salePrice;
		this.discount = discount;
	}
	public int getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	public int getSKU() {
		return SKU;
	}
	public void setSKU(int sKU) {
		SKU = sKU;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
}
