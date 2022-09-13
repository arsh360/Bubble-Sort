package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [] arr = {69,35,52,53,58};
        Sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void Sort (int[] arr){
        boolean swapped;

        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }

        }
    }
}
