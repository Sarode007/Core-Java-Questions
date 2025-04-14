/*
You are developer and you got a project in which client has asked to develop
a payment application. This application will be embedded into the e-commerce
domain like Flipkart,Amazon,SnapDeal,Meesho,AJIO,Myntra,AliBaba etc.
Earlier days e-commerce platforms were having option to make payment.
Payment was getting done only using card or COD.
Your job is to redesign the complete application module to let the users
make payments in various ways:
- card,COD,UPI,net banking,payLater.

*/

import java.util.Scanner;
class Payment{
	
	// for returning amount to pay...
	public static double amount(){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount to pay : ");
		double amount = sc.nextDouble();
		return amount;
	}
	
	
	
	//Card payment logic Starts...
	public static void pay(Card c){
				
		// Verifing card is valid or not =>
		long digit =0l;
		int count =0;
		do {
			digit = c.cardNo % 10;
			count++;
			c.cardNo = c.cardNo / 10;
		}while(c.cardNo != 0);
		
		// leaving card expiry date for later
		
		if (count == 16 && c.cvv > 99 && c.cvv <= 999){
			System.out.println("card accepted");
			
			// Checking OTP with Math.random() method =>
			
			if (Otp.otp()){
				System.out.println("Valid OTP");	
				System.out.println("Payment done Successfully, You paid : rs." +c.amount);
			}
			else {
			System.out.println("Invalid OTP");
		    }
						
		}
		else {
			System.out.println("Invalid card details ");
		}
	}
	// Card logic over...
	
	// UPI logic starts..
	public static void pay(UPI u){
		if (u.upiId.endsWith("@ybl") || u.upiId.endsWith("@axl") )
		{
			if (u.pin > 999 && u.pin <= 9999){
				System.out.println("Payment done Successfully, You paid : rs."+u.amount);
			}
			else {
				System.out.println("Invalid Pin!!");
			}
		}
		else {
			System.out.println("Invalid UPI Id!!");
		}
	}
	// UPI logic over...
	
	// Cash On Delivery logic starts...
	
	public static void pay(CashOnDelivery cs){
		if (cs.valid){
			System.out.println("Payment done Successfully, You paid : rs."+cs.amount);
		}
		else {
			System.out.println("scammer saale Asli note laa => JHAAPAD!!");
		}
	}
	//Cash On Delivery logic over...
	
	// Net banking logic starts...
	public static void pay(NetBanking net){
		double amount = amount();
		if (Otp.otp()){
			System.out.println("Payment done Successfully, You paid : rs."+amount);
		}
		else {
			System.out.println("Invalid otp, payment failed!!");
		}
		
	}
	
		
}// Payment class over...

class NetBanking {
	String bankName;
	long mobileNo;
	String userId, password;
	

	
	public void setDetails(NetBanking net){
	Scanner sc = new Scanner(System.in);		
		
	System.out.println("Enter your User id :");
	net.userId = sc.nextLine();
	
	System.out.println("Enter password :");
	net.password = sc.nextLine();
	

	if ( login (upiId, password)){
		
	System.out.println("Enter Bank Name : ");
	net.bankName = sc.nextLine();
		
	System.out.println("Enter Mobile No. :");
	net.mobileNo = sc.nextLong();
	
	
	Payment.pay(net);
	}
	else {
		System.out.println("Invalid credentials, Try again");
	}
	}
	
	public boolean login(String userId, string password){
		
	if ("Mayur".equals(net.userId) && "Mayur123".equals(net.password) && Otp.otp()){
		System.out.println("Welcome to Jhatu Bank please fill the details");
		return true;
	}
	else {
		
		return false;
		}
	}

}

class CashOnDelivery{
	boolean valid;
	long mobileNo;
	double amount;
	
	public void setDetails(CashOnDelivery cs, Address adrs){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Mobile No. :");
	cs.mobileNo = sc.nextLong();
	
	adrs.setAddress();	
	cs.amount = Payment.amount();

	System.out.println("Is cash valid [true/false] :");
	cs.valid = sc.nextBoolean();
	
	Payment.pay(cs);
	}
	
}


