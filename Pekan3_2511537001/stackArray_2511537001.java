package Pekan3_2511537001;

public class stackArray_2511537001 {
	static final int MAX_7001= 1000;
	int top_7001;
	int a[] = new int [MAX_7001];
	boolean isEmpty_7001()  
	{
		return (top_7001 < 0) ;
	}
	stackArray_2511537001() 
	{
		top_7001=-1;
	}
	boolean push_7001 (int x)
	{
		if (top_7001>= (MAX_7001 - 1)) {
			System.out.println("Stack Overflow");
			return false;
		}
		else {
			a[++top_7001] = x;
			System.out.println( x  + " dimasukkan dalam stack");
			return true;
		}
	}
	int pop_7001() 
	{
		if (top_7001 < 0 ) {
			System.out.println("stack underflow");
			return 0;
		}else {
			int x = a[top_7001--];
			return x;
		}
	}
	int peek_7001() 
	{
		if (top_7001<0) 
		{
			System.out.println("stack underflow");
			return 0;
		}
		else 
		{
			int x = a [top_7001];
			return x;
		}
	}
	void print_7001 () {
		for (int i=top_7001; i>-1;i--) {
			System.out.print(" " +a[i]);
		}
	}

}