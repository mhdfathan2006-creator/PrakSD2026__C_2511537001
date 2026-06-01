package pekan7_2511537001;

public class Mahasiswa_2511537001 {

    private String nama_7001;
    private String nim_7001;
    private String prodi_7001;

    // Constructor
    public Mahasiswa_2511537001(String nama_7001, String nim_7001, String prodi_7001) {
        this.nama_7001 = nama_7001;
        this.nim_7001 = nim_7001;
        this.prodi_7001 = prodi_7001;
    }

    // Getter dan Setter
    public String getNama_7001() {
        return nama_7001;
    }

    public void setNama_7001(String nama_7001) {
        this.nama_7001 = nama_7001;
    }

    public String getNim_7001() {
        return nim_7001;
    }

    public void setNim_7001(String nim_7001) {
        this.nim_7001 = nim_7001;
    }

    public String getProdi_7001() {
        return prodi_7001;
    }

    public void setProdi_7001(String prodi_7001) {
        this.prodi_7001 = prodi_7001;
    }

    @Override
    public String toString() {
        return nama_7001;
    }
}