package Pekan5_2511537001;
public class HapusSLL_2511537001 {
    // fungsi untuk menghapus head
    public static NodeSLL_2511537001 deleteHead(NodeSLL_2511537001 head) {
        // jika SLL kosong
        if (head == null)
            return null;
        // pindahkan head ke node berikutnya
        head = head.next_7001;
        // Return head baru
        return head;
    }
    // fungsi menghapus node terakhir SLL
    public static NodeSLL_2511537001 removeLastNode(NodeSLL_2511537001 head) {
        // jika list kosong, return null
        if (head == null) {
            return null;
        }
        //jika list satu node, hapus node dan return null
        if (head.next_7001 == null) {
            return null;
        }
        //temukan node terakhir ke dua
        NodeSLL_2511537001 secondLast = head;
        while (secondLast.next_7001.next_7001 != null) {
            secondLast = secondLast.next_7001;
        }
        // hapus node terakhir
        secondLast.next_7001 = null;
        return head;
    }
    // fungsi menghapus node di posisi tertentu
    public static NodeSLL_2511537001 deleteNode(NodeSLL_2511537001 head, int position) {
        NodeSLL_2511537001 temp_7001 = head;
        NodeSLL_2511537001 prev_7001 = null;
        // jika linked list null
        if (temp_7001 == null)
            return head;
        // kasus 1: head dihapus
        if (position == 1) {
            head = temp_7001.next_7001;
            return head;    }
        // kasus 2: menghapus node di tengah
        // telusuri ke node yang dihapus
        for (int i_7001 = 1; temp_7001 != null && i_7001 < position; i_7001++) {
            prev_7001 = temp_7001;
            temp_7001 = temp_7001.next_7001;   }
        // jika ditemukan, hapus node
        if (temp_7001 != null) {
            prev_7001.next_7001 = temp_7001.next_7001;
        } else {
            System.out.println("Data tidak ada");        }
        return head;    }
    // fungsi mencetak SLL
    public static void printList(NodeSLL_2511537001 head) {
        NodeSLL_2511537001 curr_7001 = head;
        while (curr_7001.next_7001 != null) {
            System.out.print(curr_7001.data_7001+"-->");
            curr_7001 = curr_7001.next_7001;       }
        if (curr_7001.next_7001==null) {
            System.out.print(curr_7001.data_7001);    }
        System.out.println(); }
    //kelas main
    public static void main(String[] args) {
        // buat SLL 1 -> 2 -> 3 -> 4 -> 5-> 6 -> null
        NodeSLL_2511537001 head_7001 = new NodeSLL_2511537001(1);
        head_7001.next_7001 = new NodeSLL_2511537001(2);
        head_7001.next_7001.next_7001 = new NodeSLL_2511537001(3);
        head_7001.next_7001.next_7001.next_7001 = new NodeSLL_2511537001(4);
        head_7001.next_7001.next_7001.next_7001.next_7001 = new NodeSLL_2511537001(5);
        head_7001.next_7001.next_7001.next_7001.next_7001.next_7001 = new NodeSLL_2511537001(6);
        // cetak list awal
        System.out.println("list awal: ");
        printList(head_7001);
        // hapus head
        head_7001 = deleteHead(head_7001);
        System.out.println("List setelah head dihapus: ");
        printList(head_7001);
        //hapus node terakhir
        head_7001 = removeLastNode(head_7001);
        System.out.println("List setelah simpul terakhir di hapus: ");
        printList(head_7001);
        // Deleting node at position 2
        int position = 2;
        head_7001 = deleteNode(head_7001, position);
        // Print list after deletion
        System.out.println("List setelah posisi 2 dihapus: ");
        printList(head_7001);
    }
    
}