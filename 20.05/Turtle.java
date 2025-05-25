public class Turtle {
	public static int turtle(int[][] grid) {
		int length = grid.length;
		
		int coins = new int[length][length];
		
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				if (j == 0) {
					
				} else if (i == 0) {
					
				} else {
					grid[i][j] = Math.max(grid[i][j], grid[][j]);
				}
			}
		}
		
		return grid[length][length];
	}

	public static void main(String[] args) {
		// int[][] coins = {
			// {1, 3, 1, 5, 1, 2},
			// {2, 2, 4, 2, 3, 1},	
			// {5, 0, 2, 3, 0, 2},
			// {0, 6, 1, 2, 4, 1},
			// {1, 2, 0, 1, 3, 2},
			// {3, 1, 2, 4, 2, 0}
		// };
		
		int[][] coins = {
			{1, 3, 1},
			{2, 2, 4},	
			{5, 0, 2}
		};
		
		System.out.println(turtle(coins));
	}
}