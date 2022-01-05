import java.util.Scanner;
class QuickSort{
	Scanner S = new Scanner(System.in);
	// Partition function
	static int partition(int[] arr, int low, int high){
		int pivot = arr[high];
		int i = (low-1);
		for(int j=low; j<high; j++){
			if(arr[j] < pivot){
				i++;
				int temp = arr[i+1];
				arr[i+1] = arr[high];
				arr[high] = temp;

			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;

		return i+1;
	}
	// Quick sort function.
	static void sort(int[] arr, int low, int high){
		if(low < high){
		 	int pi = partition(arr, low, high);
			sort(arr, low, pi-1);
			sort(arr, pi+1, high);
		}
	}
	// Function to print array.
	static void print(int[] arr){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
	// main function.
	public static void main(String args[]){
		int[] arr = {10,7,8,4,5,1,3,2,6,9};
		int n = arr.length;
		System.out.println("Initial Array:");
		print(arr);
		sort(arr, 0, n-1);
		System.out.println(" ");
		System.out.println("Sorted Array:");
		print(arr);
	}
}
