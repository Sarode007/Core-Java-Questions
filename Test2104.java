/*
Question-1
--------------
Create an Employee class (BLC Class)

Attributes :

names        Return Type
--------        ---------------        
 firstName       :String  
 lastName          :String  
 employeeId     :int  
 salary          :double  
 NoOfProject     :int

Access Modifier : private (for all variables)  

Implement constructors to initialize these properties.

implement calculateSalary() method that will add extra amount in salary based on NoOfProject.

Return Type       : void
Access modifier :public

NoOfProject is more than 5 and less than or equals to 10 then add 5000
NoOfProject is more than 10 and 

less than or equals to    20 then add 10000
NoOfProject is more than 20 then add 15000

Take another class Tester (ELC Class) which is having main method and instantiate the Employee object and execute the methods.

*/

import java.util.Scanner;
class Employee1{
	private String firstName , lastName;
	private int empId, noOfProjects;
	private double salary;
	
	Employee1(String firstName, String lastName, int empId, int noOfProjects , double salary){
		this.firstName = firstName;
		this.lastName = lastName;
		this.empId = empId;
		this.noOfProjects = noOfProjects;
		this.salary = salary;
	}
	
	public void calculateSalary(){
		if (noOfProjects  > 5 && noOfProjects <= 10){
			System.out.println( "Your total Salary including bonus : "+(salary =  salary + 5000));
		}
		else if (noOfProjects  > 10 && noOfProjects <= 20){
			System.out.println( "Your total Salary including bonus : "+(salary =  salary + 10000));
			
		}
		else if (noOfProjects  > 20){
			System.out.println( "Your total Salary including bonus : "+(salary =  salary + 15000));
		}
		else {
			System.out.println( "Your total Salary : "+salary);
		}
	}
}


class Test2104{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Employee1 e1 = new Employee1("Mayur", "Sarode", 1001, 20, 25000 );
		e1.calculateSalary();
		
		
	}
}


/*
Design a Cricket Score Board by using following requirements

Take a Class Batter (Business Logic  Class)

Instance variables:

Names        Return Type
---------    ----------------
name        : String
runs                : int
matches        : int
batting_avg    : float.

Access Modifier :public (for all variables)

 Create a no argument constructor that assigns default values to instance variables.
 Create parameterized constructor that accepts name, runs, matches.

Methods :

Method name    : computeBattingAverage
Access Modifier     : public
Return type        : void

This method should print the batting average of the batter by dividing run with matches.

Input: "Sachin", 18000, 463

Output:
Name: Sachin
Batting_Avg: 38.87689

Note:

a. If runs or matches values are negative print 'Error'.
b. If runs are greater than 0 when matches are 0 print 'Error'.

Method name: getStatistics
Return type: void
This method should print the details of the batter.

Input: "Sachin", 18000, 463

Output:
Name: Sachin
Runs: 18000
Matches: 463
Note:
a. If runs or matches values are negative print 'Error'.
b. If runs are greater than 0 when matches are 0 print 'Error'.

Given a class Testing (ELC Class) that contains main method. Use this class to test your code.

*/

class CricketScore{
	String name ;
	int runs;
	int matches;
	float battingAvg;
	
	CricketScore(){
		name = null;
		runs = 0;
		matches = 0;
		battingAvg = 0.0;	
	}
	
	CricketScore(String name , int runs , int matches){
		this.name =  name ;
		this.runs = runs;
		this.matches = matches;
	}
	
	public void computeBattingAverage(){
		System.out.println("Name : "+name+ "\nBatting Average : " +(runs/matches));
	}
	
}

class Test21041{
	
	public static void main(String [] args){
		CricketScore c1 = new CricketScore("Sachin", 18000, 465);
		c1.computeBattingAverage();
	}
}