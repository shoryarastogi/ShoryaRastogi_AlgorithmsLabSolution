package com.great.learning.lab.session.Question1.driver;

import com.great.learning.lab.session.Question1.service.PayMoneyService;

import java.util.Scanner;

public class PayMoneyProblemMain {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        PayMoneyService payMoneyService = new PayMoneyService();
        System.out.println("Size ");
        int size = scn.nextInt();
        System.out.println("Enter the values of array");
        int[] elements = new int[size];
        for (int i = 0; i < size; i++) {
            elements[i] = scn.nextInt();
        }
        System.out.println("Enter the total no of target that needs to be achieved");
        int noOfTargets = scn.nextInt();

        while (noOfTargets-- != 0) {
            int flag = 0;
            long target;
            System.out.println("Enter the value of target");
            target = scn.nextInt();

            payMoneyService.transactionsAchieved(size, elements, target);
        }

    }
}
