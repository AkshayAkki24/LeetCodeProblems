package LeetCodeProblems;
import java.util.*;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char num = board[i][j];
                if (num != '.') {
                    // Row
                    if (!seen.add(num + " in row " + i)) return false;
                    // Column
                    if (!seen.add(num + " in col " + j)) return false;
                    // Box
                    if (!seen.add(num + " in box " + (i/3) + "-" + (j/3))) return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ValidSudoku sol = new ValidSudoku();

        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        System.out.println(sol.isValidSudoku(board)); // true
    }
}

