import java.util.Scanner;
public class Kombinasyon {
    public static void main(String[] args) {
        //Değişken
        int n, r, total=1, rtotal=1, nrtotal=1, result=1;

        //Scanner
        Scanner scan=new Scanner(System.in);

        //Veriyi al
        System.out.print("N eleman sayısını giriniz: ");
        n = scan.nextInt();
        System.out.print("r alt grup eleman sayısını giriniz: ");
        r= scan.nextInt();



        //N'nin faktöriyel değeri
        for (int i=1; i<=n; i++){
            total*=i;
        }
        System.out.println(n+"! faktöriyel değeri :"+ total+"'dir" );

        //Alt küme r'nin faktöriyel değeri
        for (int i=1; i<=r; i++){
            rtotal *=i;
        }
        System.out.println(r+"! faktöriyel değeri : "+rtotal);

        //N-r'nin faktöriyel değeri
        for (int i=1; i<=(n-r); i++){
            nrtotal*=i;
        }
        System.out.println("(n-r)'nin faktöriyel değeri : "+(n-r)+"! ="+nrtotal);

        //N'nin r elemanlı kombinasyonu
        result=total/(rtotal*nrtotal);
        System.out.print("C(n,r)=n!/(r!*(n-r)!) : "+result);
    }
}