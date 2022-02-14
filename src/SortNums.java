public class SortNums {
    public static void sort012(int[] arr)
    {
        int lowPointer = 0;
        int highPointer = arr.length - 1;
        int midPointer = 0;
        int current;

        while(midPointer <= highPointer) {
            if(arr[midPointer] == 0) {
                current = arr[lowPointer];
                arr[lowPointer] = arr[midPointer];
                arr[midPointer] = current;
                lowPointer++;
                midPointer++;
            } else if(arr[midPointer] == 1) {
                midPointer++;
            } else {
                current = arr[midPointer];
                arr[midPointer] = arr[highPointer];
                arr[highPointer] = current;
                highPointer--;
            }
        }
    }

    public static void main(String[] args) {
        int[] test = new int[]{1, 2, 1, 0, 0, 1, 2};
        for(int num : test) {
            System.out.print(num + " ");
        }
        sort012(test);
        System.out.println();
        for(int num : test) {
            System.out.print(num + " ");
        }
    }
}