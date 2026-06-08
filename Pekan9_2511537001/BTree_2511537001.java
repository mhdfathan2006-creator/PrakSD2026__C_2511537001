package Pekan9_2511537001;

public class BTree_2511537001 {

    private Node_2511537001 root_7001;
    private Node_2511537001 currentNode_7001;

    public BTree_2511537001() {
        root_7001 = null;
    }

    public boolean search_7001(int data_7001) {
        return search_7001(root_7001, data_7001);
    }

    private boolean search_7001(Node_2511537001 node_7001, int data_7001) {
        if (node_7001 == null) {
            return false;
        }

        if (node_7001.getData_7001() == data_7001) {
            return true;
        }

        if (node_7001.getLeft_7001() != null) {
            if (search_7001(node_7001.getLeft_7001(), data_7001)) {
                return true;
            }
        }

        if (node_7001.getRight_7001() != null) {
            if (search_7001(node_7001.getRight_7001(), data_7001)) {
                return true;
            }
        }

        return false;
    }

    public void printInorder_7001() {
        root_7001.printInorder_7001(root_7001);
    }

    public void printPreOrder_7001() {
        root_7001.printPreorder_7001(root_7001);
    }

    public void printPostOrder_7001() {
        root_7001.printPostorder_7001(root_7001);
    }

    public Node_2511537001 getRoot_7001() {
        return root_7001;
    }

    public boolean isEmpty_7001() {
        return root_7001 == null;
    }

    public int countNodes_7001() {
        return countNodes_7001(root_7001);
    }

    private int countNodes_7001(Node_2511537001 node_7001) {
        int count_7001 = 1;

        if (node_7001 == null) {
            return 0;
        } else {
            count_7001 += countNodes_7001(node_7001.getLeft_7001());
            count_7001 += countNodes_7001(node_7001.getRight_7001());

            return count_7001;
        }
    }

    public void print_7001() {
        root_7001.print_7001();
    }

    public Node_2511537001 getCurrent_7001() {
        return currentNode_7001;
    }

    public void setCurrent_7001(Node_2511537001 node_7001) {
        this.currentNode_7001 = node_7001;
    }

    public void setRoot_7001(Node_2511537001 root_7001) {
        this.root_7001 = root_7001;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    }
}