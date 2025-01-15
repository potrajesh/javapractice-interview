package ninzas.Stringpractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class FindBrackets {
    public static void main(String[] args) {
        String currentString = "";
        List<String> stackString = new ArrayList<>();
        String encodedString = "3[a2[c]]";
        Stack<String> resultStack = new Stack<>();
        int i = 0;

        while (i < encodedString.length()) {
            char ch = encodedString.charAt(i);

            if (ch == '[') {
                stackString.add(currentString);
                resultStack.push(currentString);
                currentString = "";  // Reset current string after pushing to stack
            } else if (ch == ']') {
                String lastString = stackString.remove(stackString.size() - 1);
                currentString = lastString + currentString;  // Append to the last string from stack
            } else {
                currentString += ch;
            }
            i++;
        }

        System.out.println("Stacked strings: " + stackString);
        System.out.println("Decoded string: " + currentString);
    }
}
