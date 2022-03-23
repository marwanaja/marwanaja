package kalkulator.bubblesort;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Bubblesort {
    public static void main(String[] args) {
        int jumlah, i, j, swap, choice;
        String lanjut;
        boolean running = true;

        Scanner input = new Scanner(System.in);

        while (running) {

            Scanner scan = new Scanner(System.in);
            Scanner s = new Scanner(System.in);

            System.out.println("Program BubbleSort");
            System.out.println("==================");
            System.out.println("Masukan jumlah bilangan :");

            jumlah = scan.nextInt();
            int array[] = new int[jumlah];

            System.out.println("Masukan " + jumlah + " bilangan");

            for (i = 0; i < jumlah; i++) {
                System.out.println("Bilangan Ke " + (i+1));
                array[i] = scan.nextInt();
            }



            System.out.println("Pilih pengurutan");
            System.out.println("=================");
            System.out.println("1. Asceding");
            System.out.println("2. Desceding");
            choice = s.nextInt();

            if (choice == 1) {
                System.out.println("Before");
                for (int a = 0; a < jumlah; a++) {
                    System.out.println(array[a] + "");
                }

                for (i = 0; i < (jumlah - 1); i++) {
                    for (j = 0; j < jumlah - i - 1; j++) {
                        if (array[j] > array[j + 1]) {
                            swap = array[j];
                            array[j] = array[j + 1];
                            array[j + 1] = swap;
                        }
                    }
                }
                System.out.println("After");
                for (i = 0; i < jumlah; i++)
                    System.out.println(array[i]);

                System.out.println("Anda ingin keluar ?");
                System.out.println("[ya/tidak]");
                lanjut = input.nextLine();
                if (lanjut.equalsIgnoreCase("ya")) {
                    running = false;
                }
            }

            if (choice == 2) {
                System.out.println("Before");
                for (int k = 0; k < jumlah; k++) {
                    System.out.println(array[k]);
                }

                for (i = 0; i < (jumlah - 1); i++) {
                    for (j = 0; j < jumlah - i - 1; i++) {
                        if (array[j] < array[j + 1]) {
                            swap = array[j];
                            array[j] = array[j + 1];
                            array[j + 1] = swap;
                        }
                    }
                }
                System.out.println("After");
                for (i = 0; i < jumlah; i++)
                    System.out.println(array[i]);

                System.out.println("Anda ingin keluar ?");
                System.out.println("[ya/tidak]");
                lanjut = input.nextLine();
                if (lanjut.equalsIgnoreCase("ya")) {
                    running = false;
                }
            }
        }
    }
}