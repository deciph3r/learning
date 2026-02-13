import java.util.Map;
import java.util.Stack;

public class BalancedBrackets {
    public static boolean isBalancedBrackets(String input) {
        Stack<Character> characterStack = new Stack<>();
        Map<Character,Character> bracketMap = Map.of(')', '(', '}', '{', ']', '[');
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

    public static void main(String[] args) {
        System.out.println(isBalancedBrackets("{{}([])}"));
        System.out.println(isBalancedBrackets("{(})"));

    }
}
