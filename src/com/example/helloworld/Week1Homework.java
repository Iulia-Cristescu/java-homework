package com.example.helloworld;

public class Week1Homework {
    public static void main(String[] args) {

        /* Exercise 5 */

        Boolean x = true;
        System.out.println(x);

        char letter = 'I';
        System.out.println(letter);

        int y = 200;
        System.out.println(y);

        long c = 50L;
        System.out.println(c);

        double d = 1.4;
        System.out.println(d);

        String e = "elephant";
        System.out.println(e);

        /* What the Integer type means? */
        int s[] = {1, 2, 3, 4};
        for(int i=0; i<s.length; i++) System.out.println(s[i]);


        /* Exercise 6 */

        int f = 20;
        int g = 15;
        int h = 2;
        int j = 3;

        System.out.println(f++);
        System.out.println(++g);
        System.out.println(h+j);
        System.out.println(g/j);
        System.out.println(f*j/h-g);
        System.out.println(f<=g);


        /* Exercise 7 */

        int a = 99;
        int b = 33;

        if (a > b) {
            System.out.println(a + " is larger than "+ b);
        }

        if (b > a) {
            System.out.println(b + " is larger than " + a);
        }

        if (a == b) {
            System.out.println(a + " is equal to " + b);
        }


        /* Exercise 8 */

        int[] numbers = {1, 13, 23, 36, 49, 56, 65, 78, 87, 94};

        for (int k = 0; k<=9; k++) {
            if (numbers[k] %2 == 0) {
                System.out.println(numbers[k]);
            }
        }








    }
}
