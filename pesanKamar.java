/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajarjava.livecodewargalab;

/**
 *
 * @author HP
 */
public class pesanKamar {
    String tipeKamar = null;
    int hargaKamar = 0;
    int berapaHari = 0;
    String penyewa = null;
    boolean member = false;
    
    pesanKamar(String tipeKamar, String penyewa, boolean member, int berapaHari) {
        this.tipeKamar = tipeKamar;
        this.penyewa = penyewa;
        this.member = member;
        this.berapaHari = berapaHari;        
    }

    public void setTipeKamar(String tipeKamar) {
        if (this.tipeKamar.equalsIgnoreCase("Reguler")) {
            this.hargaKamar = 100000;
        } else if ( this.tipeKamar.equalsIgnoreCase("Double Reguler")){
            this.hargaKamar = 200000;
        } else if ( this.tipeKamar.equalsIgnoreCase("Premium")){
            this.hargaKamar = 250000;
        } else if ( this.tipeKamar.equalsIgnoreCase("Deluxe")){
            this.hargaKamar = 350000;
        } else if ( this.tipeKamar.equalsIgnoreCase("Super Premium")){
            this.hargaKamar = 500000;
        } else {
            this.hargaKamar = 0;
        }
    }
    
    int hitungDiskon() {
        int diskon1 = 0;
        int diskon2 = 0;
        int diskon3 = 0;
        if ((hargaKamar * berapaHari) >= 700000) {
            diskon1 = 5;
        } else if ((hargaKamar * berapaHari) >= 500000) {
            diskon1 = 3;
        } else {
            diskon1 = 0;
        }
        
        if (berapaHari >= 7) {
            diskon2 = 10;
        } else {
            diskon2 = 0;
        }
        
        if (member) {
            diskon3 = 10;
        } else {
            diskon3 = 0;
        }
        
        return diskon1 + diskon2 + diskon3;
    }
    
    double hitungTotalHarga() {
        return (hargaKamar * berapaHari) * 100 / hitungDiskon();
    }
    
    void info(){
        System.out.println("Nama Penyewa :" + penyewa);
        System.out.println("Tipe Kamar   :" + tipeKamar);
        System.out.println("Total Hari   :" + berapaHari);
        System.out.println("Total Harga  :" + (hargaKamar * berapaHari) + "  -> diskon " + hitungDiskon() + "%");
        System.out.println("-->");
        System.out.println("Total Harga  :" + hitungTotalHarga());
    }
}
