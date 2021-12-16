package com.company;

import java.io.*;
import java.util.*;

public class Menu1{
    public static void menuSatu(){
        Scanner input = new Scanner(System.in);
        String jawaban;
        int y = 0,n = 0;
        System.out.println();
        System.out.println("Selamat datang di program \"Apakah Anda Siap Nikah?\"");
        System.out.println("Program ini mengukur kesiapan Anda dalam melaksanakan pernikahan.");
        System.out.println("\nSilahkan jawab pertanyaan di bawah ini sejujur-jujurnya dengan \"y\" (ya) atau \"n\" (tidak)!\n");

        System.out.println("Apakah usia Anda lebih dari 21 tahun?");
        jawaban = input.next();
        if(jawaban.equals("y")){
            y=y+1;
        }
        else if(jawaban.equals("n")){
            n=n+1;
        }
        else{
            System.out.println("Error");
        }

        System.out.println("Apakah Anda mampu menyelesaikan masalah secara cepat dan tepat?");
        jawaban = input.next();
        if(jawaban.equals("y")){
            y=y+1;
        }
        else if(jawaban.equals("n")){
            n=n+1;
        }
        else{
            System.out.println("Error");
        }

        System.out.println("Apakah Anda mampu menjadi orang tua yang memberikan teladan kepada anak-anaknya?");
        jawaban = input.next();
        if(jawaban.equals("y")){
            y=y+1;
        }
        else if(jawaban.equals("n")){
            n=n+1;
        }
        else{
            System.out.println("Error");
        }

        System.out.println("Apakah Anda mandiri dalam hal keuangan?");
        jawaban = input.next();
        if(jawaban.equals("y")){
            y=y+1;
        }
        else if(jawaban.equals("n")){
            n=n+1;
        }
        else{
            System.out.println("Error");
        }

        System.out.println("Apakah Anda siap menghadapi kekurangan pasangan Anda?");
        jawaban = input.next();
        if(jawaban.equals("y")){
            y=y+1;
        }
        else if(jawaban.equals("n")){
            n=n+1;
        }
        else{
            System.out.println("Error");
        }

        System.out.println("Apakah Anda siap menghadapi sikap yang kurang baik dari keluarga besar?");
        jawaban = input.next();
        if(jawaban.equals("y")){
            y=y+1;
        }
        else if(jawaban.equals("n")){
            n=n+1;
        }
        else{
            System.out.println("Error");
        }

        System.out.println("Apakah Anda siap menyesuaikan diri dengan berbagai kondisi lingkungan?");
        jawaban = input.next();
        if(jawaban.equals("y")){
            y=y+1;
        }
        else if(jawaban.equals("n")){
            n=n+1;
        }
        else{
            System.out.println("Error");
        }

        System.out.println("Apakah Anda siap berdiskusi dengan pasangan Anda bila terjadi suatu masalah?");
        jawaban = input.next();
        if(jawaban.equals("y")){
            y=y+1;
        }
        else if(jawaban.equals("n")){
            n=n+1;
        }
        else{
            System.out.println("Error");
        }

        System.out.println("Apakah Anda telah mengetahui peran dan tanggung jawab sebagai istri/suami?");
        jawaban = input.next();
        if(jawaban.equals("y")){
            y=y+1;
        }
        else if(jawaban.equals("n")){
            n=n+1;
        }
        else{
            System.out.println("Error");
        }

        System.out.println("Apakah Anda siap mengesampingkan kepentingan pribadi untuk mencapai kepentingan bersama?");
        jawaban = input.next();
        if(jawaban.equals("y")){
            y=y+1;
        }
        else if(jawaban.equals("n")){
            n=n+1;
        }
        else{
            System.out.println("Error");
        }

        System.out.println("Apakah Anda dapat berbicara jujur meskipun yang dibicarakan menyakitkan dan merupakan fakta");
        jawaban = input.next();
        if(jawaban.equals("y")){
            y=y+1;
        }
        else if(jawaban.equals("n")){
            n=n+1;
        }
        else{
            System.out.println("Error");
        }

        int total = y + n;

        if(total < 11){
            System.out.println("\nError");
        }
        else if(y>n){
            System.out.println("\nAnda mungkin sudah siap untuk menikah.");
        }
        else if(y<n){
            System.out.println("\nAnda belum siap untuk menikah.");
        }
    }
}