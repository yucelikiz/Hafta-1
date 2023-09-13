import java.util.Scanner;
public class leapYear {
    public static void main(String[] args) {

        //Değişken
        int year;
        //Scanner objesi
        Scanner inpt = new Scanner(System.in);

        //Verileri al
        System.out.print("Yılı giriniz : ");
        year = inpt.nextInt();

        //Artık yılı hesapla
        if (year%4==0 || year%100==0 || year%400==0){
            System.out.print(year+" bir artık yıldır!");
        }else {
            System.out.print(year+" bir artık yıl değildir!");
        }
    }
}