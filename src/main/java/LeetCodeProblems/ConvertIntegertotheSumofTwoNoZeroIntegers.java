package LeetCodeProblems;

import java.util.Arrays;

public class ConvertIntegertotheSumofTwoNoZeroIntegers {
	public int[] getNoZeroIntegers(int n) {
		for (int a = 1; a < n; a++) {
			int b = n - a;
			if (isNoZero(a) && isNoZero(b)) {
				return new int[] { a, b };
			}
		}
		return new int[] {};
	}

	private boolean isNoZero(int num) {
		while (num > 0) {
			if (num % 10 == 0)
				return false;
			num /= 10;
		}
		return true;
	}

	public static void main(String[] args) {

		int n = 11;
		ConvertIntegertotheSumofTwoNoZeroIntegers sol = new ConvertIntegertotheSumofTwoNoZeroIntegers();
		int[] result = sol.getNoZeroIntegers(n);
		System.out.println(Arrays.toString(result));
	}
}
