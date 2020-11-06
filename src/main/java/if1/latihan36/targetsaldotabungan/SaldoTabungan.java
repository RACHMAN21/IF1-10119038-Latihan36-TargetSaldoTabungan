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
 * Deskripsi Program : program ini berisi class SaldoTabungan
 * 
 */

import java.util.Locale;

public class SaldoTabungan {
    Locale locale = Locale.forLanguageTag("id");
    private double bunga;
    
    private void hitungBunga(double bungaAwal) {
        bunga = bungaAwal / 100;
    }
    
    public void hitungSaldo(double bungaAwal, double saldo, double target) {
        hitungBunga(bungaAwal);
        int num = 1;
        while(saldo <= target) {
            saldo = saldo + (saldo * bunga);
            tampilSaldo(saldo,num);
            num++;
        }
    }
    
    private void tampilSaldo(double saldo, int num) {
        System.out.printf("Sald di bulan ke-"+num+" Rp.");
        System.out.printf(locale, "%,.0f%n", saldo);
    }
}