package com.great.learning.lab.session.Question2.driver;

import com.great.learning.lab.session.Question2.service.MergeSortImplementation;
import com.great.learning.lab.session.Question2.service.NotesClass;

import java.util.Scanner;

class CurrencyDenominations {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of currency denominations ");
        size = scn.nextInt();

        int notes[] = new int[size];
        System.out.println("Enter the values of array :");
        for (int i = 0; i < size; i++) {
            notes[i] = scn.nextInt();
        }
        System.out.println("Enter the amount you need to pay :");
        int amount = scn.nextInt();
        MergeSortImplementation.mergeSort(notes, 0, size - 1);
        for (int i = 0, j = size - 1; i <= (size / 2); i++, j--) {
            int temp = notes[i];
            notes[i] = notes[j];
            notes[j] = temp;
        }
        NotesClass.notesCountImplementation(notes, amount);
    }
}