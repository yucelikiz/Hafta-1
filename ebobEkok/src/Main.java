import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Burada girilecek değişkenler belirtiliyor
        int n1, n2, ebob;

        //Burada tarayıcı nesnesi oluşturuluyor
        Scanner scn = new Scanner(System.in);

        //Kullanıcıdan sayılar alınıyor
        System.out.print("Birinci sayıyı giriniz :");
        n1 = scn.nextInt();
        System.out.print("İkinci sayıyı giriniz :");
        n2 = scn.nextInt();

        //i değerini girilen sayıya eşitleyerek ebob'un daha az döngüde bulunması sağlanıyor
        int i = n1;
        while (i>1) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
                System.out.println("ebob değeri :"+ebob);

                //ebob bulunduktan sonra ekok'u bulmak ise çok daha kolay
                System.out.println("ekok değeri :"+(n1*n2)/ebob);
            }

            //Bu ifade döngüden girilen değerin her turda "1" sayı düşmesini sağlıyor
            i--;
        }
    }
}