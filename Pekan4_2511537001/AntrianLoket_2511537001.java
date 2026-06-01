package Pekan4_2511537001;
import java.util.*;

public class AntrianLoket_2511537001 {
    //Deklarasi Variabel
    String queue_7001[]; // array penyimpan data
    int front_7001;      // indeks depan
    int rear_7001;       // indeks belakang
    int max_7001;        // kapasitas maksimum

    // Constructor
    public AntrianLoket_2511537001(int max_7001) {
        this.max_7001 = max_7001;
        queue_7001 = new String[max_7001];
        front_7001 = -1;
        rear_7001 = -1;
    }

    // Cek kosong
    boolean isEmpty_7001() {
        return (front_7001 == -1);
    }

    // Cek penuh
    boolean isFull_7001() {
        return (rear_7001 == max_7001 - 1);
    }

    // Enqueue (menambah antrian)
    void enqueue_7001(String data_7001) {
        if (isFull_7001()) {
            System.out.println("Antrian penuh!");
        } else {
            if (isEmpty_7001()) {
                front_7001 = 0;
            }
            rear_7001++;
            queue_7001[rear_7001] = data_7001;
            System.out.println("Data berhasil ditambahkan ke antrian");
        }
    }

    // Dequeue_7001 (hapus data)
    void dequeue_7001() {
        if (isEmpty_7001()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println(queue_7001[front_7001] + " telah dilayani");
            front_7001++;

            // reset jika kosong lagi
            if (front_7001 > rear_7001) {
                front_7001 = rear_7001 = -1;
            }
        }
    }

    // Display (tampilkan antrian)
    void display_7001() {
        if (isEmpty_7001()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Isi antrian:");
            int no_7001 = 1;
            for (int i_7001 = front_7001; i_7001 <= rear_7001; i_7001++) {
                System.out.println(no_7001 + ". " + queue_7001[i_7001]);
                no_7001++;
            }
        }
    }

    // Reverse antrian
    void reverse_7001() {
        if (isEmpty_7001()) {
            System.out.println("Antrian kosong!");
        } else {
            int i_7001 = front_7001, j_7001 = rear_7001;
            while (i_7001 < j_7001) {
                String temp_7001 = queue_7001[i_7001];
                queue_7001[i_7001] = queue_7001[j_7001];
                queue_7001[j_7001] = temp_7001;
                i_7001++;
                j_7001--;
            }
            System.out.println("Antrian berhasil dibalik");
        }
    }

    // Main Program (Menu)
    public static void main(String[] args) {
        Scanner input_7001 = new Scanner(System.in);
        AntrianLoket_2511537001 q_7001 = new AntrianLoket_2511537001(10);

        int pilihan_7001;
        do {
            System.out.println("\n=== PROGRAM ANTRIAN LOKET ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Hapus Antrian");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Reverse");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan_7001 = input_7001.nextInt();
            input_7001.nextLine(); // buang enter

            switch (pilihan_7001) {
                case 1:
                    System.out.print("Masukkan nama pelanggan: ");
                    String nama_7001 = input_7001.nextLine();
                    q_7001.enqueue_7001(nama_7001);
                    break;
                case 2:
                    q_7001.dequeue_7001();
                    break;
                case 3:
                    q_7001.display_7001();
                    break;
                case 4:
                    q_7001.reverse_7001();
                    break;
                case 5:
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan_7001 != 5);
        input_7001.close();
    }
}