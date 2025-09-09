package LeetCodeProblems;

import java.util.Arrays;

public class CountingBits {
	public int[] countBits(int n) {
		int[] b = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			b[i] = b[i & (i - 1)] + 1;
		}
		return b;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8;
		CountingBits sol = new CountingBits();
		int[] result = sol.countBits(n);
		System.out.println(Arrays.toString(result));
	}

}