class UPI{
	String upiId;
	int pin;
	double amount;
	
	public void setDetails(UPI u){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UPI Id : ");
		u.upiId = sc.nextLine();
		
		u.amount = Payment.amount();
		
		System.out.println("Enter Pin");
		u.pin = sc.nextInt();

		Payment.pay(u);
		

	}
	
}



class Card {
	
	String cardHolderName;
	long cardNo;
	int cvv;
	String date;  // not taking date for now
	int OTP;
	double amount;
	
	
	public void setDetails(Card c){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter card holder name : ");
		c.cardHolderName = sc.nextLine();
		System.out.println("Enter card no. : ");
		c.cardNo = sc.nextLong();
		System.out.println("Enter cvv");
		c.cvv = sc.nextInt();
		c.amount = Payment.amount();
		Payment.pay(c);
		
	}
	
}


// logic for OTP as it is used in multiple places
class Otp{
	public static boolean otp(){
		int OTP;
		Scanner sc = new Scanner(System.in);
		int rand =(int)(Math.random() * (9999 - 1000 + 1 ) + 1000);   // 1000 to 9999 => 4 digit OTP
		System.out.println("Sending OTP to your linked mobile number :"+rand);
		System.out.println("Enter the OTP : ");
		OTP = sc.nextInt();
		if (rand == OTP){
		return true;	
		}
		else {
		return false;
		}
		
	}
    
}


// taking address from user...
class Address{
	String name;
	int houseNo;
	int pinCode;
	String landmark;
	String country, state, district, city;
	
	public void setAddress(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name : ");
		name = sc.nextLine();
				
		System.out.println("Enter country : ");
		country = sc.nextLine();
		
		System.out.println("Enter State : ");
		state = sc.nextLine();
		
		System.out.println("Enter District : ");
		district = sc.nextLine();
		
		sc.nextLine();
		
		System.out.println("Enter the pincode :");
		pinCode = sc.nextInt();
		
		System.out.println("Enter City/Village : ");
		city = sc.nextLine();
		
		System.out.println("Enter House No. :");
		houseNo = sc.nextInt();
		
		sc.nextLine();

		System.out.println("Enter near by Landmark : ");
		landmark = sc.nextLine();
		
	}
	
	
	
}

class PaymentApp{
	public static void main(String []args){
		
		// creating objects
		Scanner sc = new Scanner(System.in);
		Card debitCard = new Card();
		UPI online = new UPI();
		CashOnDelivery cash = new CashOnDelivery();
		Address adrs = new Address();
		NetBanking net = new NetBanking();
		
		
		// Providing Choice for Payment =>
		System.out.println("Choose the payment method press [1 to 4]");
		System.out.println("1 = Card");
		System.out.println("2 = UPI");
		System.out.println("3 = Net Banking");
		System.out.println("4 = Cash On Delivery ");
		int choice = sc.nextInt();
		
		switch (choice){
			case 1 : debitCard.setDetails(debitCard);
			break;
			case 2 : online.setDetails(online);
			break;
			case 3 : net.setDetails(net);
			break;
			case 4 : cash.setDetails(cash , adrs);
			break;
			default : System.out.println("Invalid choice");
		}
		
	}
	
}


/*
main PaymentApp class

Card =>
	long cardNo;
	String cardHolderName;
	int cvv;
	String date;

UPI => 
	String upiId;
	int pin;
	verifyUpiId();
	verifyPin(int pin);
	
CashOnDelivery => 
	boolean valid;
	class Address();
	
Netbanking =>
	String bankName;
	long mobileNo, accountNo;
	String userId, password;
	login(String userId, string password);
	sendOTP();
	
Address => 
	String name;
	int houseNo;
	int pinCode;
	String landmark;
	String country, state, district;	
*/

