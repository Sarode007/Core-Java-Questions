import java.util.Scanner;
/*
10-APR-25
Flipkart Order Management System
Problem Statement:
Develop an Order Management System for Flipkart that allows users to place, view, and cancel orders. The system should also track the total number of orders placed.

*/


class Flipkart{
	
	// Variables
	static int totalOrders = 0;
	
	int orderId;
	String productName;
	double price;
	int quantity;
	String status;
	
	// Methods
	
	public static int getTotalOrders(){
		return totalOrders;
	}
	
	public void placeOrder(){
		Scanner sc = new Scanner(System.in);
		
		// Showing Menu
		System.out.println("Choose the Item no. to Order");
		System.out.println("-----------------------------------------");
		System.out.println("1. Pencil  =>  rs.5.0");
		System.out.println("1. Hot Wheels  =>  rs.179.0");
		System.out.println("1. Eraser  =>  rs.5.0");
		System.out.println("1. Brush  =>  rs.30");
		System.out.println("1. Soap  =>  rs.20");
		this.orderId = sc.nextInt();
		
		
		// Switch case according to user choice
		switch (orderId){
			
			case 1: {System.out.println("Enter the Quantity");
					this.quantity = sc.nextInt();
					this.productName = "Pencil";
					this.price = 5.0;
					this.cancelOrders();
					totalOrders += this.quantity;
					
			}
		}
				
		
	}
	
	public double calculateTotalCost(){
		return price * quantity;
	}
	
	public String cancelOrders(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to confirm the order [y/n]");
		char ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y'){
			this.status = "Confirmed";

			this.calculateTotalCost();
			this.displayOrderDetails();
		    return this.status;
			
		}
		else {
			this.status = "Canceled";
			this.displayOrderDetails();
			return this.status;
		}
	}
	
	public void displayOrderDetails(){
		System.out.println();
		System.out.println("Order Id : " +this.orderId);
		System.out.println("Product : "+ this.productName);
		System.out.println("Price : "+ this.price);
		System.out.println("Total Quantity : " +this.quantity);
		System.out.println("Order Status : "+this.status);
		System.out.println("total cost : "+(this.price * this.quantity));
		System.out.println();
	}
	
	
	public static void main(String []args){
		
		// Creating Objects

		Flipkart f1 = new Flipkart();
		Flipkart f2 = new Flipkart();
		Flipkart f3 = new Flipkart();
		Flipkart f4 = new Flipkart();
		
		f1.placeOrder();
		
		
		
	}
}