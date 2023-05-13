package day03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class C07 {

    // Verilen int array’deki her elementin karelerini alip,
    // karelerinin toplamini yazdiran bir method olusturun.

    public static void main(String[] args) {

        // int [] arr = {2,3};
        arrayYazdir();
    }

    public static void arrayYazdir(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen array in boyutunu giriniz");
        int boyut = scanner.nextInt();

        int[] arr = new int[boyut];


        for (int i = 0; i < boyut; i++) {
            System.out.println("Array in elemanlarını giriniz");
            int eleman= scanner.nextInt();
            arr[i]=eleman;
        }

        System.out.println(Arrays.toString(arr));

        int toplam = 0;
        for (int each: arr ) {
            toplam=toplam+each*each;

        }

        System.out.println(toplam);

    }

}
