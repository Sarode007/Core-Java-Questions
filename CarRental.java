/*
Ques - 1
-------------
Car Rental Cost Calculation
You are creating a CarRental (BLC) class for a car rental service.

The class should have the following attributes:
private: carModel (String)
private: rentalDays (int) - the number of days the car is rented.
private: dailyRate (double) - the rate charged per day.
The class should calculate the total rental cost and apply a
discount based on the number of rental days:

Implement below methods:

method name: calculateTotalCost
modifiers: public
return type: double
If rentalDays are greater than 7, apply a 10% discount on the total cost.
Otherwise, no discount is applied. Return the total rental cost from
this method.

Implement public setter methods to initialize each of these attributes.
method name: setCarModel
parameter: String carModel
modifiers: public
return type: void
This method initializes the carModel attribute.

method name: setRentalDays
parameter: String rentalDays
modifiers: public
return type: void
This method initializes the rentalDays attributes.

method name: setDailyRate
parameter: String dailyRate
modifiers: public
return type: void
This method initializes the dailyRate attributes.

Implement public getter methods to retrieve the values of these
attributes.

Create a ELC class CarRentalCalculator
Write a main method to:
Create an instance of the CarRental class.
Initialize the attributes using setters.
Calculate and print the total cost using the calculateTotalCost()
method with car model and rentalDays.

*/

import java.util.Scanner;
class CarRental{

	private int rentalDays;
	private String carModel;
	private double dailyRate;
	
	public double calculateTotalCost(int days, double rate){
		double totalCost = 0.0;
		if (days > 7){
			totalCost = (days * rate) - (days * rate * 0.1);
			return totalCost;
		}
		else {
			totalCost = days * rate;
			return totalCost;
		}		
	}
	
	public void setRentalDays(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total rental days :");		
		rentalDays = sc.nextInt();

	}
		
	public void setDailyRate(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter daily rate :");		
		dailyRate = sc.nextDouble();

	}
			
	public void setCarModel(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter car model :");		
		carModel = sc.nextLine();

	}
	public void getInfo(){
		setCarModel();
		setRentalDays();
		setDailyRate();
		double totalCost = calculateTotalCost(rentalDays, dailyRate);
		
		System.out.println();
		
		System.out.println("Bill => ");
		System.out.println("Car Model         : "+carModel);
		System.out.println("Total rental days : "+rentalDays);
		System.out.println("Rate per day      : "+dailyRate);
		System.out.println("Total bill        : "+totalCost);
		
	}
	
//....
}

class CarRentalCalculator{
		
	public static void main(String []args){
		CarRental c1 = new CarRental();
		//CarRental c2 = new CarRental();
		c1.getInfo();


	}
}
