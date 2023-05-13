package day03;

import java.util.Scanner;

public class C08 {

    // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
    // bunu kart sifre kontrol de de kullabilirsiniz


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen sifre giriniz");
        String sifre = scanner.nextLine();

        // sifre en az 8 karakter olmalidir
        // sifre en az 3 adet karakter *,/,-, icermelidir
        // sifre en az 1 buyuk ve 1 kucuk karakter icermelidir

        int sayac =0;

        if (!(sifre.length()>=8)){
            sayac++;
            }
        if (!(sifre.contains("*")&&sifre.contains("/")&&sifre.contains("-"))){
            sayac++;
        }
        //if (sifre.charAt()>'a'&& sifre.charAt()<'z'&& sifre.charAt())
       if (!sifre.contains(sifre.toUpperCase())){
              sayac++;
          }
       if (sayac==0){
           System.out.println("Sifre gecerlidir");
       }else {
           System.out.println("Sifre gecersizdir");
       }
    }



}
