package Booking_tiket_bioskop;

import java.util.Scanner;

public class Pesan {
    public static void main(String[] args) {
        String pemesan,film;
        int waktu, orang ;

        System.out.println("Cinema XXI");
        System.out.println("Atas Nama : ");
        Scanner nama = new Scanner(System.in);
        pemesan = nama.next();
        System.out.println("Nama : "+pemesan);

        System.out.println("==========================");
        System.out.println("FILM HARI INI");
        System.out.println("1. Si Bolang");
        System.out.println("2. Jejak Petualang");
        System.out.println("3. Puncak Komedi");
        Scanner pilihfilm = new Scanner(System.in);
        film = pilihfilm.next();
        System.out.println("Film Yang Dipilih : "+film);

        System.out.println("PADA HARI :");
        System.out.println("1. Minggu /Rp 45.000");
        System.out.println("2. Senin");
        System.out.println("3. Selasa");
        System.out.println("4. Rabu");
        System.out.println("5. Kamis");
        System.out.println("6. Jumat");
        System.out.println("7. Sabtu");
        Scanner hari = new Scanner(System.in);
        waktu = hari.nextInt();
        System.out.println("Hari Yang Dipilih : "+waktu);

        System.out.println("Jumlah Tiket :");
        Scanner tiket = new Scanner(System.in);
        orang = tiket.nextInt();
        System.out.println("Tiket yang dipesan : "+orang);



        switch (waktu){
            case 1 :
                int harga = 45000;
                System.out.println("Pada Hari : Minggu");
                System.out.println(harga*orang);
                break;
            case 2:
                int harga1 = 35000;
                System.out.println("Senin");
                System.out.println(harga1*orang);
                break;
            case 3:
                int harga2 = 35000;
                System.out.println("Selasa");
                System.out.println(harga2*orang);
                break;
            case 4:
                int harga3 = 35000;
                System.out.println("Rabu");
                System.out.println(harga3*orang);
                break;
            case 5:
                int harga4 = 35000;
                System.out.println("Kamis");
                System.out.println(harga4*orang);
                break;
            case 6:
                int harga5 = 35000;
                System.out.println("Jumat");
                System.out.println(harga5*orang);
                break;
            case 7:
                int harga6 = 45000;
                System.out.println("Sabtu");
                System.out.println(harga6*orang);
                break;

        }
    }
}
