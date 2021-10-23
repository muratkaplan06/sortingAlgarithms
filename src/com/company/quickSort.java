package com.company;

public class quickSort {
    void quickSort(int[] arr, int altindis, int üstindis) {

        int i = altindis, j = üstindis, temp;

        int pivot = arr[(altindis + üstindis) / 2];

        do {
            while (arr[i] < pivot)
                i++;
            while (arr[j] > pivot)
                j--;
            if (i <= j) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        } while (i <= j);

        if (altindis < j)
            quickSort(arr, altindis, j);
        if (i < üstindis)
            quickSort(arr, i, üstindis);
    }

}
