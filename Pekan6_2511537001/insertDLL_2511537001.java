package Pekan6_2511537001;

public class insertDLL_2511537001 {
	// menambah node di awal DLL
	static NodeDLL_2511537001 insertBegin(NodeDLL_2511537001 head_7001, int data_7001) {
		// buat node baru
		NodeDLL_2511537001 new_node_7001 = new NodeDLL_2511537001(data_7001);
		// jadikan pointer nextnya head
		new_node_7001.next_7001 = head_7001;
		// jadikan pointer prev head ke new_node
		if (head_7001 != null) {
			head_7001.prev_7001 = new_node_7001;
		}
		return new_node_7001;
	}
	// fungsi menambahkan node di akhir
	public static NodeDLL_2511537001 insertEnd(NodeDLL_2511537001 head_7001, int newData_7001) {
		// buat node baru
		NodeDLL_2511537001 newNode_7001 = new NodeDLL_2511537001(newData_7001);
		// jika dll null jadikan head
		if (head_7001 == null) {
			head_7001 = newNode_7001;
		}
		else {
			NodeDLL_2511537001 curr_7001 = head_7001;
			while (curr_7001.next_7001 != null) {
				curr_7001 = curr_7001.next_7001;
			}
			curr_7001.next_7001 = newNode_7001;
			newNode_7001.prev_7001 = curr_7001;
		}
		return head_7001;
	}
	//fungsi menambahkan node di posisi tertentu
	public static NodeDLL_2511537001 insertAtPosition(NodeDLL_2511537001 head_7001, int pos_7001, int new_data_7001) {
	    // buat node baru
	    NodeDLL_2511537001 new_node_7001 = new NodeDLL_2511537001(new_data_7001);
	    if (pos_7001 == 1) {
	        new_node_7001.next_7001 = head_7001;
	        if (head_7001 != null) {
	            head_7001.prev_7001 = new_node_7001;
	        }
	        head_7001 = new_node_7001;
	        return head_7001;
	    }
	    NodeDLL_2511537001 curr_7001 = head_7001;
	    for (int i = 1; i < pos_7001 - 1 && curr_7001 != null; ++i) {
	        curr_7001 = curr_7001.next_7001;
	    }
	    if (curr_7001 == null) {
	        System.out.println("Posisi tidak ada");
	        return head_7001;
	    }
	    new_node_7001.prev_7001 = curr_7001;
	    new_node_7001.next_7001 = curr_7001.next_7001;
	    curr_7001.next_7001 = new_node_7001;
	    if (new_node_7001.next_7001 != null) {
	        new_node_7001.next_7001.prev_7001 = new_node_7001;
	    }
	    return head_7001;
	}

	public static void printList(NodeDLL_2511537001 head_7001) {
	    NodeDLL_2511537001 curr_7001 = head_7001;
	    while (curr_7001 != null) {
	        System.out.print(curr_7001.data_7001 + " <-> ");
	        curr_7001 = curr_7001.next_7001;
	    }
	    System.out.println();
	}
	public static void main(String[] args) {
	    // membuat dll 2 <-> 3 <-> 5
	    NodeDLL_2511537001 head_7001 = new NodeDLL_2511537001(2);
	    head_7001.next_7001 = new NodeDLL_2511537001(3);
	    head_7001.next_7001.prev_7001 = head_7001;
	    head_7001.next_7001.next_7001 = new NodeDLL_2511537001(5);
	    head_7001.next_7001.next_7001.prev_7001 = head_7001.next_7001;
	    // cetak DLL awal
	    System.out.print("DLL Awal: ");
	    printList(head_7001);
	    // tambah 1 di awal
	    head_7001 = insertBegin(head_7001, 1);
	    System.out.print(
	            "simpul 1 ditambah di awal: ");
	    printList(head_7001);
	    // tambah 6 di akhir
	    System.out.print(
	            "simpul 6 ditambah di akhir: ");
	    int data_7001 = 6;
	    head_7001 = insertEnd(head_7001, data_7001);
	    printList(head_7001);
	    // menambah node 4 di posisi 4
	    System.out.print("tambah node 4 di posisi 4: ");
	    int data2_7001 = 4;
	    int pos_7001 = 4;
	    head_7001 = insertAtPosition(head_7001, pos_7001, data2_7001);
	    printList(head_7001);
	}
}