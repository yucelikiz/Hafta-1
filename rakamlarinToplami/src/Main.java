import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişken
        int number, tempNumber, basValue, total=0;

        //Scanner
        Scanner scan =new Scanner(System.in);

        //Veriyi al
        System.out.print("Sayıyı giriniz :");
        number = scan.nextInt();

        /*Sayıyı mod10 ile böl ve kalan rakamları basValue değerine kaydet, işlemin sonunda total
        değişkeninde basValue değerlerini topla, her döngüde rakamı 10'a bölerek bir üst
        basamağa çık*/
        while (number !=0){
            basValue = number%10;
            number /=10;
            total += basValue;
        }
        System.out.print(total);


    }
}