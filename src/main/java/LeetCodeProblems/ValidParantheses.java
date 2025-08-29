package LeetCodeProblems;

import java.util.Stack;

public class ValidParantheses {
	
	public boolean isValid(String s) {
		Stack<Character> st = new Stack<>();
		for(char ch : s.toCharArray()) {
			if(ch == '(' || ch == '{' || ch == '[') {
				st.push(ch);
			}
			else {
				if(st.empty()) {
					return false;
				}
				if(ch == ')' && st.pop() != '(') {
					return false;
				}
				if(ch == '}' && st.pop() != '{') {
					return false;
				}
				if(ch == ']' && st.pop() != '[') {
					return false;
				}
			}
		}
	
			return st.isEmpty();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "()[]{}";
		ValidParantheses sol = new ValidParantheses();
		boolean result = sol.isValid(s);
		System.out.println(result);
	}

}
