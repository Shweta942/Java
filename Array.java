import java.util.Scanner;

class Array{
	// Function to reverse an array.
	static int[] revArray(int[] arr){
		int i,j=0;
		int[] revArray = new int[arr.length];
		for(i=(arr.length-1); i>=0; i++){
			revArray[j] = arr[i];
			j++;
		}
		return revArray;
	}

	// Function to find an element's index and position from an array.
	static int findIndex(int[] arr, int n){
		int i;
		for(i=0; i<arr.length; i++){
			if(n == arr[i]){
				return i;
			}
		}
		if(i>arr.length){
			return -1;
		}
		return -1;
	}

	// Function to find minimum value from an array.
	static int minValue(int[] arr){
		int min = arr[0];
		for(int i=0; i<arr.length; i++){
			if(min > arr[i]){
				min = arr[i];
			}
		}
		return min;

	}

	// Function to do sum of all elements of an array.
	static int sum(int[] arr){
		int ans = 0;
		for(int i=0; i<arr.length; i++){
			ans = ans + arr[i];
		}
		return ans;
	}

	// Function to find maximum value from an array.
	static int maxValue(int[] arr){
		int max = 0;
		for(int i=0; i<arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		return max;
	}
	public static void main(String args[]){
		// Making 'S' object of Scanner class to take input from user.
		Scanner S = new Scanner(System.in);	
		// Declaring array.
		int[] numbers = new int[5];
		// Taking input from user and store it in an array.
		for(int i=0; i<numbers.length; i++){
			System.out.print("Enter number-" + (i+1) + " : ");
			numbers[i] = S.nextInt();
		}
		System.out.println(" ");
		// Printing elements of an array.
		System.out.print("Array of numbers : ");
		for(int i=0; i<numbers.length; i++){
			System.out.print(numbers[i] + " ");
		}
		System.out.println(" ");
		// Finding mim value from an array.
		int minNumber = minValue(numbers);
		System.out.println(minNumber + " is the Minimum number from array.");

		// Finding max value from an array.
		int maxNumber = maxValue(numbers);
		System.out.println(maxNumber + " is the Maximum number from array.");
		System.out.println(" ");	

		// Finding sum of all values of an array.
		int sum = sum(numbers);
		System.out.println("The sum of all values of an array is " + sum);
		System.out.println(" ");

		// Finding an element's index from an array.
		System.out.println("Enter a number to find in an array: ");
		int numberToFind = S.nextInt();
		int index = findIndex(numbers, numberToFind);
		if(index == -1){
			System.out.println("Element not found!");
		}
		else{
			System.out.println("The index of number " + numberToFind + " is " + index);
			System.out.println("The position of number " + numberToFind + " is " + ++index);
		}
		
		// Reversing an array.
		int[] reversedArray = revArray(numbers[]);
		System.out.println("Reveres Array: ");
		for(int i=0; i<=reversedArray.length; i++){
			System.out.print(reversedArray[i] + " ");
		}

	}
}
