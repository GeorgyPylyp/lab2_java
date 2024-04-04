package lab2_java;

import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("введіть a:");
        float x1 = scan.nextFloat();
        System.out.println("введіть b:");
        float x2 = scan.nextFloat();

        float y;

        if(x1<=0){
            System.out.println("введіть інше значення a");
        }
        else if(x1>=x2){
            System.out.println("a не повинно бути більше або дорівнювати b");
        }

        else {


            System.out.println("\n********************");
            System.out.println("x\t\ty");
            System.out.println("********************\n");
            while (x1 <= x2) {
                y = (float) Math.log(2) * x1;
                System.out.println(x1 + "\t\t" + y);
                x1 += 0.025;
            }

        }


    }

}
