package Pekan4_2511537001;
import java.util.*;
public class IterasiQueue_2511537001 {
	public static void main(String[] args) 
	{
		Queue<String> q_7001=new LinkedList<>();
		
		q_7001.add("Praktikum");
		q_7001.add("Struktur");
		q_7001.add("Data");
		q_7001.add("Dan");
		q_7001.add("Alghoritma");
		Iterator<String> iterator=q_7001.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+ " ");
		}
	}
}