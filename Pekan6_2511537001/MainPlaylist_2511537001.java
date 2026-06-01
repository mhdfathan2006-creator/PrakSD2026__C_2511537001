package Pekan6_2511537001;

import java.util.Scanner;

public class MainPlaylist_2511537001 {
    public static void main(String[] args) {
        Scanner input_7001 = new Scanner(System.in);
        Musik_2511537001 playlist_7001 = new Musik_2511537001();

        int pilihan_7001;

        do {
            System.out.println("=== Playlist Musik NIM: 2511537001 ===");
            System.out.println("1. Tambah Lagu");
            System.out.println("2. Hapus Lagu Pertama");
            System.out.println("3. Lihat Playlist (Maju)");
            System.out.println("4. Lihat Playlist (Mundur)");
            System.out.println("5. Cari Lagu");
            System.out.println("6. Keluar");
            System.out.print("Pilihan : ");
            pilihan_7001 = input_7001.nextInt();
            input_7001.nextLine();

            switch (pilihan_7001) {
                case 1:
                    System.out.print("Judul Lagu : ");
                    String judul_7001 = input_7001.nextLine();

                    System.out.print("Penyanyi   : ");
                    String penyanyi_7001 = input_7001.nextLine();

                    playlist_7001.tambahLagu_7001(judul_7001, penyanyi_7001);
                    break;

                case 2:
                    playlist_7001.hapusLaguAwal_7001();
                    break;

                case 3:
                    playlist_7001.tampilMaju_7001();
                    break;

                case 4:
                    playlist_7001.tampilMundur_7001();
                    break;

                case 5:
                    System.out.print("Masukkan judul lagu yang dicari : ");
                    String cari_7001 = input_7001.nextLine();

                    playlist_7001.cariLagu_7001(cari_7001);
                    break;

                case 6:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!\n");
            }

        } while (pilihan_7001 != 6);

        input_7001.close();
    }
}