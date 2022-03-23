package kalkulator;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        int num1, num2;
        double result;
        String next, choice;
        boolean running = true;

        while (running){
            Scanner input = new Scanner(System.in);

            System.out.println("Kalkulator Sederhana");
            System.out.println("====================");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Perkalian");
            System.out.println("3. Pembagian");
            System.out.println("4. Modulus");
            System.out.println("5. Pengurangan");
            System.out.println("Pilih Operator :");
            next = input.next();

            if(next.equals("1")){
                System.out.println("Masukan Bilangan Pertama :");
                num1 = input.nextInt();
                System.out.println("Masukan Bilangan Kedua :");
                num2 = input.nextInt();

                result = num1 + num2;
                System.out.println("Hasil Penjumlahan : "+result);

            }else if (next.equals("2")){
                System.out.println("Masukan Bilangan Pertama :");
                num1 = input.nextInt();
                System.out.println("Masukan Bilangan Kedua :");
                num2 = input.nextInt();

                result = num1 * num2;

                System.out.println("Hasil Perkalian : "+result);

            }else if (next.equals("3")){
                System.out.println("Masukan Bilangan Pertama :");
                num1 = input.nextInt();
                System.out.println("Masukan Bilangan Kedua :");
                num2 = input.nextInt();

                result = num1 / num2;

                System.out.println("Hasil Pembagian : " +result);

            }else if (next.equals("4")){
                System.out.println("Masukan Bilangan Pertama :");
                num1 = input.nextInt();
                System.out.println("Masukan Bilangan Kedua :");
                num2 = input.nextInt();

                result = num1 % num2;

                System.out.println("Hasil Pengurangan : " +result);

            }else if (next.equals("5")){
                System.out.println("Masukan Bilangan Pertama :");
                num1 = input.nextInt();
                System.out.println("Masukan Bilangan Kedua :");
                num2 = input.nextInt();

                result = num1 - num2;

                System.out.println("Hasil Pengurangan : " +result);
            }


            System.out.println("Anda Ingin Lanjut ?");
            System.out.println("[ya/tidak]");
            choice = input.next();
            if (choice.equalsIgnoreCase("ya")){
                running = true;

            }else if (choice.equalsIgnoreCase("tidak")){
                running = false;
            }


        }

    }
}
