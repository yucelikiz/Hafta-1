import java.util.Scanner;
public class Division {
    public static void main(String[] args) {

        //Değişken
        int k, i;

        //Scanner nesnesi
        Scanner inpt = new Scanner(System.in);

        //Veriyi al
        System.out.print("Lütfen sayıyı giriniz : ");
        k = inpt.nextInt();

        //Sayıyı kontrol et ve yazdır
        for (i=1; i<=k; i++){
            if (i%3==0 && i%4==0){
                System.out.println(i);
            }
        }

    }
}