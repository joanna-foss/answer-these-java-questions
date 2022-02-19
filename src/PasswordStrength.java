import java.util.HashSet;
import java.util.Set;


//score question... add one point for each unique character in every possible substring of the password. Return total score.
public class PasswordStrength {

    public static int getScore(String password) {
        int total = 0;

        for(int i = 0; i < password.length(); i++) {
            for(int j = i + 1; j <= password.length(); j++) {
                char[] passwordChars = password.substring(i, j).toCharArray();
                Set<String> uniqueChars = new HashSet<>();

                for (char element : passwordChars) {
                    uniqueChars.add(Character.toString(element));
                }

                total += uniqueChars.size();
            }
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println("getScore(\"test\") = " + getScore("test")); //19
    }
}