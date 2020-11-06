/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.latihan36.targetsaldotabungan;

/**
 *
 * @author
 * NAMA  : Rachman Aldiansyah
 * KELAS : IF-1
 * NIM   : 10119038
 * Deskripsi Program : program ini berisi untuk menampilkan hasil saldo yang
 *                     di target kan
 */

import java.util.Scanner;

public class Tester {
    static Scanner scan = new Scanner(System.in);
    private static Double saldoAwal, bungaAwal, targetSaldo;


    private static void masukkanSaldo(){
        System.out.print("Saldo Awal : Rp.");
        saldoAwal =  Double.parseDouble(scan.next().replaceAll("[$,.]", ""));
        System.out.print("Bunga/Bulan(%) : ");
        bungaAwal = scan.nextDouble();
        System.out.print("Saldo Target : Rp. ");
        targetSaldo = Double.parseDouble(scan.next().replaceAll("[$,.]", ""));
    }

    public static void main(String[] args) {
        SaldoTabungan saldoTarget = new SaldoTabungan();
        masukkanSaldo();
        saldoTarget.hitungSaldo(bungaAwal, saldoAwal, targetSaldo);
        System.out.println("Developed by : Rachman Aldiansyah");
    }
}