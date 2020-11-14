/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119047.latihan42.tabungan;

import data.Tabungan;
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara
 * KELAS    : PBO2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI BERISI PROGRAM PENARIKAN UANG
 */

public class PBOIF210119047Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int uangAmbil;
        

        Scanner input = new Scanner(System.in);
        
        System.out.println("=====Program Penarikan Uang====");
        
        System.out.print("Masukkan Saldo Awal : ");
        Tabungan tabungan = new Tabungan(input.nextInt());
        
        System.out.print("Jumlah Uang Yang Diambil : ");
        uangAmbil = tabungan.ambilUang(input.nextInt());
        
        System.out.println("Saldo Anda Sekarang : " + uangAmbil);
        
    }
    
}
