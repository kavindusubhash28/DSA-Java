import java.util.Stack;

public class PrintStack {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(5);
		stack.push(10);
		stack.push(15);

		Object[] arr = stack.toArray();
		for (Object value : arr) {
			System.out.println(value);
		}
	}
}