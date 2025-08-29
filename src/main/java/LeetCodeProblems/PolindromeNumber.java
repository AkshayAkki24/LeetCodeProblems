package LeetCodeProblems;

public class PolindromeNumber {
	public boolean isPalindrome(int n) {
		boolean flag = true;

		if (n < 0) {
			return false;
		} else if (n == 0) {
			return true;
		} else {
			int l = ((int) (Math.log10(n)) + 1);
			int arr[] = new int[l];

//			if (n < 0) {
//				flag = false;
//			}

			for (int i = 0; i < l; i++) {
				arr[i] = n % 10;
				n = n / 10;
			}
			for (int i = 0; i < l / 2; i++) {
				if (arr[i] != arr[l - 1 - i]) {
					flag = false;
					break;
				}
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		int n = 121;
		PolindromeNumber sol = new PolindromeNumber();
		boolean result = sol.isPalindrome(n);
		System.out.println(result);
	}

}
