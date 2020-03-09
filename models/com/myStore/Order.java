package com.myStore;

import java.sql.Date;

public class Order {
	private int orderNumber;
	private int customerID;
	private int shipperID;
	private Date orderDate;
	private String paymentInfo;
	private Date shipDate;
	private String shipper;
	private boolean orderStatus;
	public Order(int orderNumber, int customerID, int shipperID, Date orderDate, String paymentInfo,
			Date shipDate, String shipper, boolean orderStatus) {
		super();
		this.orderNumber = orderNumber;
		this.customerID = customerID;
		this.shipperID = shipperID;
		this.orderDate = orderDate;
		this.paymentInfo = paymentInfo;
		this.shipDate = shipDate;
		this.shipper = shipper;
		this.orderStatus = orderStatus;
	}
	public int getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public int getShipperID() {
		return shipperID;
	}
	public void setShipperID(int shipperID) {
		this.shipperID = shipperID;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getPaymentInfo() {
		return paymentInfo;
	}
	public void setPaymentInfo(String paymentInfo) {
		this.paymentInfo = paymentInfo;
	}
	public Date getShipDate() {
		return shipDate;
	}
	public void setShipDate(Date shipDate) {
		this.shipDate = shipDate;
	}
	public String getShipper() {
		return shipper;
	}
	public void setShipper(String shipper) {
		this.shipper = shipper;
	}
	public boolean getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(boolean orderStatus) {
		this.orderStatus = orderStatus;
	}
	@Override
	public String toString()
	{
		return "Order [orderNumber=" + orderNumber + ", customerID=" + customerID + ", shipperID=" + shipperID
				+ ", orderDate=" + orderDate + ", paymentInfo=" + paymentInfo + ", shipDate=" + shipDate + ", shipper="
				+ shipper + ", orderStatus=" + orderStatus + "]";
	}
}
