// Question below the program

import java.util.Scanner;
class BankAccount{
	private long accountNumber ;
	private double balance;
	
	//Setters
	public void setAccountNumber (long accountNumber){
		this.accountNumber = accountNumber;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	
	//Getters
	public long getAccountNumber(){
		return this.accountNumber;
	}
	public double getBalance(){
		return this.balance;
	}
	
	public void deposit(double deposit){
		
		
		//this.balance = ;
		setBalance(getBalance() + deposit);
		checkBalance();
	}
	
	public void withdraw(double withdraw){
		if (getBalance() >= withdraw){
		setBalance(getBalance() - withdraw);}
		
		else {
			System.out.println("Invalid Input!!");
		}
		
		checkBalance();
	}
	
	public void checkBalance(){
		System.out.println();
		System.out.println("Account Number                : " +getAccountNumber());
		System.out.println("Total Amount present 		  : " +getBalance());
		System.out.println();
	}
	
	
}


class Test1804{
	
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account number : ");
		long account = sc.nextLong();
		System.out.println("Enter initial balance :");
		double balance = sc.nextDouble();
		
		
		BankAccount b1 =  new BankAccount();
		b1.setAccountNumber(account);
		b1.setBalance(balance);
		
		System.out.println("1. = Depost Money");
		System.out.println("2. = Withdraw Money");
		System.out.println("3. = Check balance");
		int choice = sc.nextInt();
		
		switch (choice) {
			case 1 :{
				System.out.println("Enter amount to deposit :");
				double deposit = sc.nextDouble();
				b1.deposit(deposit);	
				break;
			}
			case 2 :{
				System.out.println("Enter amount to withdraw :");
				double withdraw = sc.nextDouble();
				b1.withdraw(withdraw);
				break;
			} 
			case 3 :{
				b1.checkBalance();
				break;
			}
			
		}		
	}
}



/*
Create a BankAccount class (BLC Class)

Attributes:

Names	Return Type
accountNumber	
balance	
Access Modifier: private (for all variables)

Implement the following methods:

Setter Methods:

Purpose: Initialize the values of accountNumber and balance.
Method Signatures:
public void setAccountNumber(int accountNumber)
public void setBalance(double balance)
Getter Methods:

Purpose: Retrieve the values of accountNumber and balance.
Method Signatures:
public int getAccountNumber()
public double getBalance()
deposit() Method:

Purpose: Add the specified amount to the balance.
Return Type: void
Access Modifier: public
Parameters:
double amount
Functionality: Use getBalance() to retrieve the current balance, add the
amount, and update the balance using setBalance().
withdraw() Method:

Purpose: Subtract the specified amount from the balance if sufficient
funds are available.
Return Type: void
Access Modifier: public
Parameters:
double amount
Functionality: Use getBalance() to retrieve the current balance, 
subtract the amount if sufficient, and update the balance using setBalance().
checkBalance() Method:

Purpose: Print the current balance.
Return Type: void
Access Modifier: public
Parameters: None
Functionality: Use getBalance() to retrieve and print the balance.
transfer() Method:

Purpose: Transfer money between two accounts if sufficient funds are available.
Return Type: void
Access Modifier: public static
Parameters:
BankAccount sourceAccount
BankAccount destinationAccount
double amount
Functionality: Use withdraw() on the source account and deposit() on 
the destination account, after verifying sufficient funds in the source
account using getBalance().
Implement a separate Tester class (ELC Class) with a main method to
demonstrate the following scenarios:

Test Case 1:
Scenario: Valid Deposit
Input:
Set accountNumber: 1001
Set initialBalance: 5000.00 using setBalance()
depositAmount: 2000.00
Expected Output:
After depositing, the balance should be updated to 7000.00.
Print the updated balance using checkBalance(): 7000.00.

Test Case 2:
Scenario: Valid Withdrawal
Input:
Set accountNumber: 1002
Set initialBalance: 8000.00 using setBalance()
withdrawAmount: 3000.00
Expected Output:
After withdrawal, the balance should be updated to 5000.00.
Print the updated balance using checkBalance(): 5000.00.

Test Case 3:
Scenario: Invalid Withdrawal (Insufficient Funds)
Input:
Set accountNumber: 1003
Set initialBalance: 1500.00 using setBalance()
withdrawAmount: 2000.00
Expected Output:
Print an error message indicating insufficient funds (e.g., "Insufficient funds. Withdrawal failed.").
Balance remains 1500.00.

Test Case 4:
Scenario: Checking Balance
Input:
Set accountNumber: 1004
Set initialBalance: 2500.00 using setBalance()
Expected Output:
Print the current balance using checkBalance(): 2500.00.

Test Case 5:
Scenario: Valid Transfer Between Two Accounts
Input:
Set Source Account: 1005, Balance: 10000.00 using setBalance()
Set Destination Account: 1006, Balance: 5000.00 using setBalance()
transferAmount: 3000.00
Expected Output:
After transfer, the source account balance should be updated to 7000.00.
Destination account balance should be updated to 8000.00.
Print the updated balances using checkBalance():
Source Account Balance: 7000.00
Destination Account Balance: 8000.00.

Test Case 6:
Scenario: Invalid Transfer (Insufficient Funds)
Input:
Set Source Account: 1007, Balance: 2000.00 using setBalance()
Set Destination Account: 1008, Balance: 3000.00 using setBalance()
transferAmount: 4000.00
Expected Output:
Print an error message indicating insufficient funds for transfer 
(e.g., "Insufficient funds. Transfer failed.").
Source account balance remains 2000.00.
Destination account balance remains 3000.00.
*/



