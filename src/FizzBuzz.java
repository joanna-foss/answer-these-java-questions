import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//NOT DONE UNTIL YOU CAN:
//1. Describe line 12.
//2. Describe for loop.
//3. Look for 2 other alternative solutions.

public class FizzBuzz {
    public static void solution(int start, int end){
        List<Integer> range = IntStream.rangeClosed(start, end).boxed().collect(Collectors.toList());

        for(int num : range) {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("num = " + num + " FIZZBUZZ");
            } else if (num % 3 == 0) {
                System.out.println("num = " + num + " FIZZ");
            } else if (num % 5 == 0) {
                System.out.println("num = " + num + " BUZZ");
            } else {
                System.out.println("num = " + num);
            }
        }
    }

    public static void main(String[] args) {
        solution(1, 100);
    }
}