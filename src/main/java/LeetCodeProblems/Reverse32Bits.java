package LeetCodeProblems;

public class Reverse32Bits {
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result = result << 1;
            result = result | (n & 1);
            n = n >> 1;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 43261596;
        Reverse32Bits sol = new Reverse32Bits();
        int ans = sol.reverseBits(n);
        System.out.println(ans);
    }
}
