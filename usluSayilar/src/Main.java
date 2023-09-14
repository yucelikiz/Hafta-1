import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişkenler
        int n,k;

        //Scanner
        Scanner scan = new Scanner(System.in);

        //Verileri al
        System.out.print("Üssü alınacak sayıyı giriniz: ");
        n= scan.nextInt();
        System.out.print("Üs olacak sayıyı giriniz: ");
        k= scan.nextInt();

        int result= 1;

        for (int i=1; i<=k; i++){
            result=result*n;
        }
        System.out.print("Sonuç :"+result);
    }
}