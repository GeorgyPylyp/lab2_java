package lab2_java;

import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введіть число a");
        int a = scan.nextInt();
        System.out.println("введіть число n");
        int n = scan.nextInt();
        int sum = 1;
        int i = 0;

        if (n <= 0) {
            System.out.println("число n не повинно дорівнювати нулю ,або бути менше нуля");
        }

        else {
            for (i = 1; i <= n; i++) {
                a += i;
                sum *= a;
            }
            System.out.println("" + sum);

        }
    }
    }
