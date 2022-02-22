import java.util.Scanner;
class Hello{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = s.nextLine();
		System.out.println("Your name is " + name);
	}
}
