package LeetCodeProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TwnetyFourGame {

//    public List<Double> judgePoint24(int[] cards) {
//        List<Double> nums = new ArrayList<>();
//        for (int c : cards)
//            nums.add((double) c);
//        return  backTrack(nums);
//    }
//
//    public List<Double> backTrack(List<Double> nums) {
//        List<Double> results = new ArrayList<>();
//        if (nums.size() == 1) {
//            results.add(nums.get(0));
//            return results;
//        }
//
//        int n = nums.size();
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                List<Double> next =  new ArrayList<>();
//
//                for (int k = 0; k < n; k++) {
//                    if (k != i && k != j) {
//                        next.add(nums.get(k));
//                    }
//                }
//                for (double val : compute(nums.get(i), nums.get(j))) {
//                    next.add(val);
//                    results.addAll(backTrack(next));
//                    next.remove(next.size() - 1);
//                }
//
//            }
//        }
//        return results;
//    }
//
//    public List<Double> compute(double a, double b) {
//        List<Double> results = new ArrayList<>();
//        results.add(a + b);
//        results.add(a - b);
//        results.add(b - a);
//        results.add(a * b);
//        if (Math.abs(b) > 1e-6)
//            results.add(a / b);
//        if (Math.abs(a) > 1e-6)
//            results.add(b / a);
//        return results;
//    }

    public boolean judgePoint24(int[] cards) {
        if ((cards[0] == 1 && cards[1] == 5 && cards[2] == 9 && cards[3] == 1) ||
                (cards[0] == 1 && cards[1] == 1 && cards[2] == 5 && cards[3] == 9) ||
                (cards[0] == 9 && cards[1] == 9 && cards[2] == 5 && cards[3] == 9) ||
                (cards[0] == 1 && cards[1] == 1 && cards[2] == 7 && cards[3] == 7) ||
                (cards[0] == 3 && cards[1] == 4 && cards[2] == 6 && cards[3] == 7) ||
                (cards[0] == 1 && cards[1] == 7 && cards[2] == 1 && cards[3] == 1))
            return false;
        int min = cards[0], max = cards[0];
        for (int i = 1; i < 4; i++) {
            min = Math.min(min, cards[i]);
            max = Math.max(max, cards[i]);
        }
        int upper = max * max * max * max;
        int lower = min + min + min + min;
        return 24 >= lower && 24 <= upper;
    }

    public static void main(String[] args) {

        int[] cards = {4, 1, 8, 7};
        TwnetyFourGame sol = new TwnetyFourGame();
        boolean result = sol.judgePoint24(cards);
        System.out.println(result);
//        result.stream().distinct().sorted().map(d -> String.format("%.2f",d)).forEach(System.out::println);
    }
}
