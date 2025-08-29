package LeetCodeProblems;

public class AliceAndBobPlayingFlowerGame {
	
	public long flowerGame(int n, int m) {
//		long oddAlice = (n + 1)/2;
//		long evenAlice = n / 2;
//		long oddBob = (m + 1)/2;
//		long evenBob = m / 2;
//		
//		
//		return oddAlice * evenBob + evenAlice * oddBob;
		
		long count = 0;
		for(int x = 1;x<=n;x++) {
			for(int y = 1;y <= m;y++) {
				if((x + y)%2 == 1) {
					count++;
				}
			}
		}
		return count;
		
//		return (long) n * m / 2;
	}

	public static void main(String[] args) {

		int n = 3, m = 2;
		
		AliceAndBobPlayingFlowerGame sol = new AliceAndBobPlayingFlowerGame();
		long result = sol.flowerGame(n, m);
		System.out.println(result);
	}

}
