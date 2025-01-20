import java.util.Stack;

public class StackElementSearcher {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        int elementToSearch = 30;
        int position = searchElement(stack, elementToSearch);

        System.out.println("Element " + elementToSearch + " is at position: " + position);
    }

    public static int searchElement(Stack<Integer> stack, int element) {
        Stack<Integer> tempStack = new Stack<>();
        int position = -1;
        int index = 0;
        while (!stack.isEmpty()) {
            int current = stack.pop();
            tempStack.push(current);
            if (current == element) {
                position = index;
                break;
            }
            index++;
        }

        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }

        return position;
    }
}
