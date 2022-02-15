import java.util.*;

public class SingleKeyboardRow {

    static String row1 = "qwertyuiop";
    static String row2 = "asdfghjkl";
    static String row3 = "zxcvbnm";

    public static boolean singleRowUsed(String word) {
        boolean isSingleRowUsed = false;
        String[] lettersArray = word.toLowerCase().split("");
        List<String> lettersList = new ArrayList(Arrays.asList(lettersArray));
        Iterator<String> letterIterator = lettersList.listIterator();
        
        int row1used = 0;
        int row2used = 0;
        int row3used = 0;
        while(letterIterator.hasNext()) {
            String letter = letterIterator.next();
            if(row1.contains(letter) && row1used == 0) {
                row1used++;
            } else if (row2.contains(letter) && row2used == 0) {
                row2used++;
            } else if (row3.contains(letter) && row3used == 0) {
                row3used++;
            }
        }
        
        if(row1used + row2used + row3used == 1) {
            isSingleRowUsed = true;
        }
        return isSingleRowUsed;
    }

    public static void main(String[] args) {
        String falseTest = "test";
        String trueTest = "AlAsKa";

        System.out.println("singleRowUsed(falseTest) = " + singleRowUsed(falseTest)); //false
        System.out.println("singleRowUsed(trueTest) = " + singleRowUsed(trueTest)); //true
    }
}