import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişkenler
        int n;
        double result=0.0;

        //Scanner
        Scanner scan = new Scanner(System.in);

        //Veriyi al
        System.out.print("Sayiyi giriniz : ");
        n = scan.nextInt();

        for (double i=1; i<=n; i++){
             result += (1/i);
        }
        System.out.print("Sonuç : "+result);
    }
}