public class FirstMissing {
    public static int findMissing(int[] arr) {
        for(int i = 1; i< arr.length; i++) {
            if(!isPresent(arr, i)){
                return i;
            }
        }
        return arr[arr.length - 1] + 1;
    }

    public static boolean isPresent(int[] arr, int number) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == number) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] test = new int[]{4, 2, 5, 0, 1, -9, -8, -3};
        int[] test2 = new int[]{-1, -1, 0, 0, 2, 6, 5, 4, 3};

        System.out.println("findMissing(test) = " + findMissing(test));
        System.out.println("findMissing(test2) = " + findMissing(test2));
    }
}