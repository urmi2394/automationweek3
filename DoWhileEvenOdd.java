package com.automationweek3;

public class DoWhileEvenOdd {
    public static void main(String[] args) {
        int u=2;
        int s=1;
        do {
            {
                System.out.println(u);
                u=u+2;
            }
        }while (u<=10);

        do{
            System.out.println(s);
            s=s+2;
        }while (s<=10);
    }
}
