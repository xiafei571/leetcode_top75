package queue;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack225 {
	Queue<Integer> queue;

	public MyStack225() {
		queue = new LinkedList<>();

	}

	public void push(int x) {
		queue.add(x);
		for (int i = 1; i < queue.size(); i++) {
			queue.add(queue.remove());
		}
	}

	public int pop() {
		return queue.remove();
	}

	public int top() {
		return queue.peek();
	}

	public boolean empty() {
		return queue.isEmpty();
	}
}
