import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //fibo serisi her zaman 0 ve 1 ile başladığı için ilk iki n bu sayılara tanımlandı
        //üçüncü değişken ilk iki değişkenin toplamına atandı, böylece sonrasında yeni sayılar geldikçe n3 onları toplayacak
        int n, n1=0, n2=1, n3=n1+n2;

        //Scanner nesnesi burada çağırılacak
        Scanner inpt = new Scanner(System.in);

        //Veri girişinin yapıldığı blok
        System.out.print("Eleman sayısını giriniz :");
        n = inpt.nextInt();

        //0 ve 1 while döngüsü başlamadan otomatik yazdırılıyor
        System.out.print("Fibonacci sayıları :"+n1+" "+n2+" ");


        //ilk 2 değeri otomatik yazdırdığımız için eleman sayısından 2 sayı düşüyoruz.
        while (n-2>0){
            System.out.print(n3+" ");
            n--; //eleman sayısı döngü sayısını belirleyecek
            n1=n2;
            n2=n3;
            n3=n1+n2; //Burada her döngüde n sayılarını güncelleyip bir önceki ile topluyoruz.

        }
    }
}