package assignment;

public class Matrix {

	public static void main(String[] args) {
		int[][] matrix = { {1, 2, 3},{4, 5, 6}, {7, 8, 9} };
		System.out.println("The 3x3 matrix is:");
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println(); 
	    }
	
	}
}


