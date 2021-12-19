package com.great.learning.lab.session.Question1.service;

public class PayMoneyService {
    public static void transactionsAchieved(int size, int[] elements, long target) {
        int flag = 0;
        long sum = 0;
        for (int i = 0; i < size; i++) {
            sum += elements[i];
            if (sum > target) {
                System.out.println("Target achieved after " + (i + 1) + " transactions ");
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Target is not achieved");
        }
    }
}
