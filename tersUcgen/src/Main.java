import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişken
        int n;

        //Scanner
        Scanner scan = new Scanner(System.in);

        System.out.print("Sayıyı giriniz : ");
        n = scan.nextInt();

        //for döngüsünü başlat ve ters üçgeni oluştur.
        for (int i=n; i>=0; i--){
            for (int k = 1; k<=(n-i); k++){
                System.out.print(" ");
            }
            for (int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}