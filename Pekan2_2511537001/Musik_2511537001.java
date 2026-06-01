package Pekan2_2511537001;

public class Musik_2511537001 {
    String Judul_7001;
    String Penyanyi_7001;
    int Durasi_7001;

    // Constructor
    Musik_2511537001(String Judul_7001, String Penyanyi_7001, int Durasi_7001) {
        this.Judul_7001 = Judul_7001;
        this.Penyanyi_7001 = Penyanyi_7001;
        this.Durasi_7001 = Durasi_7001;
    }
    //Getter
    public String getJudul () {return Judul_7001;}
    public String getPenyanyi () {return Penyanyi_7001;}
    public int getDurasi () {return Durasi_7001;}

    //Setter
    public void setJudul (String judul_7001) {
    this.Judul_7001 = judul_7001;
    } 
    
    public void setPenyanyi (String penyanyi_7001) {
    	this.Penyanyi_7001 = penyanyi_7001;
    }
    
    public void setDurasi (int durasi_7001) {
    	this.Durasi_7001 = durasi_7001;
    }

    
    @Override
    public String toString() {
        return "Judul: " + Judul_7001 + 
               ", Penyanyi: " + Penyanyi_7001 + 
               ", Durasi: " + Durasi_7001;
    }
}