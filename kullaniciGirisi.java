package first;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Kullanıcı adınızı girin:");
        String kadi = input.nextLine();
        System.out.print("Şifrenizi girin:");
        String sifre = input.nextLine();

        boolean kullanici = kadi.equals("berenelts");
        boolean password = sifre.equals("123456");


        if((kullanici==true)&&(password==true)){
            System.out.println("Giriş başarılı..");
        } else if(kullanici == true && password== false){
            System.out.println("Şifreniz yanlış. Yapmak istediğiniz işlemi seçin \n Şifrenizi sıfırlamak için 1'e \n Sistemden çıkış yapmak için 2'ye basın");
            byte secim = input.nextByte();
            switch (secim){
                case 1:
                    System.out.print("Yeni şifrenizi girin:");
                    int yeni = input.nextInt();
                    if (yeni==123456){
                        System.out.print("Eski şifrenizden farklı bir şifre giriniz");
                    }else{
                        System.out.println("Yeni şifreniz\n" + yeni);
                    }
                    break;
                case 2:
                    System.out.println("Sistemden çıkış yapıldı");
            }

        }


    }
}
