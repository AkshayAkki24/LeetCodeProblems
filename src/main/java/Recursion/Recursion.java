package Recursion;

public class Recursion {

	public static void main(String[] args) {
		print(1);
	}
	static void print(int n) {
		if(n == 5) {
			System.out.println("hello world "+n);
			return;
		}
		System.out.println("hello world "+n);
		print(n + 1);
	}
 
}
