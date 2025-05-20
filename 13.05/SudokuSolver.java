import java.util.*;
import java.io.*;

public class SudokuSolver {

    public static void printGrid(int[][] grid) {
        System.out.println("╔═══════╤═══════╤═══════╗");
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println("╟───────┼───────┼───────╢");
            }
            System.out.print("║ ");
            for (int j = 0; j < 9; j++) {
                if (j % 3 == 0 && j != 0) {
                    System.out.print("│ ");
                }
                System.out.print(grid[i][j] == 0 ? "· " : grid[i][j] + " ");
            }
            System.out.println("║");
        }
        System.out.println("╚═══════╧═══════╧═══════╝");
    }
	
	// public static boolean isValid(int[][] grid, int row, int column, int num) {
		
		// for (int i = 0; i < 9; i++) {
			// if (grid[row][i] == num) {
				// return false;
			// }
		// }
		
		// for (int i = 0; i < 9; i++) {
			// if (grid[i][column] == num) {
				// return false;
			// }
		// }
		
		// int startRow = row / 3 * 3;
		// int startCol = col / 3 * 3;
		// for (int i = 0; i < 3; i++) {
			// for (int j = 0; j < 3; j++) {
				// if (grid[startRow + i][startCol + j] == num) {
					// return false;
				// }
			// }
		// }

		// return true;
	// }
	
	public static boolean isNumberInRow(int[][] grid, int row, int num) {
		for (int i = 0; i < 9; i++) {
			if (grid[row][i] == num) {
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean isNumberInColumn(int[][] grid, int column, int num) {
		for (int i = 0; i < 9; i++) {
			if (grid[i][column] == num) {
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean isNumberInBox(int[][] grid, int column, int row, int num) {
		int startRow = row / 3 * 3;
		int startColumn = column / 3 * 3;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (grid[startRow + i][startColumn + j] == num) {
					return false;
				}
			}
		}

		return true;
	}
	
	public static boolean isValid(int[][] grid, int row, int column, int num) {
		return isNumberInBox(grid, column, row, num) && isNumberInColumn(grid, column, num) && isNumberInRow(grid, row, num);
	}
	
	public static int[][] sudokuFromTxt(int lineNumber) throws IOException {
		int[][] grid = new int[9][9];

		BufferedReader reader = new BufferedReader(new FileReader("C:\\Java_Projects\\sudoku-aisd-PalmaDae\\13.05\\sudoku_puzzles.txt"));
		String line;
		int currentLine = 0;

		while ((line = reader.readLine()) != null) {
			currentLine++;
			if (currentLine == lineNumber) {
				for (int i = 0; i < 81; i++) {
					grid[i / 9][i % 9] = line.charAt(i) - '0';
				}
				return grid;
			}
		}
		
		reader.close();
		return grid;
	}
	
	public static boolean solveSudoku(int[][] grid) {
		for (int row = 0; row < 9; row++) {
			for (int col = 0; col < 9; col++) {
				if (grid[row][col] == 0) {
					for (int num = 1; num <= 9; num++) {
						if (isValid(grid, row, col, num)) {
							grid[row][col] = num;

							if (solveSudoku(grid)) {
								return true;
							}

							grid[row][col] = 0;
						}
					}
					return false;
				}
			}
		}
		return true;
	}

    public static void main(String[] args) {
        // int[][] grid = {
                // {0, 0, 0, 0, 0, 0, 0, 0, 0},
                // {0, 0, 0, 0, 0, 3, 1, 4, 5},
                // {7, 0, 2, 4, 0, 0, 0, 0, 0},
                // {0, 0, 0, 0, 3, 0, 0, 0, 6},
                // {1, 0, 7, 0, 0, 8, 0, 0, 0},
                // {0, 0, 9, 0, 0, 2, 0, 1, 0},
                // {0, 0, 0, 0, 8, 9, 6, 3, 0},
                // {3, 0, 0, 0, 0, 0, 0, 0, 0},
                // {4, 0, 5, 0, 0, 0, 0, 0, 8}
        // };
		
		int[][] grid = new int[9][9];
		
		try {
			grid = sudokuFromTxt(1);
		} catch(IOException e) {
			System.out.println("");
		}

        System.out.println("Исходное судоку:");
        printGrid(grid);

        if (solveSudoku(grid)) {
            System.out.println("\nРешённое судоку:");
            printGrid(grid);
        } else {
            System.out.println("\nРешения не существует!");
        }
    }
}