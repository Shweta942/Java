import java.util.Scanner;
class Pattern{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);	
		System.out.print("Enter a number: ");
		int num = s.nextInt();
		int i=1;
		int sp = num-1;
		while(i<=num && sp>=0){
			for(int k=sp; k>=1; k--){
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
			i++;
			sp--;
		}
		sp++;
		int z = num-1;
		while(z>=1 && sp<=num){
			for(int k=0; k<=sp; k++){
				System.out.print(" ");
			}
			for(int j=z; j>=1; j--){
				System.out.print("*");
			}			
			System.out.println();
			z--;
			sp++;
		}
	}
}
