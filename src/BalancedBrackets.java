import java.util.Map;
import java.util.Stack;

public class BalancedBrackets {
    public static boolean isBalancedBrackets(String input) {
        Stack<Character> characterStack = new Stack<>();
        Map<Character, Character> bracketMap = Map.of(')', '(', '}', '{', ']', '[');
        for (char c : input.toCharArray()) {
            if (bracketMap.containsValue(c)) {
                characterStack.push(c);
            } else if (bracketMap.containsKey(c)) {
                if (characterStack.isEmpty()) return false;
                else if (characterStack.peek().equals(bracketMap.get(c))) characterStack.pop();
                else return false;
            }
        }

        return characterStack.isEmpty();
    }

    public static boolean isBalancedWildCard(String input) {
        int minOpen, maxOpen;
        minOpen = maxOpen = 0;
        for (Character c : input.toCharArray()) {
            if (c.equals('(')) {
                minOpen++;
                maxOpen++;
            } else if (c.equals(')')) {
                minOpen--;
                maxOpen--;
            } else {
                minOpen--;
                maxOpen++;
            }

            if (minOpen < 0) minOpen = 0;
            if (maxOpen < 0) return false;
        }

        return minOpen == 0;
    }

    public static void main(String[] args) {
        System.out.println(isBalancedBrackets("{{}([])}"));
        System.out.println(isBalancedBrackets("{(})"));
        System.out.println(isBalancedWildCard("(*)"));
        System.out.println(isBalancedWildCard("*("));
        System.out.println(isBalancedWildCard("(**"));

    }
}
