package com.techelevator;

public class Arrays {
    public static void main(String[] args) {

        double timGrade = 4;
        double johnGrade = 3;

        double[] temps = new double[10];
        temps[0] = 69.0;
        temps[1] = 70;
        int element2 = 2;
        temps[element2] = 80;

        System.out.println(temps[0]);
        temps = new double[4];
        System.out.println(temps[0]);

        System.out.println(temps.length);

        int x = 12;
        int y = x;
        x=5;
        System.out.println(x); // 5
        System.out.println(y); // 12

        int[] at = new int[2];
        int[] bt = at;
        at[0] = 6;
        bt[0] = 56789;
        System.out.println(at[0]); // 6
        System.out.println(bt[0]); // 6

        System.out.println("=================");

        int[] arrayToLoopThrough = { 4, 3, 4, 1, 4, 6 };
        int sum = 0;

        for (int i = 0; i < arrayToLoopThrough.length; i = i + 1) {
            System.out.println(arrayToLoopThrough[i]);
        }

        for (int index = arrayToLoopThrough.length-1; index >= 0; index--) {
            System.out.println(arrayToLoopThrough[index]);
        }


        int answer = 0;
        for(int i = 0; i < 10; i++) {
            if(i % 2 == 0) {
                answer = answer + i;
            }
        }

        System.out.println(answer);

        System.out.println(1 % 2);

    }

}
