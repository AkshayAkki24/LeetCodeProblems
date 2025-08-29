package practice;
import java.util.Stack;
/**
 * @author akumar1
 *
 */
public class Practice {

	public static void main(String args[]) {
		
		Stack<Integer> s = new Stack<Integer>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		
		System.out.println("print the stack : "+s);
		System.out.println("print the pop : "+s.pop());
		System.out.println("print the stack : "+s);
		System.out.println("print the peek : "+s.peek());
		System.out.println("print the stack : "+s);
		System.out.println("print the remove values : "+s.remove(0));
		System.out.println("print the stack : "+s);

		}
}
