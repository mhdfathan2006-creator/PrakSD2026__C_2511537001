package Pekan2_2511537001;

import java.util.ArrayList;
import java.util.Scanner;

public class Playlist_2511537001 {

    // 1. Method untuk menampilkan Menu
    public static void tampilkanMenu_2511537001() {
        System.out.println("\n=== Playlist Musik NIM: 2511537001 ===");
        System.out.println("1. Tambah Lagu");
        System.out.println("2. Lihat Playlist");
        System.out.println("3. Hapus Lagu");
        System.out.println("4. Cek Kapasitas");
        System.out.println("5. Keluar");
    }

    // 2. Method untuk menambah Lagu
    public static void tambahLagu_2511537001(ArrayList<Musik_2511537001> list, Scanner sc) {
        System.out.print("Masukkan Judul: ");
        String Judul_7001 = sc.nextLine();

        System.out.print("Masukkan Penyanyi: ");
        String Penyanyi_7001 = sc.nextLine();

        System.out.print("Masukkan Durasi (detik): ");
        int Durasi_7001 = sc.nextInt();
        sc.nextLine();

        list.add(new Musik_2511537001(Judul_7001, Penyanyi_7001, Durasi_7001));
        System.out.println("Lagu berhasil ditambahkan!");
    }
    // 3. Method untuk melihat Playlist
    public static void lihatPlaylist_2511537001(ArrayList<Musik_2511537001> list) {
        if (list.isEmpty()) {
            System.out.println("Playlist kamu masih kosong.");
        } else {
            System.out.println("Daftar Lagu:");
            int i = 1;
            for (Musik_2511537001 lagu : list) {
                System.out.println(i + ". " + lagu);
                i++;
            }
        }
    }
    // 4. Method untuk menghapus Lagu (berdasarkan index lagu)
    public static void hapusLagu_2511537001(ArrayList<Musik_2511537001> list, Scanner sc) {
        System.out.print("Masukkan nomor lagu yang akan dihapus: ");
        int index_7001 = sc.nextInt();
        sc.nextLine();

        if (index_7001 > 0 && index_7001 <= list.size()) {
            list.remove(index_7001 - 1);
            System.out.println("Lagu berhasil dihapus.");
        } else {
            System.out.println("Nomor tidak valid.");
        }
    }

    // 5. Method untuk mengetes pilihan
    public static void cekPilihan_2511537001(ArrayList<Musik_2511537001> list) {
        System.out.println("Jumlah lagu dalam playlist: " + list.size());
    }

    public static void main(String[] args) {
        ArrayList<Musik_2511537001> playlist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            tampilkanMenu_2511537001();
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    tambahLagu_2511537001(playlist, sc);
                    break;
                case 2:
                    lihatPlaylist_2511537001(playlist);
                    break;
                case 3:
                    hapusLagu_2511537001(playlist, sc);
                    break;
                case 4:
                	cekPilihan_2511537001(playlist);
                    break;
                case 5: 
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia.");
            }
        } while (pilihan != 5);

        sc.close();
    }
}