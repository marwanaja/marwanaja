import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name;
        int type,waktu;

        //instant objek Hotel
        HitungTarif hotel = new HitungTarif();

        System.out.println("OYO RESERVATION");
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nama Anda:");

        //Memberi nilai ke variabel nama
        name = input.next();
        hotel.setName(name);

        System.out.println("\nPilih Jenis Kamar");
        System.out.println("1. Kamar Biasa Rp.250.000");
        System.out.println("2. Kamar Premium Rp.250.000");
        System.out.println("3. Kamar VIP Rp.750.000");

        Scanner choose = new Scanner(System.in);
        System.out.println("\nJenis Kamar Yang Dipilih :");
        type = choose.nextInt();
        hotel.SetType(type);

        Scanner time = new Scanner(System.in);
        System.out.println("\nEstimasi Penginapan :");
        waktu = time.nextInt();
        hotel.setWaktu(waktu);

        System.out.println("Receiving");
        System.out.println("Nama Pengunjung : "+hotel.getName());
        System.out.println("Jenis Kamar : "+hotel.get_kamar());
        System.out.println("Total Penginapan : "+hotel.get_harga());
        System.out.println("Total Pembayaran : "+hotel.get_total());
    }
}
