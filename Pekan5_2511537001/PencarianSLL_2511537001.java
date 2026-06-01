package Pekan5_2511537001;

public class PencarianSLL_2511537001 {
	static boolean searchKey (NodeSLL_2511537001 head, int Key) {
		NodeSLL_2511537001 curr_7001= head;
		while (curr_7001 != null) {
			if(curr_7001.data_7001==Key)
				return true;
			curr_7001=curr_7001.next_7001; }
		return false; }
	public static void traversal (NodeSLL_2511537001 head) {
		//mulai dari head
		NodeSLL_2511537001 curr_7001=head;
		//telusuri sampai pointer null
		while (curr_7001 != null) {
			System.out.print(" " + curr_7001.data_7001);
			curr_7001 = curr_7001.next_7001;}
		System.out.println(); }
		
		public static void main (String[] args) {
			NodeSLL_2511537001 head_7001 = new NodeSLL_2511537001(14);
			head_7001.next_7001 = new NodeSLL_2511537001(21);
			head_7001.next_7001.next_7001 = new NodeSLL_2511537001(13);
			head_7001.next_7001.next_7001.next_7001 = new NodeSLL_2511537001(30);
			head_7001.next_7001.next_7001.next_7001.next_7001= new NodeSLL_2511537001(10);
			System.out.print("Penelesuran SLL : ");
			traversal (head_7001);
			//data yang akan dicari
			int Key=30;
			System.out.print("cari data " +Key+ " = ");
			if (searchKey(head_7001, Key))
				System.out.println("Ketemu");
			else 
				System.out.println("Tidak ada");
		}
		
		}