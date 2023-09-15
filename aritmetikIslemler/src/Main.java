import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, b, c;

        Scanner inpt =new Scanner(System.in);

        System.out.print("a sayısını giriniz : ");
        a = inpt.nextInt();
        System.out.print("b sayısını giriniz : ");
        b = inpt.nextInt();
        System.out.print("c sayısını giriniz : ");
        c = inpt.nextInt();

        System.out.print("Sonuç :"+(a+b*c-b));
    }
}