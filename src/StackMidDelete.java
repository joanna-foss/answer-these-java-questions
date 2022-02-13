import java.util.Stack;

public class StackMidDelete {
	public static void deleteMiddle(Stack<Integer> inputStack, int N) {
        int count = 0;
        int halfPoint = 0;
        if(N % 2 != 0) {
            halfPoint = (N-1)/2;
        } else {
            halfPoint = N/2 -1;
        }

        checkpoint(inputStack, halfPoint, count);
	}

    public static void checkpoint(Stack<Integer> stack, int halfPoint, int count) {
        if(count == halfPoint) {
            stack.pop();
            return;
        }
        int number = stack.pop();
        checkpoint(stack, halfPoint, count + 1);
        stack.push(number);
    }
}