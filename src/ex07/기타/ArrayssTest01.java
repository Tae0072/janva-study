package ex07.기타;

import java.util.*;

public class ArrayssTest01 {
    public static void main(String[] args) {
        int[] array = {9,4,5,6,2,1};
        Arrays.sort(array);
        printArray(array);
        System.out.println(Arrays.binarySearch(array,9));
        Arrays.fill(array, 8);
        printArray(array);
    }
    private static void printArray(int[] array){
        System.out.println("[");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]+" ");
            System.out.println("]");
        }
    }
}
