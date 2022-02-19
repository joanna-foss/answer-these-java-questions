import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AmazonReviewSearch {

    public static List<List<String>> searchSuggestions(List<String> repository, String customerQuery) {
        List<List<String>> allStrings = new ArrayList<>();
        List<String> sorted = new ArrayList<>(repository);
        Collections.sort(sorted);

        for(int i = 2; i < customerQuery.length(); i++) {
            String currentQuery = customerQuery.substring(0, i).toLowerCase();
            List<String> currentItems = new ArrayList<>();
            for(String element : sorted) {
                if(element.startsWith(currentQuery) && currentItems.size() < 3) {
                    currentItems.add(element);
                }
            }
            allStrings.add(currentItems);
        }
        return allStrings;
    }

    public static void main(String[] args) {
        List<String> ourRepository = new ArrayList<>();
        ourRepository.add("mousepad");
        ourRepository.add("monkey plush");
        ourRepository.add("mounds bar");
        ourRepository.add("mouse");
        ourRepository.add("mousic player");
        ourRepository.add("monday");
        ourRepository.add("molly doll");
        String ourQuery = "mouse";

        System.out.println(searchSuggestions(ourRepository, ourQuery));
    }
}