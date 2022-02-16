public class MaxArea {

    public static int maxArea(int[] heightArray) {
        int max = 0;

        for(int i = 0; i < heightArray.length; i++){
            for(int j = i + 1; j < heightArray.length; j++) {
                max = getArea(max, heightArray[i], i,  heightArray[j], j);
            }
        }

        return max;
    }

    public static int getArea(int currentMax, int height1, int index1, int height2, int index2) {
        int currentArea = index2 - index1;
        if(height1 > height2) {
            currentArea *= height2;
        } else if (height2 >= height1) {
            currentArea *= height1;
        }
        
        return Math.max(currentMax, currentArea);
    }

    public static void main(String[] args) {
        System.out.println("maxArea(new int[]{4, 3, 2, 1, 4}) = " + maxArea(new int[]{4, 3, 2, 1, 4}));
        System.out.println("maxArea(new int[]{12, 4, 6, 8, 1}) = " + maxArea(new int[]{12, 4, 6, 8, 1}));
        System.out.println("maxArea(new int[]{1, 2, 3}) = " + maxArea(new int[]{1, 2, 3}));
    }
}