package Pekan9_2511537001;

public class Node_2511537001 {

	    int data_7001;
	    Node_2511537001 right_7001;
	    Node_2511537001 left_7001;

	    public Node_2511537001(int data_7001) {
	        this.data_7001 = data_7001;
	        left_7001 = null;
	        right_7001 = null;
	    }

	    public void setLeft_7001(Node_2511537001 Node_2511537001) {
	        if (left_7001 == null) {
	            left_7001 = Node_2511537001;
	        }
	    }

	    public void setRight_7001(Node_2511537001 Node_2511537001) {
	        if (right_7001 == null) {
	            right_7001 = Node_2511537001;
	        }
	    }

	    public Node_2511537001 getLeft_7001() {
	        return left_7001;
	    }

	    public Node_2511537001 getRight_7001() {
	        return right_7001;
	    }

	    public int getData_7001() {
	        return data_7001;
	    }

	    public void setData_7001(int data_7001) {
	        this.data_7001 = data_7001;
	    }

	    void printPreorder_7001(Node_2511537001 Node_2511537001) {

	        if (Node_2511537001 == null) {
	            return;
	        }

	        System.out.print(Node_2511537001.data_7001 + " ");

	        printPreorder_7001(Node_2511537001.left_7001);

	        printPreorder_7001(Node_2511537001.right_7001);
	    }
	    void printPostorder_7001(Node_2511537001 node_7001) {
	        if (node_7001 == null) {
	            return;
	        }

	        printPostorder_7001(node_7001.left_7001);
	        printPostorder_7001(node_7001.right_7001);
	        System.out.print(node_7001.data_7001 + " ");
	    }

	    void printInorder_7001(Node_2511537001 node_7001) {
	        if (node_7001 == null) {
	            return;
	        }

	        printInorder_7001(node_7001.left_7001);
	        System.out.print(node_7001.data_7001 + " ");
	        printInorder_7001(node_7001.right_7001);
	    }

	    public String print_7001() {
	        return this.print_7001("", true, "");
	    }

	    public String print_7001(String prefix_7001, boolean isTail_7001, String sb_7001) {
	        if (right_7001 != null) {
	            right_7001.print_7001(prefix_7001 + (isTail_7001 ? "|   " : "    "), false, sb_7001);
	        }

	        System.out.println(prefix_7001 + (isTail_7001 ? "\\-- " : "/-- ") + data_7001);

	        if (left_7001 != null) {
	            left_7001.print_7001(prefix_7001 + (isTail_7001 ? "    " : "|   "), true, sb_7001);
	        }

	        return sb_7001;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
