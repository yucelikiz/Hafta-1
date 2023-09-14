import java.util.Scanner;
public class minMax {
    public static void main(String[] args) {
        //Değişkenler
        int num, counter;

        //Scanner
        Scanner inpt = new Scanner(System.in);

        //Sayıları al
        System.out.print("Kaç adet sayı yazmak istediğinizi belirtiniz : ");
        counter = inpt.nextInt();

        //Negatif adet girilirse işlemi durdur
        if (counter<0) {
            System.out.print("Yanlış bir değer girdiniz!");

            //Pozitif adet girildiyse işleme devam et
        }else {
           int  max = Integer.MIN_VALUE;
           int  min = Integer.MAX_VALUE;

           //Sayıları büyükten küçüğe sırala
            for (int i=0; i<counter; i++){
                System.out.print("Sayıları giriniz :");
                num=inpt.nextInt();
                if (num>max){
                    max=num;
                }else if (num<min){
                    min=num;
                }
            }

            //Sonucu yazdır
            System.out.print("En büyük sayı :"+max+"\nEn küçük sayı :"+min);
        }
    }
}