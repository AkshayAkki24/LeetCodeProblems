package LeetCodeProblems;

import java.util.PriorityQueue;

public class MaximumAveragePassRatio {
	
	public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> 
            Double.compare(gain(b[0], b[1]), gain(a[0], a[1]))
        );
        
        for (int[] c : classes) {
            pq.offer(c);
        }
        
        while (extraStudents-- > 0) {
            int[] top = pq.poll();
            top[0]++;  
            top[1]++; 
            pq.offer(top);
        }
        
        double sum = 0.0;
        for (int[] c : pq) {
            sum += (double) c[0] / c[1];
        }
        
        return sum / classes.length;
    }
    
    private double gain(int pass, int total) {
        return (double)(pass + 1) / (total + 1) - (double)pass / total;
    }

	public static void main(String[] args) {
		
		int[][] classes = {{1,2},{3,5},{2,2}};
		int extraStudents = 2;
		
		MaximumAveragePassRatio sol = new MaximumAveragePassRatio();
		double result = sol.maxAverageRatio(classes, extraStudents);
		System.out.println(result);

	}

}
