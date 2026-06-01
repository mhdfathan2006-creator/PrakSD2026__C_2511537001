package Pekan6_2511537001;
public class PenelusuranDLL_2511537001 {
    //fungsi penelusuran maju
    static void forwardTraversal(NodeDLL_2511537001 head_7001) {
        // memulai penelusuran dari head
        NodeDLL_2511537001 curr_7001 = head_7001;
        //lanjutkan sampai akhir
        while (curr_7001 != null) {
            //print data
            System.out.print(curr_7001.data_7001 + " <-> ");
            //pindah ke node berikutnya
            curr_7001 = curr_7001.next_7001;
        }
        //print spasi
        System.out.println();
    }
    // fungsi penelusuran mundur
    static void backwardTraversal(NodeDLL_2511537001 tail_7001) {
        // mulai dari akhir
        NodeDLL_2511537001 curr_7001 = tail_7001;
        //lanjut sampai head
        while (curr_7001 != null) {
            //cetak data
            System.out.print(curr_7001.data_7001 + " <-> ");
            // pindah ke node sebelumnya
            curr_7001 = curr_7001.prev_7001;
        }
        // cetak spasi
        System.out.println();
    }
    public static void main(String[] args) {
        // cetak DLL
        NodeDLL_2511537001 head_7001 = new NodeDLL_2511537001(1);
        NodeDLL_2511537001 second_7001 = new NodeDLL_2511537001(2);
        NodeDLL_2511537001 third_7001 = new NodeDLL_2511537001(3);

        head_7001.next_7001 = second_7001;
        second_7001.prev_7001 = head_7001;
        second_7001.next_7001 = third_7001;
        third_7001.prev_7001 = second_7001;

        System.out.println("Penelusuran maju:");
        forwardTraversal(head_7001);

        System.out.println("Penelusuran mundur:");
        backwardTraversal(third_7001);
    }
}