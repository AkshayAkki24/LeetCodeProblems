package LeetCodeProblems;

public class Numberof1Bits {

	public static int hammingWeight(int n) {
		int count = 0;
		while(n != 0) {
			n = n & (n-1);
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 11;
		Numberof1Bits sol = new Numberof1Bits();
		int result = hammingWeight(n);
		System.out.println(result);
	}

}
