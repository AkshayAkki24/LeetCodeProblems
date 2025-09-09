package LeetCodeProblems;

public class NumberofPeopleAwareofaSecret {

    public int peopleAwareOfSecret(int n,int delay,int forget){
        int MOD = 1_000_000_007;
        long[] dp = new long[n +1];
        dp[1] = 1;

        long sharing = 0;
        for(int day = 2;day<=n;day++){
            if(day - delay >= 1){
                sharing = (sharing + dp[day - delay]) % MOD;
            }
            if(day - forget >= 1){
                sharing = (sharing - dp[day - forget] + MOD) % MOD;
            }
            dp[day] = sharing;
        }

        long result = 0;
        for(int day = n- forget + 1;day <= n;day++){
            if(day>= 1){
                result = (result + dp[day]) % MOD;
            }
        }
        return (int)result;
    }
    public static void main(String[] args){
        int n = 6,delay = 2,forget = 4;
        NumberofPeopleAwareofaSecret sol = new NumberofPeopleAwareofaSecret();
        int result = sol.peopleAwareOfSecret(n,delay,forget);
        System.out.println(result);


    }
}
