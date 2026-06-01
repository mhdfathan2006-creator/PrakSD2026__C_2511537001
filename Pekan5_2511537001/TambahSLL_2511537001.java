package Pekan5_2511537001;

public class TambahSLL_2511537001 {

    // tambah di depan
    public static NodeSLL_2511537001 insertAtFront(NodeSLL_2511537001 head_7001, int value_7001) {
        NodeSLL_2511537001 new_node_7001 = new NodeSLL_2511537001(value_7001);
        new_node_7001.next_7001 = head_7001;
        return new_node_7001;
    }

    // tambah di akhir
    public static NodeSLL_2511537001 insertAtEnd(NodeSLL_2511537001 head_7001, int value_7001) {
        NodeSLL_2511537001 newNode_7001 = new NodeSLL_2511537001(value_7001);

        if (head_7001 == null) {
            return newNode_7001;
        }

        NodeSLL_2511537001 last_7001 = head_7001;

        while (last_7001.next_7001 != null) {
            last_7001 = last_7001.next_7001;
        }

        last_7001.next_7001 = newNode_7001;
        return head_7001;
    }

    static NodeSLL_2511537001 getNode(int data_7001) {
        return new NodeSLL_2511537001(data_7001);
    }

    static NodeSLL_2511537001 insertPos(NodeSLL_2511537001 headNode_7001, int position_7001, int value_7001) {

        NodeSLL_2511537001 head_7001 = headNode_7001;

        if (position_7001 < 1) {
            System.out.println("Invalid position");
            return head_7001;
        }

        if (position_7001 == 1) {
            NodeSLL_2511537001 new_node_7001 = new NodeSLL_2511537001(value_7001);
            new_node_7001.next_7001 = head_7001;
            return new_node_7001;
        } else {
            while (position_7001-- != 0) {

                if (position_7001 == 1) {
                    NodeSLL_2511537001 newNode_7001 = getNode(value_7001);
                    newNode_7001.next_7001 = headNode_7001.next_7001;
                    headNode_7001.next_7001 = newNode_7001;
                    break;
                }

                headNode_7001 = headNode_7001.next_7001;

                if (headNode_7001 == null) {
                    System.out.println("Posisi di luar jangkauan");
                    break;
                }
            }
        }
        return head_7001;
    }

    public static void printList_7001(NodeSLL_2511537001 head_7001) {
        NodeSLL_2511537001 curr_7001 = head_7001;

        while (curr_7001 != null) {
            if (curr_7001.next_7001 != null) {
                System.out.print(curr_7001.data_7001 + " --> ");
            } else {
                System.out.print(curr_7001.data_7001);
            }
            curr_7001 = curr_7001.next_7001;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // buat linked list 2->3->5->6
        NodeSLL_2511537001 head_7001 = new NodeSLL_2511537001(2);

        head_7001.next_7001 = new NodeSLL_2511537001(3);
        head_7001.next_7001.next_7001 = new NodeSLL_2511537001(5);
        head_7001.next_7001.next_7001.next_7001 = new NodeSLL_2511537001(6);

        // cetak list awal
        System.out.print("Senarai berantai awal: ");
        printList_7001(head_7001);

        // tambah di depan
        System.out.print("Tambah 1 simpul di depan: ");
        int data_7001 = 1;
        head_7001 = insertAtFront(head_7001, data_7001);
        printList_7001(head_7001);

        // tambah di belakang
        System.out.print("Tambah 1 simpul di belakang: ");
        int data2_7001 = 7;
        head_7001 = insertAtEnd(head_7001, data2_7001);
        printList_7001(head_7001);

        // tambah di posisi tertentu
        System.out.print("Tambah 1 simpul ke data 4: ");
        int data3_7001 = 4;
        int pos_7001 = 4;
        head_7001 = insertPos(head_7001, pos_7001, data3_7001);
        printList_7001(head_7001);
    }
}