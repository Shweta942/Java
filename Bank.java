import java.util.Scanner;
interface Operation{
	void withdraw(double amount);
	void deposit();
}
class SBI implements Operation{
	Scanner s = new Scanner(System.in);
	static int sbiMoney = 10000;
	public void withdraw(double amount){
		if(amount > sbiMoney){
			System.out.println("Invalid Amount!");
		}
		else{
			sbiMoney -= amount;
		}
	}
	public void deposit(){
		System.out.print("Enter the amount to deposit: ");
		int money = s.nextInt();
		sbiMoney += money;
		System.out.println(money + " added successfully.");
	}
	public void printMoney(){
		System.out.println("Balance: " + sbiMoney);
	}
}
class HDFC implements Operation{
	Scanner s = new Scanner(System.in);
	static int hdfcMoney = 10000;
	public void withdraw(double amount){
		if(amount > hdfcMoney){
			System.out.println("Invalid Amount!");
		}
		else{
			hdfcMoney -= amount;
		}
	}
	public void deposit(){
		System.out.print("Enter the amount to deposit: ");
		int money = s.nextInt();
		hdfcMoney += money;
		System.out.println(money + " added successfully.");
	}
	public void printMoney(){
		System.out.println("Balance: " + hdfcMoney);
	}
}
class Bank{
	public static int mainMenu(){
		Scanner s = new Scanner(System.in);
		int c;
		System.out.println();
		System.out.println("Select Bank:");
		System.out.println("1. SBI");
		System.out.println("2. HDFC");
		System.out.println("0. EXIT");
		System.out.println("=====================");
		System.out.print("Enter your choice: ");
		c = s.nextInt();
		System.out.println();
		if(c < 0 || c > 3){
			System.out.println("Invalid Input.");
			System.out.println("Please try again.");
			c = mainMenu();
		}
		return c;
	}
	public static int subMenu(String bank){
		Scanner s = new Scanner(System.in);
		int c;
		System.out.println();
		System.out.println("=====================");
		System.out.println(bank + " Bank");
		System.out.println("1. Display Balance.");
		System.out.println("2. Deposit");
		System.out.println("3. Withdrawl");
		System.out.println("0. Exit");
		System.out.println("=====================");
		System.out.print("Enter your choice: ");
		c = s.nextInt();
		System.out.println();
		return c;
	}
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		SBI sbi = new SBI();
		HDFC hdfc = new HDFC();
		int mainChoice = mainMenu();
		while(mainChoice != 0){
			switch(mainChoice){
				case 1:
					int choice1 = subMenu("SBI");
					while(choice1 != 0){
						switch(choice1){
							case 1:
								sbi.printMoney();
								choice1 = subMenu("SBI");
								break;
							case 2:
								sbi.deposit();
								choice1 = subMenu("SBI");
								break;
							case 3:
								System.out.print("Enter amount to withdraw: ");
								int sbiA = s.nextInt();
								sbi.withdraw(sbiA);
								choice1 = subMenu("SBI");
								break;
							case 0:
								System.out.println("Exit...");
								choice1 = 0;
								break;
							default:
								System.out.println("Invalid input!");
								System.out.println("Try again.");
								choice1 = subMenu("SBI");
								break;
						}
					}
					break;
				case 2:
					int choice2 = subMenu("HDFC");
					while(choice2 != 0){
						switch(choice2){
							case 1:
								hdfc.printMoney();
								choice2 = subMenu("HDFC");
								break;
							case 2:
								hdfc.deposit();
								choice2 = subMenu("HDFC");
								break;
							case 3:
								System.out.print("Enter amount to withdraw: ");
								int hdfcA = s.nextInt();
								hdfc.withdraw(hdfcA);
								choice2 = subMenu("HDFC");
								break;
							case 0:
								System.out.println("Exit...");
								choice2 = 0;
								break;
							default:
								System.out.println("Invalid input!");
								System.out.println("Try again.");
								choice2 = subMenu("HDFC");
								break;
						}
					}
					break;
				case 0:
					System.out.println("Exit...");
					mainChoice = 0;
					break;
				default:
					System.out.println("Invalid input!");
					System.out.println("Please try again.");
					mainChoice = mainMenu();
					break;
			}
		}	
	}
}
