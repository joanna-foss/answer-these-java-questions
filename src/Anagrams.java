import java.util.Arrays;

public class Anagrams {
    public static boolean anagrams(String one, String two){
        one = one.replaceAll("\\p{Punct}", "").toLowerCase();
        two = two.replaceAll("\\p{Punct}", "").toLowerCase();

        char[] oneChars = one.toCharArray();
        char[] twoChars = two.toCharArray();

        Arrays.sort(oneChars);
        Arrays.sort(twoChars);

        return Arrays.toString(oneChars).equals(Arrays.toString(twoChars));
    }

    public static void main(String[] args) {
        System.out.println("anagrams(\"rail safety\", \"fairy tales\") = " + anagrams("rail safety", "fairy tales"));
        System.out.println("anagrams(\"RAIL! SAFETY!\", \"FAIRY tales\") = " + anagrams("RAIL! SAFETY!", "FAIRY tales"));
        System.out.println("anagrams(\"Hi there\", \"Bye there\") = " + anagrams("Hi there", "Bye there"));
    }
}