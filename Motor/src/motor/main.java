package motor;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String brand;
        int type, unit, choice;
        boolean run = true;


        while (run) {
            kalkulasi motor1 = new kalkulasi();

            Scanner pilih = new Scanner(System.in);

            Scanner merk = new Scanner(System.in);
            System.out.println("Brand Motor");
            System.out.println("1. Beat");
            System.out.println("2. Aerox");
            System.out.println("3. PCX");
            choice = merk.nextInt();

            if (choice == 1) {
                System.out.println("1. Beat 2016");
                System.out.println("2. Beat 2020");

                System.out.println("===========");
                System.out.println("1. Beat 2017" + "\nRp 10.500.000");
                System.out.println("2. Beat 2020" + "\nRp 18.000.000");
                type = pilih.nextInt();
                motor1.setType(type);

                System.out.println("Unit Yang Dibeli :");
                Scanner unt = new Scanner(System.in);
                unit = unt.nextInt();
                motor1.setUnit(unit);

                System.out.println("Tipe Motor : " + motor1.getMerk1());
                System.out.println("Harga Motor Per Unit :" + motor1.getHarga1());
                System.out.println("Total Bayar :" + motor1.get_total1());

                System.out.println("Anda ingin lanjut?");

            }

            if (choice == 2) {
                System.out.println("1. Aerox 2017");
                System.out.println("2. Aerox 2021");

                System.out.println("===========");
                System.out.println("1. Aerox 2017" + "\nRp 13.000.000");
                System.out.println("2. Aerox 2021" + "\nRp 26.000.000");
                type = pilih.nextInt();
                motor1.setType(type);

                System.out.println("Unit Yang Dibeli :");
                Scanner unt = new Scanner(System.in);
                unit = unt.nextInt();
                motor1.setUnit(unit);

                System.out.println("Tipe Motor : " + motor1.getMerk2());
                System.out.println("Harga Motor Per Unit :" + motor1.getHarga2());
                System.out.println("Total Bayar :" + motor1.get_total2());


            }

            if (choice == 3) {
                System.out.println("1. PCX 2017");
                System.out.println("2. PCX 2020");

                System.out.println("===========");
                System.out.println("1. PCX 2017" + "\nRp 22.000.000");
                System.out.println("2. PCX 2020" + "\nRp 25.000.000");
                type = pilih.nextInt();
                motor1.setType(type);

                System.out.println("Unit Yang Dibeli :");
                Scanner unt = new Scanner(System.in);
                unit = unt.nextInt();
                motor1.setUnit(unit);

                System.out.println("Tipe Motor : " + motor1.getMerk3());
                System.out.println("Harga Motor Per Unit :" + motor1.getHarga3());
                System.out.println("Total Bayar :" + motor1.get_total3());


            }

        }

    }
}
