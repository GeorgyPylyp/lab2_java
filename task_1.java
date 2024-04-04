package lab2_java;

import java.util.Scanner;

public class task_1 {

    public static void main(String[] args) {
        int t = 0;


        do{
            Scanner scan = new Scanner(System.in);
            System.out.println("введіть значення x: ");
            int x = scan.nextInt();
            System.out.println("введіть значення y: ");
            int y = scan.nextInt();
            System.out.println("введіть значення z: ");
            int z = scan.nextInt();


            if (x == 0||z == 0||y == 0 ) {
                System.out.println("Помилка: одна із змінних дорівнює нулю. Введіть інше значення \n");}
            else if (x < 0|| y < 0 || z < 0){
                System.out.println("Помилка: x менше нуля. Введіть інше значення a\n");}

            else {   t=((1+z)*((x+(y/z))/(x-(1/(1+x*x))))) +1;
                System.out.println("\n Значення функції t="+ t);

            }
        }
        while (t == 0);

        }


    }
