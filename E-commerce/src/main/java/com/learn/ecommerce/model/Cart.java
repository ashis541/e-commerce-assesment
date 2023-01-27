package com.learn.ecommerce.model;


public class Cart {


	private int itemId;
	private String itemName;
        private String photo;
	private int itemPrice;
	private int itemQuantity;
	private int itemDiscount;
	private int totalPrice;
	private int finalPrice;

	private Order orders;

	public Cart() {

	}

	public Cart(int itemId, String itemName,String photo, int itemPrice, int itemQuantity, int itemDiscount, int totalPrice,
			int finalPrice) {

		this.itemId = itemId;
		this.itemName = itemName;
                this.photo=photo;
		this.itemPrice = itemPrice;
		this.itemQuantity = itemQuantity;
		this.itemDiscount = itemDiscount;
		this.totalPrice = totalPrice;
		this.finalPrice = finalPrice;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
        
	public String getphoto() {
		return photo;
	}

	public void setphoto(String photo) {
		this.photo = photo;
	}

        
	public int getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	public int getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public int getItemDiscount() {
		return itemDiscount;
	}

	public void setItemDiscount(int itemDiscount) {
		this.itemDiscount = itemDiscount;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(int finalPrice) {
		this.finalPrice = finalPrice;
	}

	public Order getOrders() {
		return orders;
	}

	public void setOrders(Order orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "Cart [itemId=" + itemId + ", itemName=" + itemName + ", itemPrice=" + itemPrice + ", itemQuantity="
				+ itemQuantity + ", itemDiscount=" + itemDiscount + ", totalPrice=" + totalPrice + ", finalPrice="
				+ finalPrice + ", orders=" + orders + "]";
	}

	public int getItemPriceAfterDiscount() {

		

		return this.itemPrice;
	}

}