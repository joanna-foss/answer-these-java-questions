public class SharedPrefix {
    public String longestCommonPrefix(String[] strs) {
    //OPTIMAL SOLUTION
        if(strs.length == 0) {
            return "";
        }

        String prefix = strs[0];

        for(int i = 0; i < strs.length; i++) {
            while(strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if(prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
    //NON-OPTIMAL FIRST ITERATION OF SOLUTION
//    public String longestCommonPrefix(String[] strs) {
//        if(strs.length == 1) {
//            return strs[0];
//        }
//
//        int shortestLengthIndex = Integer.MAX_VALUE;
//        String substring = "";
//        int total = 0;
//
//        for(String word : strs) {
//            if(word.length() < shortestLengthIndex) {
//                shortestLengthIndex = word.length() - 1;
//                substring = word;
//            }
//        }
//
//        for(int j = shortestLengthIndex; j >= 0; j--) {
//            for(int i = 0; i < strs.length; i++) {
//                System.out.println(substring + " : " + strs[i]);
//                if(strs[i].startsWith(substring)) {
//                    total += 1;
//                    System.out.println("total: " + total);
//                } else {
//                    total = 0;
//                    substring = strs[i].substring(0, j);
//                }
//
//                if(total == strs.length) {
//                    return substring;
//                }
//            }
//        }
//
//        return substring;
//    }
}