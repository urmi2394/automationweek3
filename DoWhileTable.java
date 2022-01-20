package com.automationweek3;

public class DoWhileTable {
    public static void main(String[] args) {
        int a=7;
        int b=1;
        do {
            System.out.println(a+"*"+b+"="+(a*b));
            b++;
        }while (b<=10);
    }
}
