import java.util.Scanner;
public class Ticket {
    public static void main(String[] args) {

        //Değişkenler
        int range, age, tripType;
        double charge,ageDiscount,tripDiscount,total,reducedCharge;

        //Scanner nesnesi
        Scanner inpt = new Scanner(System.in);

        //Kullanıcıdan verileri al
        System.out.print("Lütfen gidilecek mesafeyi KM olarak girin :");
        range = inpt.nextInt();

        System.out.print("Lütfen yaşınızı girin :");
        age = inpt.nextInt();

        System.out.print("Lütfen yolculuk türünü, 1(Tek Yön) ya da 2(Gidiş-Geliş) olarak girin :");
        tripType = inpt.nextInt();
        if (tripType<1 || tripType>2 || age<1 || age>120 ||range<1){
            System.out.print("Hatalı veri girdiniz!");
        }

        //Ücreti hesapla
        else if (tripType==1){
            if (age<12){
                charge =range*0.10;
                ageDiscount = charge*0.50;
                total = charge-ageDiscount;
            } else if (age>=12 && age<=24) {
                charge =range*0.10;
                ageDiscount = charge*0.10;
                total = charge-ageDiscount;
            } else if (age>24 && age<=65) {
                charge =range*0.10;
                total = charge;
            } else {
                charge = range*0.10;
                ageDiscount = charge*0.30;
                total = charge-ageDiscount;

            }
            System.out.print("Toplam Tutar : "+total);
        } else if (tripType==2) {
            if (age<12){
                charge =range*0.10;
                ageDiscount = charge*0.50;
                reducedCharge = charge-ageDiscount;
                tripDiscount =reducedCharge*0.20;
                total = charge-(tripDiscount+ageDiscount);
            } else if (age>=12 && age<=24) {
                charge =range*0.10;
                ageDiscount = charge*0.10;
                reducedCharge = charge-ageDiscount;
                tripDiscount =reducedCharge*0.20;
                total = charge-(ageDiscount+tripDiscount);
            } else if (age>24 && age<=65) {
                charge =range*0.10;
                tripDiscount = charge*0.20;
                total = charge-tripDiscount;
            } else {
                charge = range*0.10;
                ageDiscount = charge*0.30;
                reducedCharge = charge-ageDiscount;
                tripDiscount =reducedCharge*0.20;
                total = charge-(ageDiscount+tripDiscount);
            }
            System.out.print("Toplam Tutar : "+(total*2));
        }


    }
}