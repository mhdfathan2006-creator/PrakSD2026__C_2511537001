package pekan7_2511537001;

public class InsertionSort_2511537001 {
	public static void InsertionSort_2511537001(int[] arr) {
		int n_7001 = arr.length;
		for (int i_7001 = 1; i_7001 < n_7001; i_7001++) {
			int key_7001 = arr[i_7001];
			int j_7001 = i_7001 - 1;
			while (j_7001 >= 0 && arr[j_7001] > key_7001) {
				arr[j_7001 + 1] = arr[j_7001];
				j_7001--;
			}
			arr[j_7001 + 1] = key_7001;
		}
	}

	public static void main(String[] args) {
		int arr_7001[] = {23, 78, 45, 0, 32, 56, 1 };
		int n_7001 = arr_7001.length;
		System.out.printf("array yang belum terurut:\n");
		for (int i_7001 = 0; i_7001 < n_7001; i_7001++)
			System.out.print(arr_7001[i_7001] + " ");
			System.out.println("");
		InsertionSort_2511537001(arr_7001);
		System.out.printf("array yang terurut:\n");
		for (int i_7001 = 0; i_7001 < n_7001; i_7001++)
			System.out.print(arr_7001[i_7001] + " ");
		System.out.println("");
		
	}

}
