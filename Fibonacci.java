import java.util.Scanner;
class Fibonacci {
	public static void main(String args[]){
		Scanner S = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = S.nextInt();
		int n1=1,n2=1,sum=0,temp;
		temp = num;		
		System.out.println(n1);
		System.out.println(n2);
		
		while(temp > 0){
			sum = n1 + n2;
			System.out.println(sum);
			n1 = n2;
			n2 = sum;
			temp--;		
		}
	}
}