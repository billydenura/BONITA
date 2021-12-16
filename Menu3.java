package com.company;

import java.io.*;
import java.util.*;

public class Menu3{
    public static void menuTiga(){
        Scanner input = new Scanner(System.in);
        System.out.println("\nSelamat datang di program \"Survey Perempuan Produktif\"");
        System.out.println("Program ini mengukur jumlah perempuan produktif di zona Anda.");
        System.out.printf("\nMasukkan nama zona : ");
        String zona = input.next();
        int x1,x2,x3,x4,x5,x6,y1,y2,a1,a2,a3,a4,a5,b1,c1;
        double total,totalpp,persenpp,persenxpp;

        System.out.print("Masukkan jumlah ibu rumah tangga yang berwirausaha : ");
        x1 = input.nextInt();
        System.out.print("Masukkan jumlah ibu rumah tangga biasa : ");
        y1 = input.nextInt();
        System.out.print("Masukkan jumlah perempuan yang bekerja di pemerintahan : ");
        x2 = input.nextInt();
        System.out.print("Masukkan jumlah perempuan yang bekerja di bidang kesehatan : ");
        x3 = input.nextInt();
        System.out.print("Masukkan jumlah perempuan yang bekerja di bidang industri : ");
        x4 = input.nextInt();
        System.out.print("Masukkan jumlah perempuan yang bekerja di bidang pendidikan : ");
        x5 = input.nextInt();
        System.out.print("Masukkan jumlah perempuan yang menempuh pendidikan : ");
        x6 = input.nextInt();
        System.out.print("Masukkan jumlah perempuan yang tidak bekerja : ");
        y2 = input.nextInt();

        System.out.print("Masukkan jumlah laki-laki yang bekerja di pemerintahan : ");
        a1 = input.nextInt();
        System.out.print("Masukkan jumlah laki-laki yang bekerja di bidang kesehatan : ");
        a2 = input.nextInt();
        System.out.print("Masukkan jumlah laki-laki yang bekerja di bidang industri : ");
        a3 = input.nextInt();
        System.out.print("Masukkan jumlah laki-laki yang bekerja di bidang pendidikan : ");
        a4 = input.nextInt();
        System.out.print("Masukkan jumlah laki-laki yang menempuh pendidikan : ");
        a5 = input.nextInt();
        System.out.print("Masukkan jumlah laki-laki yang tidak bekerja : ");
        b1 = input.nextInt();

        System.out.print("Masukkan jumlah anak-anak di bawah umur 5 tahun : ");
        c1 = input.nextInt();

        total = x1 + x2 + x3 + x4 + x5 + x6 + y1 + y2 + a1 + a2 + a3 + a4 + a5 + b1 + c1;
        totalpp = x1 + x2 + x3 + x4 + x5 + x6;

        persenpp = Math.round((totalpp*100) / total);
        persenxpp = 100 - persenpp;

        System.out.println();
        System.out.printf("Persentase perempuan produktif : %.0f%c\n",persenpp,'%');

        if(persenpp >= persenxpp){
            System.out.printf("Banyaknya perempuan yang produktif di zona %s sudah cukup\n",zona);
        }
        else if(persenpp < persenxpp){
            System.out.printf("Banyaknya perempuan yang produktif di zona %s masih kurang\n",zona);
        }
    }
}