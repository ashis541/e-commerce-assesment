/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learn.ecommerce.model;

import java.util.ArrayList;
import java.util.List;




public class Order {

	private int orderId;
	
	private List<Cart> cartItems = new ArrayList<>();

	private String customerName;
	private String customerEmail;
	private String customerMobileNo;
	private String customerState;
	private String customerCity;
	private int customerPincode;
	private String customerAddress;

	
	public Order() {

	}

	public Order(List<Cart> cartItems, String customerName, String customerEmail, String customerMobileNo,
			String customerState, String customerCity, int customerPincode, String customerAddress) {

		this.cartItems = cartItems;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerMobileNo = customerMobileNo;
		this.customerState = customerState;
		this.customerCity = customerCity;
		this.customerPincode = customerPincode;
		this.customerAddress = customerAddress;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public List<Cart> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<Cart> cartItems) {
		this.cartItems = cartItems;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerMobileNo() {
		return customerMobileNo;
	}

	public void setCustomerMobileNo(String customerMobileNo) {
		this.customerMobileNo = customerMobileNo;
	}

	public String getCustomerState() {
		return customerState;
	}

	public void setCustomerState(String customerState) {
		this.customerState = customerState;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

	public int getCustomerPincode() {
		return customerPincode;
	}

	public void setCustomerPincode(int customerPincode) {
		this.customerPincode = customerPincode;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", cartItems=" + cartItems + ", customerName=" + customerName
				+ ", customerEmail=" + customerEmail + ", customerMobileNo=" + customerMobileNo + ", customerState="
				+ customerState + ", customerCity=" + customerCity + ", customerPincode=" + customerPincode
				+ ", customerAddress=" + customerAddress + "]";
	}

}