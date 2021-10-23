package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	quickSort qs=new quickSort();
        int[] arr = { 2, 17, -4, 42, 9, 26, 11, 3, 5, 28 };
        System.out.println("Sıralamadan önce: ");
        System.out.println(Arrays.toString(arr));
        qs.quickSort(arr, 0, 9);
        System.out.println("Sıralamadan sonra:");
        System.out.println(Arrays.toString(arr));
    }
}
