package Pekan5_2511537001;

public class Pasien_2511537001 {

    // atribut data pasien
    private String namaPasien_7001;
    private String keluhan_7001;
    private int nomorAntrian_7001;

    // pointer ke pasien berikutnya
    private Pasien_2511537001 next_7001;

    // konstruktor untuk isi data pasien
    public Pasien_2511537001(String namaPasien_7001,String keluhan_7001,int nomorAntrian_7001) {
        this.namaPasien_7001 = namaPasien_7001;
        this.keluhan_7001 = keluhan_7001;
        this.nomorAntrian_7001 = nomorAntrian_7001;
        // node awal belum terhubung ke node lain
        this.next_7001 = null;
    }

    // getter nama pasien
    public String getNamaPasien_7001() {
        return namaPasien_7001;
    }

    // getter keluhan pasien
    public String getKeluhan_7001() {
        return keluhan_7001;
    }

    // getter nomor antrian
    public int getNomorAntrian_7001() {
        return nomorAntrian_7001;
    }

    // getter pointer next
    public Pasien_2511537001 getNext_7001() {
        return next_7001;
    }

    // setter nama pasien
    public void setNamaPasien_7001(String namaPasien_7001) {
        this.namaPasien_7001 = namaPasien_7001;
    }

    // setter keluhan pasien
    public void setKeluhan_7001(String keluhan_7001) {
        this.keluhan_7001 = keluhan_7001;
    }

    // setter nomor antrian
    public void setNomorAntrian_7001(int nomorAntrian_7001) {
        this.nomorAntrian_7001 = nomorAntrian_7001;
    }

    // setter pointer next
    public void setNext_7001(Pasien_2511537001 next_7001) {
        this.next_7001 = next_7001;
    }

    // supaya data pasien bisa langsung dicetak
    @Override
    public String toString() {
        return "No Antrian : " + nomorAntrian_7001 + ", Nama : " + namaPasien_7001 + ", Keluhan : " + keluhan_7001;
    }
}