package utilities;

import stacksandqueues.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class MultiBracketValidation {
    public static boolean multiBracketValidation(String input) throws Exception {
        // Using ArrayDeque is faster than using Stack class
        Stack stack
                = new Stack();

        // Traversing the input
        for (int i = 0; i < input.length(); i++)
        {
            char x = input.charAt(i);

            if (x == '(' || x == '[' || x == '{')
            {
                // Push the element in the stack
                stack.push(x);
                continue;
            }

            // If current character is not opening bracket, then it must be closing. So stack cannot be empty at this point.
            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
                case ')':
                    check = (char) stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;

                case '}':
                    check = (char) stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;

                case ']':
                    check = (char) stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }

        // Check Empty Stack
        return (stack.isEmpty());
    }
}
