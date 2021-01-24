package miscellaneous;
public class labweek1 {

	public static void main(String[] args) 
	{
	
		
		int availablePlaneSeats = 10;
		
		double costOfGroceries = 35.35;
		
		char middleInitial = 'h';
		
		boolean isHotOrNot = true;
		
		String firstName = "Emilio";
		
		String streetAddress = "12345 N Pole Ave";
		
		System.out.println("Available Plane Seats: " + availablePlaneSeats + "\nCost OF Groceries: " + costOfGroceries + "\nMiddle Initial: " +
		middleInitial + "\nIs It Hot Right Now: " + isHotOrNot + "\nFirst Name: " + firstName);
		
		availablePlaneSeats = availablePlaneSeats - 2;
		System.out.println(availablePlaneSeats);
		
		costOfGroceries = costOfGroceries + 2;
		System.out.println(costOfGroceries);
		
		middleInitial = 'Q';
		System.out.println(middleInitial);
		
		isHotOrNot = !isHotOrNot;
		System.out.println(isHotOrNot);
		
		String fullName = firstName + " " + middleInitial + " " + "Washington";
		System.out.println(fullName);
		
		System.out.println("Hi, my name is " + fullName + " and I Live at " + streetAddress);
		
	}

}
  