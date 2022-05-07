package ucgen;

import java.util.Scanner;

public class UcgenAlanHesapla {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        double a;
        double b;
        double c;


        System.out.println("Lütfen ucgen icin 1. kenari giriniz: ");
        double sayi1 = scan.nextDouble();
        System.out.println("Lütfen ucgen icin 2. kenari giriniz: ");
        double sayi2 = scan.nextDouble();
        System.out.println("Lütfen ucgen icin 3. kenari giriniz: ");
        double sayi3 = scan.nextDouble();

ucgenCevre(sayi1,sayi2,sayi3);
ucgenAlan(sayi1,sayi2,sayi3);
double cevre=(sayi1+sayi2+sayi3);
}




    private static void ucgenAlan(double sayi1, double sayi2, double sayi3) {
        double cevre=(sayi1+sayi2+sayi3)/2;
        System.out.println("ucgenin alani: "+Math.sqrt((cevre/2)*(cevre/2-sayi1)*(cevre/2-sayi2)*(cevre/2-sayi3)));
    }

    public static void ucgenCevre(double sayi1, double sayi2, double sayi3) {
        System.out.println("ucgenin cevresi: "+(sayi1+sayi2+sayi3));
    }


}
