import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            //Veri girişini aktif hale getirelim
            Scanner input = new Scanner(System.in);

            //veri türleri
            double boy, kilo, indeks;

            //ilk veri istenmesi
            System.out.print("Lütfen boyunuzu metre cinsinden giriniz : ");
            boy= input.nextDouble();
            //ikinci verinin istenmesi
            System.out.print("Lütfen kilonuzu kg cinsinden giriniz : ");
            kilo = input.nextDouble();

            //formül
            indeks = kilo/(boy*boy) ;

            //çıktı
            System.out.print("Vücut kitle indeksiniz : " + indeks);



    }
}


