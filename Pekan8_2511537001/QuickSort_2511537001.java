package Pekan8_2511537001;

public class QuickSort_2511537001 {

    static void swap_7001(int[] arr_7001, int i_7001, int j_7001) {

        int temp_7001 = arr_7001[i_7001];
        arr_7001[i_7001] = arr_7001[j_7001];
        arr_7001[j_7001] = temp_7001;
    }

    // Metode tambahan untuk mengatur pivot menggunakan Median-of-Three
    static void medianOfThree_7001(int[] arr_7001, int low_7001, int high_7001) {

        int mid_7001 = low_7001 + (high_7001 - low_7001) / 2;

        // Urutkan elemen low, mid, dan high
        if (arr_7001[low_7001] > arr_7001[mid_7001]) {
            swap_7001(arr_7001, low_7001, mid_7001);
        }

        if (arr_7001[low_7001] > arr_7001[high_7001]) {
            swap_7001(arr_7001, low_7001, high_7001);
        }

        if (arr_7001[mid_7001] > arr_7001[high_7001]) {
            swap_7001(arr_7001, mid_7001, high_7001);
        }

        // Pindahkan median ke posisi high
        swap_7001(arr_7001, mid_7001, high_7001);
    }

    static int partition_7001(int[] arr_7001, int low_7001, int high_7001) {

        // Panggil fungsi medianOfThree sebelum menentukan pivot
        medianOfThree_7001(arr_7001, low_7001, high_7001);

        // Sekarang arr[high] sudah berisi nilai median
        int pivot_7001 = arr_7001[high_7001];

        int i_7001 = (low_7001 - 1);

        for (int j_7001 = low_7001; j_7001 < high_7001; j_7001++) {

            // Jika elemen saat ini lebih kecil dari atau sama dengan pivot
            if (arr_7001[j_7001] <= pivot_7001) {

                // Increment indeks elemen yang lebih kecil
                i_7001++;

                swap_7001(arr_7001, i_7001, j_7001);
            }
        }

        swap_7001(arr_7001, i_7001 + 1, high_7001);

        return (i_7001 + 1);
    }

    static void quickSort_7001(int[] arr_7001, int low_7001, int high_7001) {

        if (low_7001 < high_7001) {

            int pi_7001 = partition_7001(arr_7001, low_7001, high_7001);

            quickSort_7001(arr_7001, low_7001, pi_7001 - 1);
            quickSort_7001(arr_7001, pi_7001 + 1, high_7001);
        }
    }

    static void printArray_7001(int[] arr_7001) {

        for (int value_7001 : arr_7001) {
            System.out.print(value_7001 + " ");
        }

        System.out.println();
    }

    public static void main_7001(String[] args_7001) {

        int[] data_7001 = {10, 7, 8, 9, 1, 5};

        System.out.print("Sebelum: ");
        printArray_7001(data_7001);

        quickSort_7001(data_7001, 0, data_7001.length - 1);

        System.out.print("Sesudah (Quick Sort): ");
        printArray_7001(data_7001);
    }
}