package com.company;

import java.io.*;
import java.util.*;

public class MenuUtama{

    public static void main(String[] args) {
        menu();
    }

    static void menu() {
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("Selamat datang di BONITA");
        System.out.println("/bəˈnitə/ n 1 Sebuah aplikasi untuk mendukung emansipasi wanita; 2 Sebuah nama perempuan yang berarti cantik;\n");
        printmenu();
        int pilihan = input.nextInt();
        switch (pilihan){
            case 1:
                Menu1.menuSatu();
                break;
            case 2:
                Menu2.menuDua();
                break;
            case 3:
                Menu3.menuTiga();
                break;
            case 0:
                break;
            default:
                System.out.println("Menu tidak ada");
            }
        System.out.printf("\n");
        tanya();
    }

    static void tanya(){
        Scanner input = new Scanner(System.in);
        System.out.println("Apakah anda ingin keluar dari program? 1 untuk keluar, 0 untuk kembali ke menu");
        int tny = input.nextInt();
        if(tny == 0) {
            menu();
        }
        else {
            System.out.println();
            System.out.print("Keluar");
        }
    }
    public static void printmenu (){
        System.out.println("Silahkan ketik 1 untuk masuk ke program \"Apakah Anda Siap Nikah?\"");
        System.out.println("Silahkan ketik 2 untuk masuk ke program \"Catatan Belanja Ibu\"");
        System.out.println("Silahkan ketik 3 untuk masuk ke program \"Survey Wanita Produktif\"");
        System.out.println("Silahkan ketik 0 untuk keluar ");
    }
}



