package com.banzo.junitexamples;

import java.util.List;

public class Calc 
{
    public int divide(int a, int b) {
        if (b == 0) {
            return a;
        }
        return a / b;
    }

    public static void reverse(List<Integer> list, int left, int right) {
        while (left < right) {
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }
}
