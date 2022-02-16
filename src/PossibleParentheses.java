import java.util.ArrayList;
import java.util.List;

public class PossibleParentheses {
    public static List<String> generateParenthesis(int n) {
        List<String> parenthesesList = new ArrayList<>();
        StringBuilder parenthesisString = new StringBuilder(n*2);
        buildParentheses(parenthesesList, parenthesisString, 0, 0, n);
        return parenthesesList;
    }

    public static void buildParentheses(List<String> combinations, StringBuilder currentString, int openIndex, int closeIndex, int max) {
        if(currentString.length() == max * 2) {
            String[] strArray = currentString.toString().split("");
            int numOpen = max, numClosed = max;
            for(String elem : strArray) {
                if(elem.equals("(")) {
                    numOpen++;
                } else {
                    numClosed++;
                }
            }
            if(currentString.toString().startsWith("(") && currentString.toString().endsWith(")") && numOpen == numClosed) {
            //STILL ADDING INCORRECT PARENTHESES STRINGS... SOLVE FOR ERRORS/BACKWARDS FACING PARENTHESES IN THE MIDDLE OF STRING
                combinations.add(currentString.toString());
            }
        } else {
            if (closeIndex < max) {
                currentString.insert(0, ")");
                buildParentheses(combinations, currentString, openIndex, closeIndex++, max);
                currentString.deleteCharAt(0);
            }
            if (openIndex < closeIndex) {
                currentString.insert(0, "(");
                buildParentheses(combinations, currentString, openIndex++, closeIndex, max);
                currentString.deleteCharAt(0);
            }
        }
    }

    public static void main(String[] args) {
        List<String> test1 = generateParenthesis(1);
        List<String> test2 = generateParenthesis(2);
        List<String> test3 = generateParenthesis(3);
        List<String> test4 = generateParenthesis(4);
        List<String> test5 = generateParenthesis(5);
        List<String> test6 = generateParenthesis(6);
        List<String> test7 = generateParenthesis(7);
        List<String> test8 = generateParenthesis(8);

        System.out.println("test1.size() = " + test1.size());
        System.out.println("test2.size() = " + test2.size());
        System.out.println("test3.size() = " + test3.size());
    }
}