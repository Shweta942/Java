import java.util.Scanner;
class Matrix{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);

		// Matrix-A
		System.out.print("Enter no. of row for Matrix-A: ");
		int rowA = s.nextInt();
		System.out.print("Enter no. of column for Matrix-A: ");
		int colA = s.nextInt();
		int[][] matA = new int[rowA][colA];

		// Taking values of Matrix-A
		for(int i=0; i<rowA; i++){
			for(int j=0; j<colA; j++){
				System.out.print("Position: " + i + j + " = ");
				matA[i][j] = s.nextInt();
			}
		}

		// Printing Matrix-A
		for(int i=0; i<rowA; i++){
			for(int j=0; j<colA; j++){
				System.out.print(matA[i][j] + " ");
			}
			System.out.println();
		}
		
		// Matrix-B
		System.out.print("Enter no. of row for Matrix-B: ");
		int rowB = s.nextInt();
		System.out.print("Enter no. of column for Matrix-B: ");
		int colB = s.nextInt();
		int[][] matB = new int[rowB][colB];

		// Taking values of Matrix-B
		for(int i=0; i<rowB; i++){
			for(int j=0; j<colB; j++){
				System.out.print("Position: " + i + j + " = ");
				matB[i][j] = s.nextInt();
			}
		}

		// Printing Matrix-B
		for(int i=0; i<rowB; i++){
			for(int j=0; j<colB; j++){
				System.out.print(matB[i][j] + " ");
			}
			System.out.println();
		}

		// Declaring Result Matrix.
		int resRow = (rowA > rowB) ? rowA : rowB;
		int resCol = (colA > colB) ? colA : colB;

		int[][] resMat = new int[resRow][resCol];

		// Initializaion Result Matrix to '0'
		for(int i=0; i<resRow; i++){
			for(int j=0; j<resCol; j++){
				resMat[i][j] = 0;
			}
			System.out.println();
		}

		// Calculating Matrix Multiplication
		for(int i=0; i<resRow; i++){
			for(int j=0; j<resCol; j++){
				for(int k=0; k<resCol; k++){
					resMat[i][j] = resMat[i][k] + resMat[j][k];
				}
			}
		}

		for(int i=0; i<resRow; i++){
			for(int j=0; j<resCol; j++){
				System.out.print(resMat[i][j]);
			}
			System.out.println();
		}
	}
}
