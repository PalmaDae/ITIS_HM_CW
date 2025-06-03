package ClassWork;

import java.util.Stack;

public class Task1 {
    public static boolean stringStaples(String line) {
        int countOfFirstStaple = 0;
        int countOfSecondStaple = 0;

        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '(') {
                countOfFirstStaple++;
            } else if (line.charAt(i) == ')') {
                countOfSecondStaple++;
            }
        }

        if (countOfFirstStaple != countOfSecondStaple) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < line.length(); i++) {
            char x = line.charAt(i);

            if (x == '(') {
                stack.push(x);
                continue;
            }

            if (stack.isEmpty()) {
                return false;
            }

            char y;

            if (x == ')') {
                y = stack.pop();
            }
        }

        return stack.isEmpty();
    }

    public static boolean stringStaplesButHard(String line) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < line.length(); i++) {
            char x = line.charAt(i);

            if (x == '(' || x == '[' || x == '{') {
                stack.push(x);
            }

            if (stack.isEmpty()) {
                return false;
            }

            char y;

            switch (x) {
                case (')'):
                    y = stack.pop();
                    if (y == '{' || y == '[') {
                        return false;
                    }
                    break;
                case (']'):
                    y = stack.pop();
                    if (y == '(' || y == '{') {
                        return false;
                    }
                    break;
                case ('}'):
                    y = stack.pop();
                    if (y == '(' || y == '[') {
                        return false;
                    }
                    break;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String first = "(()())";
        String second = "(()";

        System.out.println(stringStaples(first));
        System.out.println(stringStaples(second));

        String third = "{[()]}";
        String fourth = "{([)]}";

        System.out.println(stringStaplesButHard(third));
        System.out.println(stringStaplesButHard(fourth));
    }
}
