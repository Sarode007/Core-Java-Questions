import java.util.Scannerl;
class SwiggyAcc{
	
	private long mobileNumber;
	private Address address;  // HAS- A address
	
}

class Address{
	String buildingName;
	int block;
	int floorNo;
	int roomNo;
	String locality;
	String state;
	int pincode;
	
}
class TestApp{
	public static void main(String []args){
		System.out.println("Welcome to Swiggy");
		SwiggyAcc  sw = new SwiggyAcc();
		Adress 
	}
}
/*
User ddefined Coonstructor:
	> Constructor created by the developer is  called as user defined constructor.
	> User defined constructor is generally used to initialize the instance variables.
	> If the user defined constructor is parameterized then it means developer is forcing the user to initialize the instance variables during object creation.
	  If user will not initialize by passing comatible arguments then it will lead to comnpile time error.
*/