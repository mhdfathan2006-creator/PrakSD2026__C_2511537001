package Pekan8_2511537001;

public class MergeSort_2511537001 {
    void merge(int arr[], int l_7001, int m_7001, int r_7001) {
        // Find sizes of two subarrays to be merged
        int n1_7001 = m_7001 - l_7001 + 1;
        int n2_7001 = r_7001 - m_7001;
        /* Create temp arrays */
        int L_7001[] = new int[n1_7001];
        int R_7001[] = new int[n2_7001];
        /* Copy data to temp arrays */
        for (int i_7001 = 0; i_7001 < n1_7001; ++i_7001)
            L_7001[i_7001] = arr[l_7001 + i_7001];
        for (int j_7001 = 0; j_7001 < n2_7001; ++j_7001)
            R_7001[j_7001] = arr[m_7001 + 1 + j_7001];
        int i_7001 = 0, j_7001 = 0;
        // Initial index of merged subarray array
        int k_7001 = l_7001;
        while (i_7001 < n1_7001 && j_7001 < n2_7001) {
            if (L_7001[i_7001] <= R_7001[j_7001]) {
                arr[k_7001] = L_7001[i_7001];
                i_7001++;
            } else {
                arr[k_7001] = R_7001[j_7001];
                j_7001++;
            }
            k_7001++;
        }
        /* Copy remaining elements of L[] if any */
        while (i_7001 < n1_7001) {
            arr[k_7001] = L_7001[i_7001];
            i_7001++;
            k_7001++;
        }
        /* Copy remaining elements of R[] if any */
        while (j_7001 < n2_7001) {
            arr[k_7001] = R_7001[j_7001];
            j_7001++;
            k_7001++;
        }
    }
    void sort(int arr_7001[], int l_7001, int r_7001) {
        if (l_7001 < r_7001) {
            // Find the middle point
            int m_7001 = (l_7001 + r_7001) / 2;
            // Sort first and second halves
            sort(arr_7001, l_7001, m_7001);
            sort(arr_7001, m_7001 + 1, r_7001);
            // Merge the sorted halves
            merge(arr_7001, l_7001, m_7001, r_7001);
        }
    }

    /* A utility function to print array of size n */
    static void printArray(int arr_7001[]) {
        int n_7001 = arr_7001.length;
        for (int i_7001 = 0; i_7001 < n_7001; ++i_7001)
            System.out.print(arr_7001[i_7001] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        int arr_7001[] = { 12, 11, 13, 5, 6, 7 };
        System.out.println("Sebelum terurut");
        printArray(arr_7001);
        MergeSort_2511537001 ob_7001 = new MergeSort_2511537001();
        ob_7001.sort(arr_7001, 0, arr_7001.length - 1);
        System.out.println("\nSesudah Terurut menggunakan merge Sort");
        printArray(arr_7001);
    }
}