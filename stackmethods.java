package Programs;

import java.util.Stack;

public class stackmethods {

	public stackmethods() {
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {
	Stack<Integer> stack=new Stack<Integer>();
	stack.push(1);
	stack.add(2);
	stack.push(3);
	stack.add(4);
	stack.push(5);
	stack.add(6);
	stack.pop();
	stack.forEach(stk->{
		System.out.print(stk+ " ");
	});

}
}
