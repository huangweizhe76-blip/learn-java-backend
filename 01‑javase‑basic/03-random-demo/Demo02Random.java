package class3;

import java.util.Random;
import java.util.Scanner;

public class Demo02Random {
    public static void main(String[] args) {
        // 1. Create Scanner and Random object
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        // 2. Generate random number between 1 ~ 100
        int rdNumber = rd.nextInt(100) + 1;

        while (true) {
            // 3. Read input number from user
            int scNumber = sc.nextInt();

            // 4. Compare guess and target number
            if (scNumber > rdNumber) {
                System.out.println("猜大了");
            } else if (scNumber < rdNumber) {
                System.out.println("猜小了");
            } else {
                System.out.println("猜对了");
                break; // exit infinite loop
            }
        }
        sc.close();
    }
}