import java.util.Stack;

public class ReverseNumber{
    public static void main(String[] args) {
        int number = 12345;
        System.out.println("Original Number: " + number);
        System.out.println("Reversed Number: " + reverseNumber(number));
    }

    public static int reverseNumber(int num) {
        Stack<Integer> stack = new Stack<>();
        while (num != 0) {
            stack.push(num % 10);
            num /= 10;
        }

        int reversed = 0;
        int placeValue = 1;
        while (!stack.isEmpty()) {
            reversed += stack.pop() * placeValue;
            placeValue *= 10;
        }

        return reversed;
    }
}