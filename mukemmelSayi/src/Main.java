import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişken
        int n, total=0;

        //Scanner
        Scanner scan = new Scanner(System.in);

        //Verileri al
        System.out.print("Sayınızı giriniz : ");
        n = scan.nextInt();

        for (int i=1; i<n; i++){
            if (n % i ==0){
                total +=i;
            }
        }
        if (total==n){
            System.out.print(n+" mükemmel sayıdır!");
        }else {
            System.out.print(n+" mükemmel sayı değildir!");
        }
    }
}