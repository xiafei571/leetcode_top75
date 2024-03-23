package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyQueue232 {

	private Deque<Integer> stack1;
	private Deque<Integer> stack2;

	public MyQueue232() {
		stack1 = new ArrayDeque<>();
		stack2 = new ArrayDeque<>();
	}

	public void push(int x) {
		stack1.push(x);
	}

	public int pop() {
		if (stack2.isEmpty())
			exchange();
		return stack2.pop();
	}

	private void exchange() {
		while (!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}
	}

	public int peek() {
		if (stack2.isEmpty())
			exchange();

		return stack2.peek();
	}

	public boolean empty() {
		return stack1.isEmpty() && stack2.isEmpty();
	}
}
