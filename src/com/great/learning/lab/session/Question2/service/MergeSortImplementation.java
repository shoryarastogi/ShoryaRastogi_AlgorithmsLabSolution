package com.great.learning.lab.session.Question2.service;

public class MergeSortImplementation {

    static void merge(int arr[], int left, int mid, int right) {
        int subArrayOne = mid - left + 1;
        int subArrayTwo = right - mid;

        int L[] = new int[subArrayOne];
        int R[] = new int[subArrayTwo];

        for (int i = 0; i < subArrayOne; i++) {
            L[i] = arr[left + i];
        }
        for (int i = 0; i < subArrayTwo; i++) {
            R[i] = arr[mid + 1 + i];
        }
        int i = 0, j = 0;
        int k = left;
        while (i < subArrayOne && j < subArrayTwo) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < subArrayOne) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < subArrayTwo) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int arr[], int begin, int end) {
        if (begin >= end) {
            return;
        }

        int mid = begin + (end - begin) / 2;
        mergeSort(arr, begin, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, begin, mid, end);

    }
}
