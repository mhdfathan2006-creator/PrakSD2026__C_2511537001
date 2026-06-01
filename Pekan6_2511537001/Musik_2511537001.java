package Pekan6_2511537001;

public class Musik_2511537001 {

    Lagu_2511537001 head_7001;
    Lagu_2511537001 tail_7001;

    // Konstruktor
    public Musik_2511537001() {
        head_7001 = null;
        tail_7001 = null;
    }

    // Menambah lagu ke akhir playlist
    public void tambahLagu_7001(String judul_7001, String penyanyi_7001) {

        Lagu_2511537001 laguBaru_7001 =
                new Lagu_2511537001(judul_7001, penyanyi_7001);

        if (head_7001 == null) {
            head_7001 = laguBaru_7001;
            tail_7001 = laguBaru_7001;
        } else {
            tail_7001.next_7001 = laguBaru_7001;
            laguBaru_7001.prev_7001 = tail_7001;
            tail_7001 = laguBaru_7001;
        }

        System.out.println("Lagu berhasil ditambahkan!\n");
    }

    // Menghapus lagu pertama
    public void hapusLaguAwal_7001() {

        if (head_7001 == null) {
            System.out.println("Playlist kosong!\n");
            return;
        }

        System.out.println("Lagu " + head_7001.getJudul_7001()
                + " berhasil dihapus!\n");

        if (head_7001 == tail_7001) {
            head_7001 = null;
            tail_7001 = null;
        } else {
            head_7001 = head_7001.next_7001;

            if (head_7001 != null) {
                head_7001.prev_7001 = null;
            }
        }
    }

    // Menghapus lagu terakhir
    public void hapusLaguAkhir_7001() {

        if (tail_7001 == null) {
            System.out.println("Playlist kosong!\n");
            return;
        }

        System.out.println("Lagu " + tail_7001.getJudul_7001()
                + " berhasil dihapus!\n");

        if (head_7001 == tail_7001) {
            head_7001 = null;
            tail_7001 = null;
        } else {
            tail_7001 = tail_7001.prev_7001;
            tail_7001.next_7001 = null;
        }
    }

    // Menampilkan playlist dari awal ke akhir
    public void tampilMaju_7001() {

        if (head_7001 == null) {
            System.out.println("Playlist kosong!\n");
            return;
        }

        Lagu_2511537001 bantu_7001 = head_7001;

        System.out.println("=== Playlist Maju ===");

        while (bantu_7001 != null) {

            System.out.println("Judul    : "
                    + bantu_7001.getJudul_7001());

            System.out.println("Penyanyi : "
                    + bantu_7001.getPenyanyi_7001());

            System.out.println();

            bantu_7001 = bantu_7001.next_7001;
        }
    }

    // Menampilkan playlist dari akhir ke awal
    public void tampilMundur_7001() {

        if (tail_7001 == null) {
            System.out.println("Playlist kosong!\n");
            return;
        }

        Lagu_2511537001 bantu_7001 = tail_7001;

        System.out.println("=== Playlist Mundur ===");

        while (bantu_7001 != null) {

            System.out.println("Judul    : "
                    + bantu_7001.getJudul_7001());

            System.out.println("Penyanyi : "
                    + bantu_7001.getPenyanyi_7001());

            System.out.println();

            bantu_7001 = bantu_7001.prev_7001;
        }
    }

    // Mencari lagu berdasarkan judul
    public void cariLagu_7001(String judulCari_7001) {

        if (head_7001 == null) {
            System.out.println("Playlist kosong!\n");
            return;
        }

        Lagu_2511537001 bantu_7001 = head_7001;

        while (bantu_7001 != null) {

            if (bantu_7001.getJudul_7001()
                    .equalsIgnoreCase(judulCari_7001)) {

                System.out.println("Lagu ditemukan!");
                System.out.println("Judul    : "
                        + bantu_7001.getJudul_7001());

                System.out.println("Penyanyi : "
                        + bantu_7001.getPenyanyi_7001());

                System.out.println();
                return;
            }

            bantu_7001 = bantu_7001.next_7001;
        }

        System.out.println("Lagu tidak ditemukan!\n");
    }
}