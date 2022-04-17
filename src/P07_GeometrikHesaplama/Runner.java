package P07_GeometrikHesaplama;

import java.util.Scanner;

public class Runner extends Sekil {
    static Scanner scan = new Scanner(System.in);
    static double ucgenCevre;
    public static void main(String[] args) {
        System.out.println("Lütfen hesaplamasini yapmak istediginiz sekli seciniz: \n1-Dikdortgen\n2-Kare\n3-Cember");
        int sekil=scan.nextInt();
        if (sekil==1||sekil==2||sekil==3){
            if (sekil==1){

                try {
                    System.out.println("lütfen dikdorgen icin 1. kenar uzunlugunu girin: ");
                    int sayi1=scan.nextInt();
                    System.out.println("lütfen dikdorgen icin 2. kenar uzunlugunu girin: ");
                    int sayi2=scan.nextInt();
                    if (sayi1<=0){
                        throw new IllegalAccessException();
                    }else if (sayi2<=0){
                        throw new IllegalAccessException();
                    }else{
                    Dikdortgen obj1=new Dikdortgen();
                    obj1.alanDikdortgenHesaplama(sayi1,sayi2);
                    obj1.dikdortgeninCevresiHesaplama(sayi1,sayi2);
                    }
                } catch (IllegalAccessException e) {
                    System.out.println("girdiginiz degerler sifirdan buyuk olmali");
                }

            }else if (sekil==2) {


                try {
                    System.out.println("lütfen kare icin 1. kenar uzunlugunu girin: ");

                    int sayi1Kare = scan.nextInt();
                    if (sayi1Kare<0){
                        throw new IllegalAccessException();
                    }else {

                        Kare obj2 = new Kare();
                        obj2.kareAlanHesaplama(sayi1Kare);
                        obj2.kareCevreHesaplama(sayi1Kare);
                    }
                } catch (IllegalAccessException e) {
                    System.out.println("girdiginiz degerler sifirdan buyuk olmali");
                }
            }else if (sekil==3) {

                try {
                    System.out.println("lütfen cember icin 1. kenar uzunlugunu girin: ");
                    int sayi1Cember = scan.nextInt();
                    if (sayi1Cember<0){
                        throw new IllegalAccessException();
                    }else {

                        Cember obj3 = new Cember();
                        obj3.cemberAlanHesaplama(sayi1Cember);
                        obj3.cemberCevreHesaplama(sayi1Cember);
                    }
                } catch (IllegalAccessException e) {
                    System.out.println("girdiginiz degerler sifirdan buyuk olmali");
                }


            }

            }

        }





    }



