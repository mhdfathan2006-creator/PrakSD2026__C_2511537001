package Pekan6_2511537001;

public class Lagu_2511537001 {
    private String judul_7001;
    private String penyanyi_7001;
    Lagu_2511537001 next_7001;
    Lagu_2511537001 prev_7001;

    // constructor
    public Lagu_2511537001(String judul_7001, String penyanyi_7001) {
        this.judul_7001 = judul_7001;
        this.penyanyi_7001 = penyanyi_7001;
        this.next_7001 = null;
        this.prev_7001 = null;
    }

    // getter judul
    public String getJudul_7001() {
        return judul_7001;
    }

    // setter judul
    public void setJudul_7001(String judul_7001) {
        this.judul_7001 = judul_7001;
    }

    // getter penyanyi
    public String getPenyanyi_7001() {
        return penyanyi_7001;
    }

    // setter penyanyi
    public void setPenyanyi_7001(String penyanyi_7001) {
        this.penyanyi_7001 = penyanyi_7001;
    }
}