package Pekan9_2511537001;

public class BtreeeDriver_2511537001 {

    public static void main(String[] args) {

        // Membuat Pohon
        BTree_2511537001 tree_7001 = new BTree_2511537001();

        System.out.print("Jumlah Simpul awal pohon: ");
        System.out.println(tree_7001.countNodes_7001());

        // menambahkan simpul data 1
        Node_2511537001 root_7001 = new Node_2511537001(1);

        // menjadikan simpul 1 sebagai root
        tree_7001.setRoot_7001(root_7001);

        System.out.println("Jumlah simpul jika hanya ada root");
        System.out.println(tree_7001.countNodes_7001());

        Node_2511537001 node2_7001 = new Node_2511537001(2);
        Node_2511537001 node3_7001 = new Node_2511537001(3);
        Node_2511537001 node4_7001 = new Node_2511537001(4);
        Node_2511537001 node5_7001 = new Node_2511537001(5);
        Node_2511537001 node6_7001 = new Node_2511537001(6);
        Node_2511537001 node7_7001 = new Node_2511537001(7);
        Node_2511537001 node8_7001 = new Node_2511537001(8);
        Node_2511537001 node9_7001 = new Node_2511537001(9);

        root_7001.setLeft_7001(node2_7001);

        node2_7001.setLeft_7001(node4_7001);
        node2_7001.setRight_7001(node5_7001);

        node4_7001.setRight_7001(node8_7001);

        root_7001.setRight_7001(node3_7001);

        node3_7001.setLeft_7001(node6_7001);
        node3_7001.setRight_7001(node7_7001);

        node6_7001.setLeft_7001(node9_7001);
        
     // Set root
        tree_7001.setCurrent_7001(tree_7001.getRoot_7001());

        System.out.println("menampilkan simpul terakhir: ");
        System.out.println(tree_7001.getCurrent_7001().getData_7001());

        System.out.println("Jumlah simpul; setelah simpul 7 ditambahkan");
        System.out.println(tree_7001.countNodes_7001());

        System.out.println("InOrder: ");
        tree_7001.printInorder_7001();

        System.out.println("\nPreorder: ");
        tree_7001.printPreOrder_7001();

        System.out.println("\nPostorder : ");
        tree_7001.printPostOrder_7001();

        System.out.println("\nDmenampilkan simpul dalam bentuk pohon");
        tree_7001.print_7001();
    }
}