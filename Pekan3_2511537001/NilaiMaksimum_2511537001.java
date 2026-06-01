package Pekan3_2511537001;
import java.util.Stack;
public class NilaiMaksimum_2511537001 {
	public static int max (Stack <Integer>s_7001) {	
	Stack <Integer> backup_7001 = new Stack <Integer>();
	int maxValue_7001 = s_7001.pop();
	backup_7001.push (maxValue_7001);
	while (!s_7001.isEmpty()) {
		int next_7001=s_7001.pop();
		backup_7001.push(next_7001);
		maxValue_7001 = Math.max(maxValue_7001, next_7001);
	}
	while (!backup_7001.isEmpty() ) {
		s_7001.push(backup_7001.pop());
	}
	return maxValue_7001;
  }
	public static void main(String[] args) {
		Stack <Integer> s_7001 = new Stack<Integer> ();
		s_7001.push (70);
		s_7001.push (12);
		s_7001.push (20);
		System.out.println("isi stack " + s_7001);
		System.out.println("Stack Teratas " + s_7001.peek());
		System.out.println("nilai maksimum " + max(s_7001));	
	}

}