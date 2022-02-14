import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeToTarget {
    public static int[][] getTriplets(int length, int[] integers, int target) {
        List<int[]> triplets = new ArrayList<>();

        for(int i = 0; i < length; i++) {
            int firstNum = integers[i];
            for(int j = i + 1; j < length; j++) {
                int secondNum = integers[j];
                for(int k = j + 1; k < length; k++) {
                    int thirdNum = integers[k];
                    int sum = firstNum + secondNum + thirdNum;
                    if(sum < target) {
                        int[] triplet = new int[]{firstNum, secondNum, thirdNum};
                        triplets.add(triplet);
                    }
                }
            }
        }

        int tripletsLength = triplets.size();
        int[][] finalTriplets = new int[tripletsLength][];
        for(int i = 0; i < finalTriplets.length; i++) {
            finalTriplets[i] = triplets.get(i);
        }

        return finalTriplets;
    }

    public static int countTriplets(int[] integers, int target){
        int count = 0;
        int length = integers.length;
        for(int i = 0; i < length; i++) {
            int firstNum = integers[i];
            for (int j = i + 1; j < length; j++) {
                int secondNum = integers[j];
                for (int k = j + 1; k < length; k++) {
                    int thirdNum = integers[k];
                    int sum = firstNum + secondNum + thirdNum;
                    if (sum < target) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] test = new int[]{1, 5, 2, 3, 4, 6, 7};

        System.out.println("countTriplets(test) = " + countTriplets(test, 9));
        System.out.println("getTriplets(7, test, 9 = " + Arrays.deepToString(getTriplets(7, test, 9)));
    }
}