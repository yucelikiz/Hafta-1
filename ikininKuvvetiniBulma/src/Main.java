import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Değişken
        int k, i=1;

        //Scanner objesi
        Scanner scan = new Scanner(System.in);

        //Verileri al
        System.out.print("Sınır sayısını giriniz : ");
        k = scan.nextInt();

        for (i=1; i<k; i*=4){
            System.out.println(i);
        }
        for (i=1; i<k; i*=5){
            System.out.println(i);
        }
    }
}