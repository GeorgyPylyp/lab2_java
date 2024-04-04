package lab2_java;

import java.util.Scanner;

public class task_2 {

    public static void main(String[] args) {
        int sum =0 ,aref = 0;
        System.out.println("ввдіть діапазон чисел");

        Scanner scan = new Scanner(System.in);
        System.out.println("з ");
        int z = scan.nextInt();
        System.out.println("по ");
        int po = scan.nextInt();
        if (z<=0 || po<=0 ){
            System.out.println("число не може бути менше або дорівнювати 0");
        }
        else {

            for (int i = z; i < po; i++) {
                if (i % 2 != 0) {
                    sum += i;
                    aref++;

                }

            }
        }
        int ser_aref = sum / aref;
        System.out.println("сума від'ємних чисел: "+sum);
        System.out.println("кількість чисел: "+aref);
        System.out.println("середнє арифметичне: "+ser_aref );


    }
}