// Question is below the program
class Statistics {
	int size;
	private int []data;
	
	public void setData(Scanner sc){
		data = new int[size];
		System.out.println("Enter "+size+ " elements" );
		for(int i = 0; i < data.length; i++){
			data[i] = sc.nextInt();
		}
	}
	
	public int[] getData(){
		return data;
	}
	
	
	public int[] findEvenNumber(){
		int  count =0;
		for (int i = 0; i< data.length; i++){
			if (data[i] % 2 == 0){
				count++;
			}
		}		
		int [] evenData = new int[count];
		count = 0;
		for (int i = 0; i< data.length; i++){
			if (data[i] % 2 == 0){
				evenData[count] = data[i];
				count++;
			}
		}
		return evenData;
	}
	
}

class TestArray{
	
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		Statistics st = new Statistics();
		
		
		System.out.println("Enter the size of an array");
		st.size = sc.nextInt();
		st.setData(sc);
		
		int []result = st.getData();
		for (int num : result){
			System.out.print(num+ "  ");
		}
			
		System.out.println();			
		System.out.println("Even numbers in Array : ");			
		int []even = st.findEvenNumber();
		for (int num : even){
			System.out.print(num+ "  ");
		}
		
		
		
	}
}

/*
Understanding Methods with Array Return Type
Create a Statistics class (BLC Class)
Attributes:

Names	Return Type
data	
Access Modifier: private

Implement the following methods:

Setter Method:

Purpose: Initialize the value of data.
Method Signature:
public void setData(int[] data)
Getter Method:

Purpose: Retrieve the value of data.
Method Signature:
public int[] getData()
findEvenNumbers() Method (Array Return Type):

Purpose: Find and return all even numbers from data.
Return Type: int[]
Access Modifier: public
Parameters: None
Functionality: Iterate through data, extract even numbers, and return them in a new array.
Implement a separate Tester class (ELC Class) with a main method to demonstrate the following scenarios:

Test Case 1:
Scenario: Valid Even Numbers Extraction

Input:
Set data: {1, 2, 3, 4, 5, 6} using setData()
Expected Output:
The array of even numbers should be {2, 4, 6}.
Print the result of findEvenNumbers(): {2, 4, 6}.
*/


// Question below the program
class Rectangle {
	private double length;
	private double width;
	
	public void setLength(double length){
		this.length = length;
		
	}
	public void setWidth(double width){
		this.width = width;
		
	}
	public double getLength(){
		return length;
		
	}
	public double getWidth(){
		return width;
		
	}
	public double area(){
		return length * width;
	}
	public double perimeter(){
		return 2 * (length + width);
	}
	
}

class TestRectangle{
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		Rectangle rec = new Rectangle();
		
		System.out.println("Enter the length : ");
		rec.setLength(sc.nextDouble());
		
		System.out.println("Enter the Width : ");
		rec.setWidth(sc.nextDouble());
		
		System.out.println("Area of rectangle of length :"+rec.getLength()+ " and width : "+rec.getWidth()+ " is " +rec.area());
		
		System.out.println("Perimeter of rectangle of length :"+rec.getLength()+ " and width : "+rec.getWidth()+ " is " +rec.perimeter());
		
		
		
	}
}

/*
Understanding Methods with Primitive Data Type Return Type
Create a Rectangle class (BLC Class)
Attributes:

Names	Return Type
length	
width	
Access Modifier: private

Implement the following methods:

Setter Methods:

Purpose: Initialize the values of length and width.
Method Signatures:
public void setLength(double length)
public void setWidth(double width)
Getter Methods:

Purpose: Retrieve the values of length and width.
Method Signatures:
public double getLength()
public double getWidth()
calculateArea() Method (Primitive Return Type):

Purpose: Calculate and return the area of the rectangle.
Return Type: double
Access Modifier: public
Parameters: None
Functionality: Calculate the area using length and width (area = length * width) and return the result.
calculatePerimeter() Method (Primitive Return Type):

Purpose: Calculate and return the perimeter of the rectangle.
Return Type: double
Access Modifier: public
Parameters: None
Functionality: Calculate the perimeter using length and width (perimeter = 2 * (length + width)) and return the result.
Implement a separate Tester class (ELC Class) with a main method to demonstrate the following scenarios:

Test Case 1:
Scenario: Valid Area Calculation

Input:
Set length: 5.0 using setLength()
Set width: 3.0 using setWidth()
Expected Output:
The area should be 15.0.
Print the result of calculateArea(): 15.0.
Test Case 2:
Scenario: Valid Perimeter Calculation

Input:
Set length: 5.0 using setLength()
Set width: 3.0 using setWidth()
Expected Output:
The perimeter should be 16.0.
Print the result of calculatePerimeter(): 16.0.
*/

