package Pekan5_2511537001;

import java.util.Scanner;

public class RumahSakit_2511537001 {

    // head linked list
    private Pasien_2511537001 head_7001;

    // menyimpan nomor antrian terakhir
    private int nomorTerakhir_7001;

    // menghitung jumlah pasien
    private int jumlahPasien_7001;

    // konstruktor
    public RumahSakit_2511537001() {
        head_7001 = null;
        nomorTerakhir_7001 = 0;
        jumlahPasien_7001 = 0;
    }

    // insert di tail / tambah pasien di akhir linked list
    public void daftarkanPasien_7001(String namaPasien_7001, String keluhan_7001) {
        // nomor antrian bertambah otomatis
        nomorTerakhir_7001++;
        // membuat node pasien baru
        Pasien_2511537001 pasienBaru_7001 = new Pasien_2511537001(namaPasien_7001, keluhan_7001, nomorTerakhir_7001);
        // jika linked list kosong
        if (head_7001 == null) {
            // pasien baru jadi head
            head_7001 = pasienBaru_7001;
        } else {
            // traversal sampai node terakhir
            Pasien_2511537001 curr_7001 = head_7001;
            while (curr_7001.getNext_7001() != null) {
                curr_7001 = curr_7001.getNext_7001();
            }
            // sambungkan node terakhir ke node baru
            curr_7001.setNext_7001(pasienBaru_7001);
        }

        jumlahPasien_7001++;
        System.out.println("Pasien berhasil didaftarkan!");
        System.out.println("Nomor Antrian : " + nomorTerakhir_7001);
    }

    // delete head / panggil pasien terdepan
    public void panggilPasien_7001() {
        // cek apakah antrian kosong
        if (head_7001 == null) {
            System.out.println("Antrian kosong.");
            return;
        }

        // menyimpan pasien yang dipanggil
        Pasien_2511537001 pasienDipanggil_7001 = head_7001;
        // head digeser ke node berikutnya
        head_7001 = head_7001.getNext_7001();
        jumlahPasien_7001--;
        System.out.println("Pasien yang dipanggil:");
        System.out.println(pasienDipanggil_7001);
    }

    // menampilkan semua antrian pasien
    public void tampilkanAntrian_7001() {
        // cek apakah list kosong
        if (head_7001 == null) {
            System.out.println("Antrian masih kosong.");
            return;
        }

        Pasien_2511537001 curr_7001 = head_7001;

        int posisi_7001 = 1;

        System.out.println("Daftar Antrian Pasien:");

        // traversal linked list
        while (curr_7001 != null) {

            System.out.println("Posisi " + posisi_7001 + " -> " + curr_7001);
            curr_7001 = curr_7001.getNext_7001();
            posisi_7001++;
        }
    }
    // mencari pasien berdasarkan nama
    public void cariPasien_7001(String namaCari_7001) {

        // cek apakah list kosong
        if (head_7001 == null) {

            System.out.println("Antrian kosong.");
            return;
        }

        Pasien_2511537001 curr_7001 = head_7001;
        int posisi_7001 = 1;
        boolean ditemukan_7001 = false;
        // traversal untuk pencarian data
        while (curr_7001 != null) {

            // pencarian tanpa membedakan huruf besar kecil
            if (curr_7001.getNamaPasien_7001().equalsIgnoreCase(namaCari_7001)) {
                System.out.println("Pasien ditemukan pada posisi " + posisi_7001);
                System.out.println(curr_7001);
                ditemukan_7001 = true;
                break;
            }
            curr_7001 = curr_7001.getNext_7001();
            posisi_7001++;
        }
        // jika data tidak ditemukan
        if (!ditemukan_7001) {
            System.out.println("Pasien dengan nama " + namaCari_7001 + " tidak ditemukan.");
        }
    }

    // cek status antrian
    public void cekStatusAntrian_7001() {
        // jika antrian kosong
        if (head_7001 == null) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Jumlah pasien : " + jumlahPasien_7001);
            System.out.println("Pasien terdepan : " + head_7001);
        }
    }

    // method untuk menampilkan menu
    public static void tampilkanMenu_7001() {
        System.out.println("\n=== Antrian Rumah Sakit 2511537001 ===");
        System.out.println("1. Daftarkan Pasien");
        System.out.println("2. Panggil Pasien");
        System.out.println("3. Tampilkan Antrian");
        System.out.println("4. Cari Pasien");
        System.out.println("5. Cek Status Antrian");
        System.out.println("6. Keluar");
        System.out.print("Pilihan : ");
    }
    public static void main(String[] args) {
        Scanner input_7001 = new Scanner(System.in);
        RumahSakit_2511537001 rs_7001 = new RumahSakit_2511537001();
        int pilihan_7001;
        do {
            tampilkanMenu_7001();
            pilihan_7001 = input_7001.nextInt();
            input_7001.nextLine();
            switch (pilihan_7001) {
                case 1:
                    System.out.print("Masukkan Nama Pasien : ");
                    String namaPasien_7001 = input_7001.nextLine();
                    System.out.print("Masukkan Keluhan : ");
                    String keluhan_7001 = input_7001.nextLine();
                    rs_7001.daftarkanPasien_7001(namaPasien_7001, keluhan_7001);
                    break;
                case 2:
                    rs_7001.panggilPasien_7001();
                    break;
                case 3:
                    rs_7001.tampilkanAntrian_7001();
                    break;
                case 4:
                    System.out.print("Masukkan nama pasien yang dicari : ");
                    String namaCari_7001 = input_7001.nextLine();
                    rs_7001.cariPasien_7001(namaCari_7001);
                    break;
                case 5:
                    rs_7001.cekStatusAntrian_7001();
                    break;
                case 6:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan_7001 != 6);
        input_7001.close();
    }
}