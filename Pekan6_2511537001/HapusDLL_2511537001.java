package Pekan6_2511537001;
public class HapusDLL_2511537001 {
    // fungsi menghapus node awal
    public static NodeDLL_2511537001 delHead(NodeDLL_2511537001 head_7001) {
        if (head_7001 == null) {
            return null;    }
        NodeDLL_2511537001 temp_7001 = head_7001;
        head_7001 = head_7001.next_7001;
        if (head_7001 != null) {
            head_7001.prev_7001 = null;    }
        return head_7001;
    }
    // fungsi menghapus di akhir
    public static NodeDLL_2511537001 delLast(NodeDLL_2511537001 head_7001) {
        if (head_7001 == null) {
            return null;    }
        if (head_7001.next_7001 == null) {
            return null;    }
        NodeDLL_2511537001 curr_7001 = head_7001;
        while (curr_7001.next_7001 != null) {
            curr_7001 = curr_7001.next_7001;
        }
        // update pointer previous node
        if (curr_7001.prev_7001 != null) {
            curr_7001.prev_7001.next_7001 = null;    }
        return head_7001;
    }
 // fungsi menghapus node posisi tertentu
    public static NodeDLL_2511537001 delPos(NodeDLL_2511537001 head_7001, int pos_7001) {
        // jika DLL kosong
        if (head_7001 == null) {
            return head_7001; }
        NodeDLL_2511537001 curr_7001 = head_7001;
        // telusuri sampai ke node yang akan dihapus
        for (int i = 1; curr_7001 != null && i < pos_7001; ++i) {
            curr_7001 = curr_7001.next_7001;
        }
        // jika posisi tidak ditemukan
        if (curr_7001 == null) {
            return head_7001; }
        // Update pointer
        if (curr_7001.prev_7001 != null) {
            curr_7001.prev_7001.next_7001= curr_7001.next_7001; }
        if (curr_7001.next_7001 != null) {
            curr_7001.next_7001.prev_7001 = curr_7001.prev_7001; }
        // jika yang dihapus head
        if (head_7001 == curr_7001) {
            head_7001 = curr_7001.next_7001; }
        return head_7001;
    }

    // fungsi mencetak DLL
    public static void printList(NodeDLL_2511537001 head_7001) {
        NodeDLL_2511537001 curr_7001 = head_7001;
        while (curr_7001 != null) {
            System.out.print(curr_7001.data_7001 + " <-> ");
            curr_7001 = curr_7001.next_7001;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // buat sebuah DLL
        NodeDLL_2511537001 head_7001 = new NodeDLL_2511537001(1);
        head_7001.next_7001 = new NodeDLL_2511537001(2);
        head_7001.next_7001.prev_7001 = head_7001;
        head_7001.next_7001.next_7001 = new NodeDLL_2511537001(3);
        head_7001.next_7001.next_7001.prev_7001 = head_7001.next_7001;
        head_7001.next_7001.next_7001.next_7001 = new NodeDLL_2511537001(4);
        head_7001.next_7001.next_7001.next_7001.prev_7001 = head_7001.next_7001.next_7001;
        head_7001.next_7001.next_7001.next_7001.next_7001 = new NodeDLL_2511537001(5);
        head_7001.next_7001.next_7001.next_7001.next_7001.prev_7001 = head_7001.next_7001.next_7001.next_7001;

        System.out.print("DLL Awal: ");
        printList(head_7001);

        System.out.print("Setelah head dihapus: ");
        head_7001 = delHead(head_7001);
        printList(head_7001);

        System.out.print("Setelah node terakhir dihapus: ");
        head_7001 = delLast(head_7001);
        printList(head_7001);

        System.out.print("menghapus node ke 2: ");
        head_7001 = delPos(head_7001, 2);

        printList(head_7001);
    }
}