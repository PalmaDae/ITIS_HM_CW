public class Task4 {
	public static int maxElement(int[][] matrix) {
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
		
		return max;
	}
	
	public static void main(String[] args) {
		int[][] matrix = new int[][]{{1,2}, {3,4}, {2,3,4,5}};
		
		System.out.println(maxElement(matrix));
	}
}