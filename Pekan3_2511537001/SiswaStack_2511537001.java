package Pekan3_2511537001;
import java.util.ArrayList;
class Siswa_2511537001 {
	String nama_7001;
	int nim_7001;
	
	public Siswa_2511537001 (String nama_7001, int nim_7001) {
		this.nama_7001= nama_7001;
		this.nim_7001= nim_7001;
		
	}
	
	@Override
	public String toString () {
		return "NIM: " + nim_7001 + ", Nama : " +nama_7001;
	}
}
public class SiswaStack_2511537001 {
	private ArrayList<Siswa_2511537001> stack_7001;
	
	public SiswaStack_2511537001() {
		stack_7001 = new ArrayList<>();
	}
	public void push (Siswa_2511537001 mhs) {
		stack_7001.add(mhs);
	}

public Siswa_2511537001 pop() {
	if (!isEmpty()) {
		return stack_7001.remove(stack_7001.size() -1);
	 }
	 return null;
    }
 public Siswa_2511537001 peek() {
	 if (!isEmpty()) {
		 return stack_7001.get(stack_7001.size() -1 );
	 }
	 return null;
 }
 
 public boolean isEmpty () {
	 return stack_7001.isEmpty();
	 }
  public void tampilkanSiswa_7001() {
	  for (int i= stack_7001.size() -1; i>=0; i--) {
		  System.out.println(stack_7001.get(i));
	  }
  }
  public static void main (String [] args) {
	  SiswaStack_2511537001 studentstack = new SiswaStack_2511537001();
	  
	  Siswa_2511537001 mhs1 = new Siswa_2511537001 ("Ali ", 1);
	  Siswa_2511537001 mhs2 = new Siswa_2511537001 ("Boby ", 2);
	  Siswa_2511537001 mhs3 = new Siswa_2511537001 ("Charles ", 3);
	  
	  studentstack.push(mhs1);
	  studentstack.push(mhs2);
	  studentstack.push(mhs3);
	  
	  System.out.println("siswa di dalam stack : ");
	  studentstack.tampilkanSiswa_7001();
	  
	  System.out.println("siswa teratas " + studentstack.peek());
	  System.out.println("mengeluarkan siswa teratas dari stack " + studentstack.pop());
	  System.out.println("daftar siswa setelah di pop : ");
	  studentstack.tampilkanSiswa_7001();
  }
 
}