import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Atm uygulaması projesi

        //Değişkenleri en üstte tnımlıyoruz, kullanıcı adı ve şifre String olarak, rakamlar İnteger olarak saklanacak
        String userName, password;
        int right=3, balance=1500, select, price=0;

        //Tarama nesnesini ekliyoruz
        Scanner scan = new Scanner(System.in);

        //Burada kullanıcıya 3 giriş hakkı veriliyor
        while (right > 0){
            //Kullanıcı adı ve şifresini bu blokta istiyoruz
            System.out.print("Kullanıcı adınızı giriniz :");
            userName = scan.nextLine();
            System.out.print("Şifrenizi giriniz :");
            password = scan.nextLine();
            if (userName.equals("patika") && password.equals("java123")){
                System.out.println("Merhaba, Patika Bankasına hoşgeldiniz!");
                do {
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz: \n"+
                            "1-Para Yatırma \n"+"2-Para Çekme \n"+"3-Bakiye Sorgula \n"+"4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz :");

                    select = scan.nextInt();
                    switch (select) {
                        case 1 -> {
                            System.out.print("Yatırmak istediğiniz para miktarı : ");
                            price = scan.nextInt();
                            balance += price;
                            System.out.println("Yeni bakiyeniz : " + balance);
                        }
                        case 2 -> {
                            System.out.print("Çekmek istediğiniz miktarı : ");
                            price = scan.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiyeniz yetersizdir!");
                            } else {
                                balance -= price;
                                System.out.println("Yeni bakiyeniz: " + balance);
                            }
                        }
                        case 3 -> System.out.println("Bakiyeniz: " + balance);
                    }
                }while (select !=4);
                System.out.print("Tekrar görüşmek üzere..");
                break;
            }
            else {
                right --;
                System.out.println("Yanlış kullanıcı adı veya şifre. Tekrar deneyiniz");
                if (right==0){
                    System.out.println("Hesabınız bloke olmuştur, lütfen banka ile iletişime geçiniz.");
                }else {
                    System.out.println("Kalan hakkınız : "+right);
                }

            }


        }
    }
}