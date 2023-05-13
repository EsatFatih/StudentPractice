package day03;

import java.util.Arrays;
import java.util.Scanner;

public class C01 {
    /*
    Interwiew
         Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çeviren kodu yazınız.
         Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar.
          Genellikle çevirdikleri harfler şu şekilde:
         s -> 5
         a -> 4
         e -> 3
         i -> 1
         o -> 0
         OUTPUT :
          hackerDili("java ile hersey guzel")
          h4ck3rd1l1("j4v4 1l3 h3r53y guz3l")
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String girilenCumle = scanner.nextLine().toLowerCase();

        cevirenKod(girilenCumle);
    }

    private static void cevirenKod(String girilenCumle) {

        String arr[] = new String[girilenCumle.length()];
        for (int i = 0; i <girilenCumle.length() ; i++) {
            arr[i] = girilenCumle.substring(i,i+1);

        }
        System.out.println(Arrays.toString(arr));

        System.out.println("");

        for (int i = 0; i < girilenCumle.length(); i++) {
            if (arr[i].contains("s"))
                arr[i]= "5";
            if (arr[i].contains("a"))
                arr[i]= "4";
            if (arr[i].contains("e"))
                arr[i]= "5";
            if (arr[i].contains("i"))
                arr[i]= "1";
            if (arr[i].contains("o"))
                arr[i]= "0";
            System.out.print(arr[i]);

        }
    }
}
