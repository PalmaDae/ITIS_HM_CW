public class Turtle {
	public static int turtle(int[][] grid) {
		int length = grid.length;
		
		int[][] coins = new int[length][length];
		
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				if (j == 0 && i == 0) {
					coins[i][j] = grid[i][j];
				} else if (i == 0) {
					coins[i][j] = coins[i][j-1] + grid[i][j];
					
				} else if (j == 0) {
					coins[i][j] = coins[i-1][j] + grid[i][j];
				} else {
					coins[i][j] = Math.max(coins[i-1][j], coins[i][j-1]) + grid[i][j];
				}
			}
		}
		
		return coins[length-1][length-1];
	}

	public static void main(String[] args) {
		int[][] coins = {
			{1, 3, 1, 5, 1, 2},
			{2, 2, 4, 2, 3, 1},	
			{5, 0, 2, 3, 0, 2},
			{0, 6, 1, 2, 4, 1},
			{1, 2, 0, 1, 3, 2},
			{3, 1, 2, 4, 2, 0}
		};
		
		// int[][] coins = {
			// {1, 3, 1},
			// {2, 2, 4},	
			// {5, 0, 2}
		// };
		
		System.out.println(turtle(coins));
	}
}