import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişken türleri burada belirtilir
        int n;
        double d;

        Scanner inpt = new Scanner(System.in);

        //Kullanıcı sayıları girer
        System.out.print("İnteger tipi sayınızı giriniz :");
        n = inpt.nextInt();
        System.out.print("Double tipi sayınızı giriniz :");
        d = inpt.nextDouble();

       //Casting işlemi burada yapılır
        double myDouble = n;
        int myInt = (int) d;

        //Dönüşen sayılar yeni değişkenleri ile yazdırılır
        System.out.println("Double'a dönüşen İnteger :"+ myDouble);
        System.out.print("Integer'e dönüşen Double :"+ myInt);
    }
}