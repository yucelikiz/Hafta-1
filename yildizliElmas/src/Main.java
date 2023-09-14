import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişken
        int n;

        //Scanner
        Scanner inpt = new Scanner(System.in);

        System.out.print("Sayıyı giriniz : ");
        n= inpt.nextInt();

        //for döngüsünü başlat ve ilk boşlukları yazdır
        for (int i=1; i<=n; i++){
            for (int k = 1; k <= (n-i); k++){
                System.out.print(" ");
            }
            for (int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Bu döngüde i değerini girilen sayıya eşitleyip, oradan geriye saydırıyoruz
        for (int i=n; i>0; i--){
            for (int k=0 ; k <= (n-i); k++){
                System.out.print(" ");
            }
            for (int j=1; j < (2*i)-2; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}