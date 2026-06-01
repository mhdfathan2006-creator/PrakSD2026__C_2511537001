package Pekan8_2511537001;

public class ShellSort_2511537001 {

    public static void ShellSort_2511537001(int[] A_7001) {

        int n_7001 = A_7001.length;
        int gap_7001 = n_7001 / 2;

        while (gap_7001 > 0) {

            for (int i_7001 = gap_7001; i_7001 < n_7001; i_7001++) {

                int temp_7001 = A_7001[i_7001];
                int j_7001 = i_7001;

                while (j_7001 >= gap_7001 && A_7001[j_7001 - gap_7001] > temp_7001) {
                    A_7001[j_7001] = A_7001[j_7001 - gap_7001];
                    j_7001 -= gap_7001;
                }

                A_7001[j_7001] = temp_7001;
            }

            gap_7001 = gap_7001 / 2;
        }
    }

    public static void main_7001(String[] args_7001) {

        int[] data_7001 = {3, 10, 4, 6, 8, 9, 7, 2, 1, 5};

        System.out.print("Sebelum: ");
        printArray_7001(data_7001);

        ShellSort_2511537001(data_7001);

        System.out.print("Sesudah (Shell Sort): ");
        printArray_7001(data_7001);
    }

    public static void printArray_7001(int[] arr_7001) {

        for (int i_7001 : arr_7001) {
            System.out.print(i_7001 + " ");
        }

        System.out.println();
    }
}