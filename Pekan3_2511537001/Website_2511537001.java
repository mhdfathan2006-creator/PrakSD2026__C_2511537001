package Pekan3_2511537001;

public class Website_2511537001 {
    private String judul_7001;
    private String url_7001;

    // Konstructor
    Website_2511537001(String judul_7001, String url_7001) {
        this.judul_7001 = judul_7001;
        this.url_7001 = url_7001;
    }

    // Getter
    public String getJudul_7001() {
        return judul_7001;
    }

    public String getUrl_7001() {
        return url_7001;
    }

    // Setter
    public void setJudul_7001(String judul_7001) {
        this.judul_7001 = judul_7001;
    }

    public void setUrl_7001(String url_7001) {
        this.url_7001 = url_7001;
    }

    // Override
    @Override
    public String toString() {
        return "Judul : " + judul_7001 + "\nURL   : " + url_7001;
    }
}