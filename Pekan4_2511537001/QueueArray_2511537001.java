package Pekan4_2511537001;

public class QueueArray_2511537001 {
	int front_7001,rear_7001,size_7001;
	int capacity_7001;
	int array_7001[];
	
	public QueueArray_2511537001(int capacity) {
		this.capacity_7001=capacity;
		front_7001=this.size_7001=0;
		rear_7001=capacity-1;
		array_7001= new int[this.capacity_7001];
		
	}
	
	boolean isFull_2511537001(QueueArray_2511537001 queue) {
		return (queue.size_7001==queue.capacity_7001);
	}
	boolean isEmpty_2511537001(QueueArray_2511537001 queue) {
		return (queue.size_7001==0);
	}
	
	void enqueue_2511537001(int item) {
		if(isFull_2511537001(this))
			return;
		this.rear_7001=(this.rear_7001+1) % this.capacity_7001;
		this.array_7001[this.rear_7001]=item;
		this.size_7001=this.size_7001 +1;
		System.out.println(item+ "enqueued to queue ");
	}
		int dequeue_2511537001() {
			if(isEmpty_2511537001(this))
				return Integer.MIN_VALUE;
			int item=this.array_7001[this.front_7001];
			int front=(this.front_7001+1)% this.capacity_7001;
			this.size_7001=this.size_7001-1;
			return item;
		}
		int front_2511537001() {
			if(isEmpty_2511537001(this))
				return Integer.MIN_VALUE;
			return this.array_7001[this.front_7001];
		}
		int rear() {
			if (isEmpty_2511537001(this))
				return Integer.MIN_VALUE;
			return this.array_7001[this.rear_7001];
		}
			//mencetak elemen antrian
		void display() {
			int i;
			if (front_7001==rear_7001) {
				System.out.println("\nAntrian Kosong");
				return;
			}
			//Kunjungi dari belakang dan cetak
			for(i=front_7001;i<rear_7001;i++) {
				System.out.printf("%d <--",array_7001[i]);
			}
			return;
		}

			
				
			
			
			
		
			
	
}

