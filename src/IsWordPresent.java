import java.util.Locale;

public class IsWordPresent {
    public static boolean isPresent(String sentence, String word) {
        boolean present = false;
        sentence = sentence.replaceAll("\\p{Punct}", "").toLowerCase();
        word = word.toLowerCase();
        String[] sentenceArr = sentence.split(" ");
        for (String element : sentenceArr) {
            if (element.equals(word)) {
                present = true;
            }
        }
        return present;
    }

// This is the optimal solution if given the following expectations:
// 1. All the characters in the string and the word are in lowercase.
// 2. Length of the sentences and the words will always be greater than zero.
// 3. Words in the sentence will be separated by spaces.
//    public static boolean findWord(String s, String w) {
//        String[] sentenceArr = s.split(" ");
//
//        for (String element : sentenceArr) {
//            if (element.equals(w)) {
//                return true;
//            }
//        }
//        return false;
//    }

    public static void main(String[] args) {
        System.out.println(isPresent("I am the best around.", "around")); //true
        System.out.println(isPresent("I have never gone to Disney World!", "Mickey")); //false
        System.out.println(isPresent("The elephant became friends with the mouse.", "ElEpHaNt")); //true
    }
}