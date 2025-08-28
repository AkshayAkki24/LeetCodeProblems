package practice.LeetCodeProblems;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

	public List<String> generateParenthesis(int n) {
		
		List<String> ans = new ArrayList<String>();
		brackTrace(ans,new StringBuilder(),0,0,n);
		return ans;
	}
	
	public void brackTrace(List<String> ans,StringBuilder sb, int open,int close,int n) {
		if(sb.length() == 2 * n) {
			ans.add(sb.toString());
			return;
		}
		
		if(open < n) {
			sb.append('(');
			brackTrace(ans,sb,open+1,close,n);
			sb.deleteCharAt(sb.length() - 1);
		}
		
		if(close < open) {
			sb.append(')');
			brackTrace(ans, sb, open, close+1, n);
			sb.deleteCharAt(sb.length() - 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		GenerateParentheses sol = new GenerateParentheses();
		List<String> result = sol.generateParenthesis(n);
		System.out.println(result);
	}

}
