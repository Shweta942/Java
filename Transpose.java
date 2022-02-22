import java.util.Scanner;
class Transpose{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter row of matrix: ");
		int row = s.nextInt();
		System.out.print("Enter column of matrix: ");
		int col = s.nextInt();
		
		int[][] mat = new int[row][col];

		// Taking values of matrix elements from the user.
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				System.out.print("Enter element-" + i + j + ": ");	
				mat[i][j] = s.nextInt();
			}
		}

		// Tranpose of matrix
		int[][] resMat = new int[row][col];
	
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				resMat[i][j] = mat[j][i];
			}
		}
	
		// Printing the result matrix.
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				System.out.print(resMat[i][j] + " ");	
			}
			System.out.println();
		}
	}
}
