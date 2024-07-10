/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package belajarjava.livecodewargalab;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class LivecodeWargalab {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.println("Pesan Kamar");
            System.out.print("Nama :");
            String nama = input.nextLine();
            
            System.out.print("Umur :");
            int umur = input.nextInt();
            input.nextLine();
            
            System.out.print("Member (y/n):");
            String isMember = input.nextLine();
            boolean member = false;
            if (isMember.equalsIgnoreCase("y")) {
                member = true;
            } else {
                member = false;
            }
            System.out.print("Tipe Kamar :");
            String tipeKamar = input.nextLine();
            
            System.out.print("Berapa Hari :");
            int berapaHari = input.nextInt();
            input.nextLine();

            if (umur >= 19) {
                pesanKamar pesan = pesanKamar(tipeKamar,nama,member,berapaHari);
                pesan.info();
                System.out.print("Ingin memesan kamar lagi (y/n):");
                String tanya = input.nextLine();
                if (isMember.equalsIgnoreCase("n")) {
                    break;
                }
            } else {
                System.out.println("Maaf Anda Belum Cukup Umur Untuk Memesan Kamar");
                break;
            }
        }
    }
}
