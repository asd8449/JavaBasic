package array;

public class Array04 {

	public static void main(String[] args) {
		int rows = 2, columns = 3;
		int[][] fistMatrix = { { 2, 3, 4 }, { 3, 2, 1 } };
		int[][] secondMatrix = { { 1, 2, 3 }, { -4, -2, 1 } };

		int[][] sum = new int[rows][columns];
		System.out.print("두 행렬의 합 :\n ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				sum[i][j] = fistMatrix[i][j] + secondMatrix[i][j];
				System.out.printf("%d   ", sum[i][j]);
			}
			System.out.println();
		}

	}

}