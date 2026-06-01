package Pekan4_2511537001;
import java.util.*;
public class QueueLinkedList_2511537001 {

	public static void main(String[] args) {
		Queue<Integer>q_7001=new LinkedList<>();
		//tambah elemen {0,1,2,3,4,5} ke antian
		for (int i_7001=0;i_7001<6;i_7001++)
			q_7001.add(i_7001);
		//Menampilkan isi antrian
		System.out.println("Elemen Antrian"+q_7001);
		//Untuk menghapus kepala antrian.
		int hapus=q_7001.remove();
		System.out.println("Hapus  elemen=" + hapus);
		System.out.println(q_7001);
		//untuk melhat antrian terdepan
		int depan=q_7001.peek();
		System.out.println("Kepala Antrian= " + depan);
		int banyak=q_7001.size();
		System.out.println("Size Antrian = "+ banyak);
				
	}

}