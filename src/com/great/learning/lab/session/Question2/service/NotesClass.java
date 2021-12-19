package com.great.learning.lab.session.Question2.service;

public class NotesClass {
    public static  void  notesCountImplementation(int notes[], int amount){
        if(amount ==0){
            return;
        }
        int[]notesCounter= new int[notes.length];
        try {
            for(int i =0;i<notes.length;i++){
                if(amount ==0){
                    System.out.println();
                }
                if(amount >= notes[i]){
                    notesCounter[i]= amount/notes[i];
                    amount =amount-notesCounter[i]*notes[i];
                }
            }
            if(amount>0){
                System.out.println("exact amount cannot be given with the highest denomination");
            }else{
                System.out.println("Your payment approach in order to give min no of notes will be");
                for(int i =0 ;i<notes.length;i++){
                    if(notesCounter[i]!=0){
                        System.out.println(notes[i]+" : "+notesCounter[i]);
                    }
                }
            }
        }catch (ArithmeticException e){
            System.out.println(e+"notes of denomination 0 is invalid");
        }
    }
}
