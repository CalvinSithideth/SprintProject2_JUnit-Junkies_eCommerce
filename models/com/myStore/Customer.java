package com.myStore;

public class Customer {
	private int customerID;
	private String name;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private String zipCode;
	private String Email;
	private String phoneNumber;
	private String billingInfo;
	public Customer(int customerID, String name, String addressLine1, String addressLine2, String city, String state,
			String zipCode, String email, String phoneNumber, String billingInfo)
	{
		this.customerID = customerID;
		this.name = name;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		Email = email;
		this.phoneNumber = phoneNumber;
		this.billingInfo = billingInfo;
	}

	public int getCustomerID()
	{
		return customerID;
	}

	public void setCustomerID(int customerID)
	{
		this.customerID = customerID;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getAddressLine1()
	{
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1)
	{
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2()
	{
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2)
	{
		this.addressLine2 = addressLine2;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public String getState()
	{
		return state;
	}

	public void setState(String state)
	{
		this.state = state;
	}

	public String getZipCode()
	{
		return zipCode;
	}

	public void setZipCode(String zipCode)
	{
		this.zipCode = zipCode;
	}

	public String getEmail()
	{
		return Email;
	}

	public void setEmail(String email)
	{
		Email = email;
	}

	public String getPhoneNumber()
	{
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}

	public String getBillingInfo()
	{
		return billingInfo;
	}

	public void setBillingInfo(String billingInfo)
	{
		this.billingInfo = billingInfo;
	}

	@Override
	public String toString()
	{
		return "Customer [customerID=" + customerID + ", name=" + name + ", addressLine1=" + addressLine1
				+ ", addressLine2=" + addressLine2 + ", city=" + city + ", state=" + state + ", zipCode=" + zipCode
				+ ", Email=" + Email + ", phoneNumber=" + phoneNumber + ", billingInfo=" + billingInfo + "]";
	}
}
