package io.githib.ndimovt;

public class MyBinarySearch {
    private static int middleIndex;
    private static int highestIndex;
    private static int lowestIndex;
    public static int binarySearch(int index, int[] array){
        lowestIndex = 0;
        highestIndex = array.length - 1;
        while(lowestIndex <= highestIndex){
            middleIndex = lowestIndex + ((highestIndex - lowestIndex)/2);
            if (index < array[middleIndex]) {
                highestIndex = middleIndex - 1;
            } else if (index > array[middleIndex]) {
                lowestIndex = middleIndex + 1;
            }else {
                return middleIndex;
            }
        }
        return -1;

    }
}
