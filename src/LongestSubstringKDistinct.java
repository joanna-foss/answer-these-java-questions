import java.util.*;

public class LongestSubstringKDistinct {
	public static int findLength(int target, String stringInput) {
		int maxLength = 0, windowStart = 0;
		Map<Character, Integer> countCharsMap = new HashMap<>();

		for(int i = 0; i < stringInput.length(); i++) {
			char right = stringInput.charAt(i);
			countCharsMap.put(right, countCharsMap.getOrDefault(right, 0) + 1);

			while(countCharsMap.size() > target) {
				char left = stringInput.charAt(windowStart);
				countCharsMap.put(left, countCharsMap.get(left) - 1);
				
				if(countCharsMap.get(left) == 0) {
					countCharsMap.remove(left);
				}

				windowStart++;
			}

			maxLength = Math.max(maxLength, i - windowStart + 1);
		}

		return maxLength;
	}

	public static void main(String[] args) {
		System.out.println(findLength(2, "abaaibaa")); //4
		System.out.println(findLength(10, "abcdefghijkkkklllmno"));
	}
}