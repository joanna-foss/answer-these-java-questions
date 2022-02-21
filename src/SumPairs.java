import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Pair {
    int num1;
    int num2;
    Pair(int first, int second) {
        num1 = first;
        num2 = second;
    }
}

public class SumPairs{
    public static int[][] pairSum(int[] arr, int s) {
        Arrays.sort(arr);
        List<Pair> intPairs = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
            	if(arr[i] + arr[j] == s) {
                    Pair currentPair = new Pair(arr[i], arr[j]);
                	intPairs.add(currentPair);
            	}
        	}
        }

        int[][] pairs = new int[intPairs.size()][];
        for(int i = 0; i < pairs.length; i++) {
            pairs[i] = new int[2];
            pairs[i][0] = intPairs.get(i).num1;
            pairs[i][1] = intPairs.get(i).num2;
        }

        return pairs;
    }

    public static int[] targetIndices(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }

        return null;
    }

    public static void main(String[] args) {
        int[][] intArr = pairSum(new int[]{1, 2, 3, 4, 5}, 5);
        for(int[] pair : intArr) {
            System.out.println(Arrays.toString(pair)); // [1, 4] [2, 3]
        }

        int[] targetIndices = targetIndices(new int[]{1, 2, 3, 7, 3}, 6);
        System.out.println(Arrays.toString(targetIndices)); // [2, 4]
    }
}