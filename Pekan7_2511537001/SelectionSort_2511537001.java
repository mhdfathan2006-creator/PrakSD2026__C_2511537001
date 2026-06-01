package pekan7_2511537001;

public class SelectionSort_2511537001 {

	public static void SelectionSort_2511537001 ( int[]arr){
		int n_7001= arr.length;
		for (int i_7001 =0;i_7001<n_7001;i_7001++) {
			int minIndex_7001=i_7001;
			for (int j_7001=i_7001+1;j_7001<n_7001;j_7001++) {
				if (arr[j_7001] < arr[minIndex_7001]) {
					minIndex_7001=j_7001;
				}
			}
			int temp_7001=arr[i_7001];
			arr[i_7001]=arr[minIndex_7001];
			arr[minIndex_7001]=temp_7001;
		}

	}	public static void main(String[]args) {
		int arr_7001[]= {23,78,45,8,32,56,1};
		int n_7001=arr_7001.length;
		System.out.printf("Array yang belum terurut:\n");
		for(int i_7001=0;i_7001<n_7001;i_7001++) 
			System.out.print(arr_7001[i_7001]+ " ");
		System.out.println("");
		SelectionSort_2511537001(arr_7001);
		System.out.printf("Array yang terurut:\n");
		for (int i_7001=0;i_7001<n_7001;i_7001++)
			System.out.print(arr_7001[i_7001]+ " ");
		System.out.println(" ");	
		
		}
	}