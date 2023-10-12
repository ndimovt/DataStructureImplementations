package io.githib.ndimovt;
public class MySort {
    public static int[] sort(int[] arrayToSort){
        for (int i = 0; i < arrayToSort.length; i++) {
            for (int j = i+1; j < arrayToSort.length; j++) {
                int temp;
                if(arrayToSort[i] > arrayToSort[j]){
                    temp = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[j];
                    arrayToSort[j] = temp;
               }
            }
        }
        return arrayToSort;
    }
}
