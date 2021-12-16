package com.company;

import java.io.*;
import java.util.*;

public class Menu2{
    public static void menuDua(){
        // Deklarasi variabel
        Scanner input = new Scanner(System.in);
        double pemasukan,total = 0,sisa;
        int n,nomor = 0;

        // Deklarasi array
        String[] jenis;
        double[] pengeluaran;

        // Input data
        System.out.println("\nSelamat datang di program \"Catatan Belanja Ibu\"");
        System.out.printf("Program ini hadir untuk membantu para ibu rumah tangga dalam mengelola pengeluarannya,\njuga mengindikasi tingkat kehematan si ibu.\n");
        System.out.print("\nMasukkan pemasukan mingguan : ");
        pemasukan = input.nextDouble();
        input.nextLine();
        System.out.print("Masukkan banyaknya jenis pengeluaran : ");
        n = input.nextInt();
        input.nextLine();

        // Instansiasi array
        jenis = new String[n];
        pengeluaran = new double[n];

        // Proses
        for(int i = 0;i < n;i++){
            System.out.print("Jenis pengeluaran : ");
            jenis[i] = input.nextLine();
            System.out.print("Biaya pengeluaran : ");
            pengeluaran[i] = input.nextDouble();
            input.nextLine();
            total = total + pengeluaran[i];
        }

        sisa = pemasukan - total;

        // Output Formatting
        System.out.printf("\nPemasukan anda sebesar Rp%.0f\n",pemasukan);
        System.out.println("\nRiwayat Pengeluaran Belanja Mingguan");
        System.out.println("---------------------------------------");
        System.out.printf("%-6s%-20s%-15s\n","No.","Jenis Pengeluaran","Biaya(Rupiah)");
        System.out.println("---------------------------------------");
        for(int i = 0;i < n;i++){
            nomor++;
            System.out.printf("%-6d%-20s%-15.0f\n",nomor,jenis[i],pengeluaran[i]);
        }
        System.out.println("---------------------------------------");
        System.out.printf("%-26s%-15.0f\n","Total",total);
        System.out.println("---------------------------------------");

        System.out.printf("\nSisa dari pemasukan Anda sebesar Rp%.0f\n",sisa);
        if(total > pemasukan){
            System.out.println("Pengeluaran Anda melebihi pemasukan.");
        }
        else if(total <= (0.8 * pemasukan)){
            System.out.println("Pengeluaran Anda tidak lebih dari 80% pemasukan. Selamat Anda SUDAH HEMAT!");
        }
        else if(total > (0.8 * pemasukan)){
            System.out.println("Pengeluaran Anda melebihi 80% dari pemasukan. Anda MASIH KURANG HEMAT!");
        }
    }
}