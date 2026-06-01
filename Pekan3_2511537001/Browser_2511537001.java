package Pekan3_2511537001;

import java.util.Scanner;
import java.util.Stack;

public class Browser_2511537001 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Website_2511537001> history_7001 = new Stack<>();

        int pilihan_7001;

        do {
            System.out.println("\n=== Browser History NIM: 2511537001 ===");
            System.out.println("1. Kunjungi Website (Push)");
            System.out.println("2. Tombol Back (Pop)");
            System.out.println("3. Lihat Halaman Aktif (Peek)");
            System.out.println("4. Keluar");
            System.out.print("Pilihan: ");
            pilihan_7001 = input.nextInt();
            input.nextLine();

            switch (pilihan_7001) {
                case 1:
                    System.out.print("Masukkan Judul: ");
                    String judul_7001 = input.nextLine();

                    System.out.print("Masukkan URL: ");
                    String url_7001 = input.nextLine();

                    Website_2511537001 web = new Website_2511537001(judul_7001, url_7001);
                    history_7001.push(web);

                    System.out.println("Berhasil mengunjungi halaman!");
                    break;

                case 2:
                    if (!history_7001.isEmpty()) {
                        Website_2511537001 hapus = history_7001.pop();
                        System.out.println("Kembali dari: " + hapus.getJudul_7001());
                    } else {
                        System.out.println("History kosong!");
                    }
                    break;

                case 3:
                    if (!history_7001.isEmpty()) {
                        Website_2511537001 atas = history_7001.peek();
                        System.out.println("Halaman Aktif:");
                        System.out.println("Judul: " + atas.getJudul_7001());
                        System.out.println("URL: " + atas.getUrl_7001());
                    } else {
                        System.out.println("Tidak ada halaman aktif!");
                    }
                    break;

                case 4:
                    System.out.println("Keluar dari website");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan_7001 != 4);

        input.close();
    }
}