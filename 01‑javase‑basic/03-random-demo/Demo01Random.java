package class3;
import java.util.Random;

public class Demo01Random {
    public static void main(String[] args) {
        Random rd = new Random();
        int data1 = rd.nextInt();
        System.out.println("data1 = " + data1);
        System.out.println("=====================");
        int data2 = rd.nextInt(10);
        System.out.println("data2 = " + data2);
        System.out.println("=====================");
        int data3 = rd.nextInt(10)+1;
        System.out.println("data3 = " + data3);
    }
}
