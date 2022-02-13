import java.util.*;


//THIS IS ALL KINDS OF MESSED UP. REASSESS ASAP.

class Pair {
    char ch;
    int count;

    Pair(char ch, int count) {
        this.ch = ch;
        this.count = count;
    }
}

public class RearrangeStr {
    public static String rearrangeString(String str) {
        if(!rearrangePossible(str)){
            return "NO SOLUTION";
        } else {
            char[] charArr = toCharArray(str);
            return rearranged(charArr);
        }
	}

    public static boolean rearrangePossible(String str) {
        char[] strCharArray = toCharArray(str);
        int maxNumOfOneCharacter = 0;
        for(int i = 0; i < str.length(); i++) {
            int maxNumOfCurrentCharacter = 0;
            if(strCharArray[i] == str.charAt(i)) {
                maxNumOfCurrentCharacter++;
            }
            maxNumOfOneCharacter = Math.max(maxNumOfOneCharacter, maxNumOfCurrentCharacter);
        }

        int maxAllowed = (int)Math.ceil((str.length() + 1)/2);

        if(maxNumOfOneCharacter < maxAllowed) {
            return true;
        }

        return false;
    }

    public static char[] toCharArray(String str) {
        int length = str.length();
        char[] array = new char[length];

        for(int i = 0; i < length; i++) {
            array[i] = str.charAt(i);
        }

        return array;
    }

    public static int countCharacters(String str, char c) {
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if(currentChar == c) {
                count++;
            }
        }
        return count;
    }

    public static String rearranged(char[] array) {
        int length = array.length;
        StringBuilder charArrToString = new StringBuilder();
        Map charCounts = new HashMap<Character, Integer>();
        for (char ch : array) {
            if (charCounts.containsKey(ch)) {
                charCounts.put(ch, charCounts.get(ch) + 1);
            } else {
                charCounts.put(ch, 1);
            }
        }

        PriorityQueue<Pair> pq = new PriorityQueue<Pair>(10, new Comparator<Pair>() {
            @Override
            public int compare(Pair pair1, Pair pair2) {
                if (pair1.count != pair2.count) {
                    return pair2.count - pair1.count;
                } else {
                    return pair2.ch - pair1.ch;
                }
            }
        });
        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            pq.offer(new Pair(entry.getKey(), entry.getValue()));
        }

        while (!pq.isEmpty()) {
            List<Pair> currentArrayList = new ArrayList<>();
            int min = Math.min(1, length);
            for (int i = 0; i < min; i++) {
                if (pq.isEmpty()) {
                    return "";
                }
                Pair currentPair = pq.poll();
                charArrToString.append(currentPair.ch);
                if (--currentPair.count > 0) {
                    currentArrayList.add(currentPair);
                    length--;
                }
                for (Pair p : currentArrayList) {
                    pq.offer(p);
                }
            }
        }
        return charArrToString.toString();
    }
}