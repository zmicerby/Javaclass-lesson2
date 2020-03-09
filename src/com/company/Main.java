package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here


        int[][] arr1 = new int[3][4];

        arr1[0][0] = 14;
        arr1[0][1] = 41;
        arr1[0][2] = 8;
        arr1[0][3] = 13;
        arr1[1][0] = 55;
        arr1[1][1] = 87;
        arr1[1][2] = 1;
        arr1[1][3] = 5;
        arr1[2][0] = 56;
        arr1[2][1] = 0;
        arr1[2][2] = -3;
        arr1[2][3] = 11;

        //int i = 0, j = 0;

        System.out.println("Демонстрация массива");

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr1[i].length; j++) {

                System.out.print(arr1[i][j] + "\t");
            }
            System.out.println();
        }


        System.out.println("-----------");



    }
}
















