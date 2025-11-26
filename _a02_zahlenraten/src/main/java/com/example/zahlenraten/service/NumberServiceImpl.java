package com.example.zahlenraten.service;

import java.util.Random;

public class NumberServiceImpl implements NumberService{
    @Override
    public int[] createNumberList(int size) {
        int[] numberList = new int[size];
        for (int i= 0; i< size;i++){
            numberList[i]= i+1;
        }
        return numberList;
    }

    @Override
    public int randNumber(int[] numberList) {
        Random rand = new Random();
        int index=  rand.nextInt(numberList.length);
        return numberList[index];
    }
}
