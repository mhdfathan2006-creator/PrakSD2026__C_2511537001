package pekan7_2511537001;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class SortingGUI_2511537001 extends JFrame {

    private JTextField txtNama_7001, txtNim_7001, txtProdi_7001;
    private JButton btnTambah_7001, btnHapus_7001, btnSorting_7001;
    private JComboBox<String> comboSorting_7001;
    private JTable table_7001;
    private JTextArea areaProses_7001;

    private DefaultTableModel model_7001;

    private ArrayList<Mahasiswa_2511537001> listMahasiswa_7001 = new ArrayList<>();

    public SortingGUI_2511537001() {

        setTitle("Sorting Mahasiswa 2511537001");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panelInput_7001 = new JPanel(new GridLayout(4, 2));

        panelInput_7001.add(new JLabel("Nama"));
        txtNama_7001 = new JTextField();
        panelInput_7001.add(txtNama_7001);

        panelInput_7001.add(new JLabel("NIM"));
        txtNim_7001 = new JTextField();
        panelInput_7001.add(txtNim_7001);

        panelInput_7001.add(new JLabel("Prodi"));
        txtProdi_7001 = new JTextField();
        panelInput_7001.add(txtProdi_7001);

        comboSorting_7001 = new JComboBox<>();
        comboSorting_7001.addItem("Insertion Sort");
        comboSorting_7001.addItem("Selection Sort");
        comboSorting_7001.addItem("Bubble Sort");

        panelInput_7001.add(comboSorting_7001);

        btnTambah_7001 = new JButton("Tambah");
        panelInput_7001.add(btnTambah_7001);

        add(panelInput_7001, BorderLayout.NORTH);

        model_7001 = new DefaultTableModel();
        model_7001.addColumn("Nama");
        model_7001.addColumn("NIM");
        model_7001.addColumn("Prodi");

        table_7001 = new JTable(model_7001);

        add(new JScrollPane(table_7001), BorderLayout.CENTER);

        JPanel panelBawah_7001 = new JPanel(new BorderLayout());

        JPanel panelButton_7001 = new JPanel();

        btnHapus_7001 = new JButton("Hapus");
        btnSorting_7001 = new JButton("Mulai Sorting");

        panelButton_7001.add(btnHapus_7001);
        panelButton_7001.add(btnSorting_7001);

        panelBawah_7001.add(panelButton_7001, BorderLayout.NORTH);

        areaProses_7001 = new JTextArea();
        panelBawah_7001.add(new JScrollPane(areaProses_7001), BorderLayout.CENTER);

        add(panelBawah_7001, BorderLayout.SOUTH);

        // Tombol tambah
        btnTambah_7001.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tambahData_7001();
            }
        });

        // Tombol hapus
        btnHapus_7001.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                hapusData_7001();
            }
        });

        // Tombol sorting
        btnSorting_7001.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                prosesSorting_7001();
            }
        });
    }

    // Method tambah data
    public void tambahData_7001() {

        String nama_7001 = txtNama_7001.getText();
        String nim_7001 = txtNim_7001.getText();
        String prodi_7001 = txtProdi_7001.getText();

        Mahasiswa_2511537001 mhs_7001 =
                new Mahasiswa_2511537001(nama_7001, nim_7001, prodi_7001);

        listMahasiswa_7001.add(mhs_7001);

        model_7001.addRow(new Object[]{
                nama_7001,
                nim_7001,
                prodi_7001
        });

        txtNama_7001.setText("");
        txtNim_7001.setText("");
        txtProdi_7001.setText("");
    }

    // Method hapus data
    public void hapusData_7001() {

        int index_7001 = table_7001.getSelectedRow();

        if (index_7001 != -1) {

            listMahasiswa_7001.remove(index_7001);
            model_7001.removeRow(index_7001);
        }
    }

    // Method proses sorting
    public void prosesSorting_7001() {

        areaProses_7001.setText("");

        String pilihan_7001 =
                comboSorting_7001.getSelectedItem().toString();

        if (pilihan_7001.equals("Insertion Sort")) {

            insertionSort_7001();

        } else if (pilihan_7001.equals("Selection Sort")) {

            selectionSort_7001();

        } else {

            bubbleSort_7001();
        }

        tampilkanTable_7001();
    }

    // Insertion Sort
    public void insertionSort_7001() {

        areaProses_7001.append("=== INSERTION SORT ===\n");

        for (int i_7001 = 1;
             i_7001 < listMahasiswa_7001.size();
             i_7001++) {

            Mahasiswa_2511537001 key_7001 =
                    listMahasiswa_7001.get(i_7001);

            int j_7001 = i_7001 - 1;

            while (j_7001 >= 0 &&
                    listMahasiswa_7001.get(j_7001)
                            .getNama_7001()
                            .compareToIgnoreCase(
                                    key_7001.getNama_7001()) > 0) {

                listMahasiswa_7001.set(
                        j_7001 + 1,
                        listMahasiswa_7001.get(j_7001));

                j_7001--;
            }

            listMahasiswa_7001.set(j_7001 + 1, key_7001);

            areaProses_7001.append(
                    "Langkah " + i_7001 + " : "
                            + listMahasiswa_7001 + "\n");
        }
    }

    // Selection Sort
    public void selectionSort_7001() {

        areaProses_7001.append("=== SELECTION SORT ===\n");

        for (int i_7001 = 0;
             i_7001 < listMahasiswa_7001.size() - 1;
             i_7001++) {

            int min_7001 = i_7001;

            for (int j_7001 = i_7001 + 1;
                 j_7001 < listMahasiswa_7001.size();
                 j_7001++) {

                if (listMahasiswa_7001.get(j_7001)
                        .getNama_7001()
                        .compareToIgnoreCase(
                                listMahasiswa_7001
                                        .get(min_7001)
                                        .getNama_7001()) < 0) {

                    min_7001 = j_7001;
                }
            }

            Mahasiswa_2511537001 temp_7001 =
                    listMahasiswa_7001.get(i_7001);

            listMahasiswa_7001.set(
                    i_7001,
                    listMahasiswa_7001.get(min_7001));

            listMahasiswa_7001.set(min_7001, temp_7001);

            areaProses_7001.append(
                    "Pass " + (i_7001 + 1) + " : "
                            + listMahasiswa_7001 + "\n");
        }
    }

    // Bubble Sort
    public void bubbleSort_7001() {

        areaProses_7001.append("=== BUBBLE SORT ===\n");

        for (int i_7001 = 0;
             i_7001 < listMahasiswa_7001.size() - 1;
             i_7001++) {

            for (int j_7001 = 0;
                 j_7001 < listMahasiswa_7001.size() - i_7001 - 1;
                 j_7001++) {

                if (listMahasiswa_7001.get(j_7001)
                        .getNama_7001()
                        .compareToIgnoreCase(
                                listMahasiswa_7001
                                        .get(j_7001 + 1)
                                        .getNama_7001()) > 0) {

                    Mahasiswa_2511537001 temp_7001 =
                            listMahasiswa_7001.get(j_7001);

                    listMahasiswa_7001.set(
                            j_7001,
                            listMahasiswa_7001.get(j_7001 + 1));

                    listMahasiswa_7001.set(
                            j_7001 + 1,
                            temp_7001);
                }
            }

            areaProses_7001.append(
                    "Pass " + (i_7001 + 1) + " : "
                            + listMahasiswa_7001 + "\n");
        }
    }

    // Menampilkan ulang table
    public void tampilkanTable_7001() {

        model_7001.setRowCount(0);

        for (Mahasiswa_2511537001 mhs_7001
                : listMahasiswa_7001) {

            model_7001.addRow(new Object[]{

                    mhs_7001.getNama_7001(),
                    mhs_7001.getNim_7001(),
                    mhs_7001.getProdi_7001()
            });
        }
    }

    public static void main(String[] args) {

        new SortingGUI_2511537001().setVisible(true);
    }
}