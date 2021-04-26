package com.bharat;

public class SumOfArray {
    public static void main(String[] args) {

        int [] arr = new int [] {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;

        for (int j : arr) {
            sum = sum + j;
        }
        System.out.println("Sum of all numbers in the array is " + sum);
    }
}
