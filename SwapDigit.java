// Program to Swap first and last digit of a number.
import java.util.Scanner;
class SwapDigit{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = s.nextInt();
		int temp = num;
		int lastDigit = num % 10;
		int firstDigit = 0;
		while(temp !=0 ){
			firstDigit = temp % 10;
			temp /= 10;
		}
		System.out.println("First digit: " + firstDigit);
		System.out.println("Last digit: " + lastDigit);
		String sNum = Integer.toString(num);
		System.out.println("String: " + sNum);
		char f = sNum.charAt(0);
		char l = sNum.charAt((sNum.length())-1);
		System.out.println("First Character: " + f);
		System.out.println("Last Character: " + l);
		char tempS = f;
		//sNum.charAt(0) = l;
		//sNum.charAt((sNum.length()) - 1) = tempS;
		String newString = sNum.replace(f, l);
		String newS = newString.replace(l, tempS);
		System.out.println("String: " + newS);
	}
}
