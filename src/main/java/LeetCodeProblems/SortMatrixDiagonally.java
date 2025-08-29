package LeetCodeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortMatrixDiagonally {
	
//	int[][] mat = {
//			{1,7,3},
//			{9,8,2},
//			{4,5,6}
//	};
	
	
	
	public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        System.out.println(n);
        for (int startRow = 0; startRow < n; startRow++) {
            List<Integer> diag = new ArrayList<>();
            int i = startRow, j = 0;
            while (i < n && j < n) {
                diag.add(grid[i][j]);
                i++; j++;
            }
            Collections.sort(diag, Collections.reverseOrder()); 
            i = startRow; j = 0;
            for (int val : diag) {
                grid[i][j] = val;
                i++; j++;
            }
        }

        for (int startCol = 1; startCol < n; startCol++) {
            List<Integer> diag = new ArrayList<>();
            int i = 0, j = startCol;
            while (i < n && j < n) {
                diag.add(grid[i][j]);
                i++; j++;
            }
            Collections.sort(diag); 
            i = 0; j = startCol;
            for (int val : diag) {
                grid[i][j] = val;
                i++; j++;
            }
        }

        return grid;
    }

	public static void main(String[] args) {

		int[][] mat = {
				{1,7,3},
				{9,8,2},
				{4,5,6}
		};
		
		SortMatrixDiagonally sol = new SortMatrixDiagonally();
		int[][] res = sol.sortMatrix(mat);
		
		for(int[] row : res) {
			System.out.println(Arrays.toString(row));
		}
	}

}
