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
		this.balance = getBalance() - withdraw;
		setBalance(this.balance);}
		
		else {
			System.out.println("Invalid Input!!");
		}
		
		checkBalance();
	}
	
	public void checkBalance(){
		System.out.println();
		System.out.println("Account Number                : " +getAccountNumber());
		System.out.println("Amount after depositing money : " +getBalance());
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
			}
			case 2 :{
				System.out.println("Enter amount to withdraw :");
				double withdraw = sc.nextDouble();
				b1.withdraw(withdraw);
			} 
			
		}
		
		//b1.deposit(deposit);
		//b1.checkBalance();
	}

}