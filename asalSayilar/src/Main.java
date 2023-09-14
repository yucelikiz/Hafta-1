public class Main {
    public static void main(String[] args) {

        System.out.print("1-100 arasındaki asal sayılar:");
        boolean prime;
        //Sayıları kontrol edecek olan for döngüsü
        for (int i=2; i<=100; i++){
            //sayıların asal olduğunu var say
            prime=true;
            //sayının asal olup olmadığını kontrol et
            for (int j=2; j<i; j++){
                //eğer sayı kendinden öncekilere tam bölünebiliyorsa asal değildir, döngü sona erer
                if (i%j==0){
                    prime=false;
                    break;
                }
            }
            //sayı asalsa sonuca yazdırılır
            if (prime){
                System.out.print(i+" ");
            }

        }
    }
}