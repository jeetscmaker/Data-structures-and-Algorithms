package test;

public class BlobsCounterDfs {
	public static void main(String[] args) {
		String[] grid = {
				"000100",
				"001010",
				"001110",
				"110000",
				"110000"
		};
		System.out.println(blobCount(grid));
	}

	public static int blobCount(String[] grid) {
		int numberOfRows = grid.length;
		int numberOfColumns = grid[0].length();
		boolean[][] visited = new boolean[numberOfRows][numberOfColumns];
		for(int i = 0; i < numberOfRows; i++) 
			for(int j = 0; j < numberOfColumns; j++)
				visited[i][j] = false;
		int countBlobs = 0;
		for (int i = 0; i < numberOfRows; i++) {
			String s = grid[i];
			for (int j = 0; j < numberOfColumns; j++) {
				if (!visited[i][j] && s.charAt(j) == '1') {
					countBlobs += dfs(visited, i, j, grid);
				}
			}
		}
		return countBlobs;
	}

	private static int dfs(boolean[][] visited, int row, int column, String[] grid) {
		if (row >= 0 && column >= 0 
				&& row < grid.length && column < grid[0].length() 
				&& !visited[row][column]
				&& grid[row].charAt(column) == '1') {

			visited[row][column] = true;
			dfs(visited, row + 1, column, grid);
			dfs(visited, row, column + 1, grid);
			dfs(visited, row - 1, column, grid);
			dfs(visited, row, column - 1, grid);
		}
		return 1;
	}
}
