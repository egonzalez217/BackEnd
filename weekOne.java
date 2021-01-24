package miscellaneous;
public class weekOne {

public static void main(String[] args) 
	{
		int itemPrice = 7663;
		int money = 9000;
		int numberOfFriends = 220;
		int ageInYears = 22;
		String firstName = "Emilio";
		String lastName = "Gonzalez";
		char middleInitial = 'H';
		
		int newMoney = money - itemPrice;
		int friendsPerYear = numberOfFriends / ageInYears;
		String fullName = firstName + " " + middleInitial + " " + lastName;
		
		System.out.println("Price of the item: " + itemPrice);
		System.out.println("Current Balance: " + money);
		System.out.println("Number of Friends: " + numberOfFriends);
		System.out.println("Age in Years: " + ageInYears);
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Middle Initial: " + middleInitial);
		System.out.println("Total Money After Purchase: " + newMoney);
		System.out.println("Friends Made Per Year Alive: " + friendsPerYear);
		System.out.println("Full Name: " + fullName);
	}

}
