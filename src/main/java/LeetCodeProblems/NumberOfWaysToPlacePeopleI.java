package LeetCodeProblems;

import java.util.Arrays;

public class NumberOfWaysToPlacePeopleI {

    public int numbersOfPair(int[][] points){
        int n = points.length;
        Arrays.sort(points,(a,b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);
        int ans = 0;
        final int neg_inf = Integer.MIN_VALUE;

        for(int i = 0;i<n;i++){
            int yA = points[i][1];
            int maxY = neg_inf;
            for(int j = i+1;j<n;j++){
                int yB = points[j][1];
                if(yB <= yA && yB > maxY){
                    ans++;
                    maxY = yB;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int[][] points = {{1,1},{2,2},{3,3}};
        NumberOfWaysToPlacePeopleI sol = new NumberOfWaysToPlacePeopleI();
        int result = sol.numbersOfPair(points);
        System.out.println(result);
    }
}
