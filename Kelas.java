package Latihan;
import java.util.Scanner;
public class Kelas {
    public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
        System.out.println("Enter your value: ");
        double a = in.nextDouble();
        Check check = new Check(a);
    }
}
