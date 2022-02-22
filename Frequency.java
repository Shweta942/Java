import java.util.Scanner;
class Frequency{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number to find frequency: ");
		int num = s.nextInt();
		int[] count = new int[10];
		for(int i=0; i<count.length; i++){
			count[i] = 0;
		}
		while(num != 0){
			int lastNum = num % 10;
			count[lastNum]++;
			num /= 10;
		}
		for(int i=0; i<count.length; i++){
			if(count[i] != 0){
				System.out.println(i + " number repeated " + count[i] + " times.");
			}
		}
	}
}
