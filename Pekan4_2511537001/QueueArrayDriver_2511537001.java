package Pekan4_2511537001;
import java.util.*;
public class QueueArrayDriver_2511537001 {
	public static void main(String[]args) {
	QueueArray_2511537001 queue_7001= new QueueArray_2511537001(1000);
	queue_7001.enqueue_2511537001(10);
	queue_7001.enqueue_2511537001(20);
	queue_7001.enqueue_2511537001(30);
	queue_7001.enqueue_2511537001(40);
	System.out.println("item di depan"+queue_7001.front_2511537001());
	System.out.println("Item paling belakang" + queue_7001.rear());
	System.out.println("tampilan queue");
	queue_7001.display();
	System.out.println();
	System.out.println(queue_7001.dequeue_2511537001()+ "dihapus dari queue");
	System.out.println("item di depan: "+ queue_7001.front_2511537001());
	System.out.println("Item paling belakang" + queue_7001.rear());
	System.out.println("tampilan queue setelah satu data dihapus");
	queue_7001.display();
}
}