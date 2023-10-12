/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.posttest2;
import com.mycompany.sepeda.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

/**
 *
 * @author ASUS
 */
public class Posttest2 {

    public static void main(String[] args) {
        ArrayList<Sepeda> daftarSepeda = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

    
        
        while (true) {
            System.out.println("=================================");
            System.out.println("|           Menu:               |");
            System.out.println("---------------------------------");
            System.out.println("|1. Tambah Sepeda               |");
            System.out.println("|2. Lihat Daftar Sepeda         |");
            System.out.println("|3. Update Sepeda               |");
            System.out.println("|4. Hapus Sepeda                |");
            System.out.println("|5. Keluar                      |");
            System.out.println("=================================");
            System.out.print("Pilih Menu yang Anda inginkan: ");

            String pilihan = scanner.nextLine();


            switch (pilihan) {
                case "1":
                    System.out.print("Masukkan nama sepeda yang ingin ditambahkan: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan merk sepeda: ");
                    String merk = scanner.nextLine();
                    System.out.print("Masukkan harga sepeda: ");
                    double harga = Double.parseDouble(scanner.nextLine());

                    Sepeda sepeda = new Sepeda(nama, merk, harga);
                    daftarSepeda.add(sepeda);
                    System.out.println("Sepeda telah berhasil ditambahkan");
                    break;

                case "2":
                    if (daftarSepeda.isEmpty()) {
                        System.out.println("Tidak ada daftar sepeda ");
                    } else {
                        System.out.println("Daftar sepeda:");
                        for (Sepeda p : daftarSepeda) {
                            System.out.println(p);
                        }
                    }
                    break;

                case "3":                
                    System.out.print("Masukkan nama sepeda yang ingin diupdate: ");
                    String namaUpdate = scanner.nextLine();
                    boolean ditemukanUpdate = false;

                    for (int i = 0; i < daftarSepeda.size(); i++) {
                        Sepeda s = daftarSepeda.get(i);
                        if (s.getNama().equalsIgnoreCase(namaUpdate)) {
                            System.out.print("Masukkan nama baru: ");
                            String namaBaru = scanner.nextLine();

                            System.out.print("Masukkan merk baru: ");
                            String merkBaru = scanner.nextLine();

                            System.out.print("Masukkan harga baru: ");
                            double hargaBaru = Double.parseDouble(scanner.nextLine());

                            Sepeda sepedaBaru = new Sepeda(namaBaru, merkBaru, hargaBaru);

                            daftarSepeda.set(i, sepedaBaru);

                            System.out.println("Sepeda telah berhasil diupdate");
                            ditemukanUpdate = true;
                            break;
                        }
                    }

                    if (!ditemukanUpdate) {
                        System.out.println("Sepeda tidak ditemukan");
                    }
                    break;

                case "4":
                    System.out.print("Masukan nama sepeda yang ingin dihapus:");
                    String namaHpHapus = scanner.nextLine();

                    Iterator<Sepeda> iterator = daftarSepeda.iterator();
                    while (iterator.hasNext()) {
                        Sepeda objekSepeda = iterator.next();
                        if (objekSepeda.getNama().equalsIgnoreCase(namaHpHapus)) {
                            iterator.remove();
                        }
                    }
                    break;

                case "5":
                    System.out.println("Terimakasih");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Pilihan tidak valid! Silakan masukkan pilihan dengan benar.");
            }
        }
    }
}
    

