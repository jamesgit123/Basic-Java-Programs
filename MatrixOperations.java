import java.util.Scanner;

public class MatrixOperations {

	public void multiply() {
		int m,n,e,r;
		int sum = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter number of rows of first matrix");
		m = in.nextInt();
		System.out.println("Enter number of cols of first matrix");
		n = in.nextInt();
		
		System.out.println("Enter number of rows of second matrix");
		e = in.nextInt();
		System.out.println("Enter number of cols of second matrix");
		r = in.nextInt();
		
		if (n != e) {
			System.out.println("Cannot multiply the 2 matrices");
			System.out.print("Number of cols of first matrix must ");
			System.out.println("equal number of rows of second matrix");
			return;
		}
		
		System.out.println("Enter elements of first matrix");
		int[][] first = new int[m][n];
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				int holdI = i+1;
				int holdJ = j+1;
				System.out.println("Entry at row" + " " + holdI + " " + "column" + " " + holdJ + " is:");
				first[i][j] = in.nextInt();
			}
		}
		
		System.out.println("Enter elements of second matrix");
		int[][] second = new int[e][r];
		
		for (int i = 0; i < e; i++) {
			for (int j = 0; j < r; j++) {
				int holdI = i+1;
				int holdJ = j+1;
				System.out.println("Entry at row" + " " + holdI + " " + "column" + " " + holdJ + " is:");
				second[i][j] = in.nextInt();
			}
		}
		
		int[][] multiply = new int[m][r];
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < r; j++) {
					for (int k = 0; k < e; k++) {
						sum = sum + first[i][k]*second[k][j];
					}
					multiply[i][j] = sum;
					sum = 0;
				}
			}
			
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < r; j++) {
				int holdI = i+1;
				int holdJ = j+1;
				System.out.println("Entry at row" + " " + holdI + " " + "column" + " " + holdJ + " is:");
				System.out.println(multiply[i][j]);
			}
		}
	}
	
	public int determinant(int[][] arr) {
		int result = 0;
		if (arr.length == 1) {
			result = arr[0][0];
			return result;
		}
		if (arr.length == 2) {
			result = arr[0][0] * arr[1][1] - arr[0][1] * arr[1][0];
			return result;
		}
		for (int i = 0; i < arr[0].length; i++) {
			int temp[][] = new int[arr.length - 1][arr[0].length - 1];

			for (int j = 1; j < arr.length; j++) {
				for (int k = 0; k < arr[0].length; k++) {

					if (k < i) {
						temp[j - 1][k] = arr[j][k];
					} else if (k > i) {
						temp[j - 1][k - 1] = arr[j][k];
					}
				}
			}
			result += arr[0][i] * Math.pow(-1, (int) i) * determinant(temp);
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MatrixOperations matrix = new MatrixOperations();
		matrix.multiply();
		int[][] test = new int[3][3];
		for (int i = 0; i < 3; i++ ) {
			for (int j = 0; j < 3; j++ ) {
				test[i][j] = i+j;
			}
		}
		System.out.println(matrix.determinant(test));
	}

}
