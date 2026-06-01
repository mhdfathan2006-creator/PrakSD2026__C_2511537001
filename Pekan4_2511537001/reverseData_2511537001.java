package Pekan4_2511537001;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class reverseData_2511537001 {

	public static void main(String[] args) {
		Queue<Integer>q_7001=new LinkedList<Integer>();
		q_7001.add(1);
		q_7001.add(2);
		q_7001.add(3); // [1,2,3]
		System.out.println("sebelum reverse"+q_7001);
		Stack<Integer>s=new Stack<Integer>();
		while(!q_7001.isEmpty()) {//Q->S
			s.push(q_7001.remove());
		}
		while(!s.isEmpty()) {//S->Q
			q_7001.add(s.pop());
		}
		System.out.println("Sesudah Reverse="+q_7001);//[3,2,1]
	}

}