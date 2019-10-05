/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pert2.pkg10118046.latihan27.hurufbesarhurufkecil;

import java.util.Scanner;

/**
 *
 * @author
 *  Nama              : M. Hilmy Naufal
 *  Kelas             : IF2
 *  NIM               : 10118046
 *  Deskripsi Program : mengubah kalimat acak menjadi huruf besar dan huruf kecil
 */
public class PBO2PERT210118046Latihan27HurufBesarHurufKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Masukkan kalimat: ");
        Scanner scanner = new Scanner(System.in);
        String kalimat = scanner.next();
        System.out.println("\n======Hasil Formatting======");
        System.out.println("Huruf Besar: " + kalimat.toUpperCase());
        System.out.println("Huruf Kecil: " + kalimat.toLowerCase());

        System.out.println("Developed by: M. Hilmy Naufal");
    }

}
