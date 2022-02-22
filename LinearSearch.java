import java.util.Scanner;
class LinearSearch{
	static int search(int[] arr, int key){
		int i;
		for(i=0; i<arr.length; i++){
			if(arr[i] == key){
				return i;	
			}
		}
		if(i >= arr.length){
			return -1;
		}
		return -1;
	}
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter size of the Array: ");
		int size = s.nextInt();
		int[] data = new int[size];
		for(int i=0; i<data.length; i++){
			System.out.print("Enter no - " + i + " : ");
			data[i] = s.nextInt();
		}	
		int element;
		System.out.println("1. Enter element to search.");
		System.out.println("0. Exit.");
		int input = s.nextInt();
		while(input != 0){
			
			switch(input){
				case 1:
					System.out.print("Enter element to search : ");
					element = s.nextInt();
					if(index == -1){
						System.out.println("Element " + element + " not found!");
					}
					else{
						System.out.println("Index of the element " + element + " is : " + index);
						System.out.println("Position of the element " + element + " is : " + (++index));
					}
					break;
				case 0:
					System.out.println("Exit.");
					System.exit();
					break;
			}
		}
	}
}
