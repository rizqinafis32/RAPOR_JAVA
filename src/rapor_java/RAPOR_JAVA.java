/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rapor_java;
import java.util.Scanner;
/**
 *
 * @author ASUS
 * 
 */
public class RAPOR_JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nilaitugas,nilaiulangan,nilaipts,nilaipas;
        double ratarata;
        boolean running = true;
         Scanner input = new Scanner (System.in);       
        String ulang,nama;
        
        while (running){
            System.out.println("======RAPOR======");
            System.out.print("Nama = ");
            nama=input.nextLine();
            System.out.println("Silahkan Kepada "+ nama +"Memasukan 4 Nilai [Nilai Tugas,Nilai Ulangan Harian,Nilai PTS,Nilai PAS]");
            System.out.print("Nilai Tugas = ");
            nilaitugas=input.nextInt();
            System.out.print("Nilai Ulangan Harian = ");
            nilaiulangan=input.nextInt();
            System.out.print("Nilai PTS = ");
            nilaipts=input.nextInt();
            System.out.print("Nilai PAS = ");
            nilaipas=input.nextInt();
            
        ratarata=(nilaitugas+nilaiulangan+nilaipts+nilaipas)/4;
        if (ratarata>75){
            System.out.println("Rata Rata Anda Adalah "+ratarata);
            System.out.println("Anda Tidak Perlu Memperbaiki Atau Menambah Nilai");
        }else {
        System.out.println("Rata Rata Anda Adalah "+ratarata);
            System.out.println("Anda Perlu Memperbaiki Menambah Nilai");
        }
        input.nextLine();
            System.out.println("Apakah Anda Ingin Mengulang Program?[ya/tidak]");
            ulang=input.nextLine();
            if(ulang.equalsIgnoreCase("ya")){
            running = true;
            }if(ulang.equalsIgnoreCase("ya")){
            running = true;
            }if(ulang.equalsIgnoreCase("tidak")){
            running = false;
            }
            
        }
        
        
        
        
        
    }
    
}
