import java.util.Stack;

public class Stack_pr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<>();
		s.push(5);
		s.push(2);
		s.push(3);
		s.push(7);
		s.pop();
		s.push(1);
		s.push(2);
		s.pop();
		
		while(!s.empty()) {
			System.out.println(s.peek());
			s.pop();
		}
	}

}
