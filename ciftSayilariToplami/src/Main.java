import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Değişken
        int k, total=0;

        //Scanner objesi
        Scanner inpt =new Scanner(System.in);

        //Veriyi al
        do {
            System.out.print("Lütfen sayıyı giriniz :");
            k = inpt.nextInt();
            //Çift ve dördün katı olduğunu kontrol et
            if (k%2==0 && k%4==0){
               total +=k;
            }
        //Tek sayı girilirse döngüyü sonlandır
        }while (k%2==0);
        System.out.print("Toplam : "+total);
    }
}