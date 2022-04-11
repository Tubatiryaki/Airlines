package ProjeGrupCalismasi;



import java.util.Scanner;

public class GrupAirlines {
    public static void main(String[] args) {
        /*
    A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
    Bilet tarifesi:
    km birim fiyati : 0.10$
    yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
    12 ve 24 yas arasindaysa 10% indirim,
    65 yasindan buyukse 30% indirim,
    bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz

 */

        Scanner scan = new Scanner(System.in);
        System.out.println("        ******   GRUP AIRLINES'E HOSGELDİNİZ   ******     \n" + "Lutfen gitmek istediginiz sehri seciniz: \nB\nC\nD");
        String sehir = scan.next();
        System.out.println("Bilet tercihinizi belirtiniz: \nTek yon icin : 1\nÇift yon icin: 2 ");
        int biletTercihi = scan.nextInt();
        System.out.println("Lütfen yasinizi giriniz: ");
        int yas = scan.nextInt();
        double bursaUcret = 500 * 0.10;
        double canakkaleUcret = 700 * 0.10;
        double diyarbakirUcret = 900 * 0.10;


        if (sehir.equalsIgnoreCase("B") || sehir.equalsIgnoreCase("C") || sehir.equalsIgnoreCase("D")) {

            if (yas > 65) {
                if (sehir.equalsIgnoreCase("B")) {
                    if (biletTercihi == 1) {
                        System.out.println("Odemeniz gereken miktar: " + bursaUcret * 0.7);

                    } else if (biletTercihi == 2) {
                        System.out.println("odemeniz gereken miktar: " + (bursaUcret * 0.7 * 0.8) * 2);

                    } else System.out.println("Bilgilerinizi kontrol ediniz");

                } else if (sehir.equalsIgnoreCase("C")) {
                    if (biletTercihi == 1) {
                        System.out.println("Odemeniz gereken miktar: " + canakkaleUcret * 0.7);
                    } else if (biletTercihi == 2) {
                        System.out.println("Odemeniz gereken miktar: " + (canakkaleUcret * 0.7 * 0.8) * 2);
                    } else System.out.println("Bilgilerinizi kontrol ediniz");
                } else if (sehir.equalsIgnoreCase("D")) {
                    if (biletTercihi == 1) {
                        System.out.println("Odemeniz gereken miktar: " + diyarbakirUcret * 0.7);
                    } else if (biletTercihi == 2) {
                        System.out.println("Odemeniz gereken miktar: " + (diyarbakirUcret * 0.7 * 0.8) * 2);
                    } else System.out.println("Bilgilerinizi kontrol ediniz");
                }else{
                    System.out.println("gitmek istediginiz sehri yaziniz");
                }

            } else if (yas >= 12 && yas < 24) {
                if (sehir.equalsIgnoreCase("B")) {
                    if (biletTercihi == 1) {
                        System.out.println("Odemeniz gereken miktar: " + bursaUcret * 0.9);
                    } else if (biletTercihi == 2) {
                        System.out.println("Odemeniz gereken miktar: " + (bursaUcret * 0.9 * 0.8) * 2);
                    } else {
                        System.out.println("Bilgilerinizi kontrol ediniz");
                    }
                } else if (sehir.equalsIgnoreCase("C")) {
                    if (biletTercihi == 1) {
                        System.out.println("Odemeniz gereken miktar: " + canakkaleUcret * 0.9);
                    } else if (biletTercihi == 2) {
                        System.out.println("Odemeniz gereken miktar: " + (canakkaleUcret * 0.9 * 0.8) * 2);
                    } else {
                        System.out.println("Bilgilerinizi kontrol ediniz");
                    }
                } else if (sehir.equalsIgnoreCase("D")) {
                    if (biletTercihi == 1) {
                        System.out.println("Odemeniz gereken miktar: " + diyarbakirUcret * 0.9);
                    } else if (biletTercihi == 2) {
                        System.out.println("Odemeniz gereken miktar: " + (diyarbakirUcret * 0.7 * 0.8) * 2);
                    } else {
                        System.out.println("Bilgilerinizi kontrol ediniz");
                    }
                }else{
                    System.out.println("gitmek istediginiz sehri yaziniz");
                }
            } else if (yas < 12) {
                if (sehir.equalsIgnoreCase("B")) {
                    if (biletTercihi == 1) {
                        System.out.println("Odemeniz gereken miktar: " + bursaUcret * 0.5);
                    } else if (biletTercihi == 2) {
                        System.out.println("Odemeniz gereken miktar: " + (bursaUcret * 0.5 * 0.8) * 2);
                    } else {
                        System.out.println("Bilgilerinizi kontrol ediniz");
                    }
                } else if (sehir.equalsIgnoreCase("C")) {
                    if (biletTercihi == 1) {
                        System.out.println("Odemeniz gereken miktar: " + canakkaleUcret * 0.5);
                    } else if (biletTercihi == 2) {
                        System.out.println("Odemeniz gereken miktar: " + (canakkaleUcret * 0.5 * 0.8) * 2);
                    } else System.out.println("Bilgilerinizi kontrol ediniz");
                } else if (sehir.equalsIgnoreCase("D")) {
                    if (biletTercihi == 1) {
                        System.out.println("Odemeniz gereken miktar: " + diyarbakirUcret * 0.5);
                    } else if (biletTercihi == 2) {
                        System.out.println("Odemeniz gereken miktar: " + (diyarbakirUcret * 0.5 * 0.8) * 2);
                    } else {
                        System.out.println("Bilgilerinizi kontrol ediniz");
                    }
                } else {
                    System.out.println("gitmek istediginiz sehri yaziniz");
                }
            } else if (yas >= 24 && yas <= 65) {
                    if (sehir.equalsIgnoreCase("B")) {
                        if (biletTercihi == 1) {
                            System.out.println("Odemeniz gereken miktar: " + bursaUcret);

                        } else if (biletTercihi == 2) {
                            System.out.println("Odemeniz gereken miktar: " + (bursaUcret * 0.8) * 2);
                        } else {
                            System.out.println("Bilgilerinizi kontrol ediniz");
                        }
                    } else if (sehir.equalsIgnoreCase("C")) {
                        if (biletTercihi == 1) {
                            System.out.println("Odemeniz gereken miktar: " + canakkaleUcret);
                        } else if (biletTercihi == 2) {
                            System.out.println("Odemeniz gereken miktar: " + (canakkaleUcret * 0.8) * 2);
                        } else {
                            System.out.println("Bilgilerinizi kontrol ediniz");
                        }
                    } else if (sehir.equalsIgnoreCase("D")) {
                        if (biletTercihi == 1) {
                            System.out.println("Odemeniz gereken miktar: " + diyarbakirUcret);
                        } else if (biletTercihi == 2) {
                            System.out.println("Odemeniz gereken miktar: " + (diyarbakirUcret * 0.8) * 2);
                        } else
                            System.out.println("Bilgilerinizi kontrol ediniz");
                    }
                }else{
                    System.out.println("Bilgilerinizi kontrol ediniz");
                }
            }
        }
    }










