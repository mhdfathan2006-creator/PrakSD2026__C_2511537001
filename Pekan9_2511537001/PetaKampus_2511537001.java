package Pekan9_2511537001;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class PetaKampus_2511537001 extends JFrame {

    private Map<String, java.util.List<String>> graph_7001 = new LinkedHashMap<>();
    private Map<String, Point> posisi_7001 = new HashMap<>();
    private Set<String> visited_7001 = new HashSet<>();
    private java.util.List<String> path_7001 = new ArrayList<>();

    private JComboBox<String> startBox_7001;
    private JComboBox<String> goalBox_7001;
    private JTextArea hasilArea_7001;
    private GraphPanel_7001 panelGraph_7001;

    public PetaKampus_2511537001() {
        setTitle("Pencarian Jalur BFS dan DFS - 2511537001");
        setSize(950, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        buatGraph_7001();

        JPanel topPanel_7001 = new JPanel();
        topPanel_7001.add(new JLabel("Lokasi Awal:"));
        startBox_7001 = new JComboBox<>(graph_7001.keySet().toArray(new String[0]));
        topPanel_7001.add(startBox_7001);

        topPanel_7001.add(new JLabel("Lokasi Tujuan:"));
        goalBox_7001 = new JComboBox<>(graph_7001.keySet().toArray(new String[0]));
        topPanel_7001.add(goalBox_7001);

        JButton bfsButton_7001 = new JButton("BFS");
        JButton dfsButton_7001 = new JButton("DFS");
        JButton resetButton_7001 = new JButton("RESET");

        topPanel_7001.add(bfsButton_7001);
        topPanel_7001.add(dfsButton_7001);
        topPanel_7001.add(resetButton_7001);

        panelGraph_7001 = new GraphPanel_7001();

        hasilArea_7001 = new JTextArea(7, 30);
        hasilArea_7001.setEditable(false);
        hasilArea_7001.setFont(new Font("Monospaced", Font.PLAIN, 14));

        add(topPanel_7001, BorderLayout.NORTH);
        add(panelGraph_7001, BorderLayout.CENTER);
        add(new JScrollPane(hasilArea_7001), BorderLayout.SOUTH);

        bfsButton_7001.addActionListener(e -> BFS_7001());
        dfsButton_7001.addActionListener(e -> DFS_7001());
        resetButton_7001.addActionListener(e -> resetGraph_7001());
    }

    private void buatGraph_7001() {
        String[] lokasi_7001 = {
                "Gerbang Utama", "Rektorat", "Perpustakaan", "Fakultas Teknik",
                "Fakultas Ekonomi", "Masjid Kampus", "Kantin", "Labor Komputer",
                "Aula", "Parkiran", "Gedung Kuliah", "Lapangan"
        };

        for (String lokasi : lokasi_7001) {
            graph_7001.put(lokasi, new ArrayList<>());
        }

        tambahEdge_7001("Gerbang Utama", "Rektorat");
        tambahEdge_7001("Gerbang Utama", "Parkiran");
        tambahEdge_7001("Rektorat", "Perpustakaan");
        tambahEdge_7001("Rektorat", "Fakultas Ekonomi");
        tambahEdge_7001("Perpustakaan", "Fakultas Teknik");
        tambahEdge_7001("Perpustakaan", "Gedung Kuliah");
        tambahEdge_7001("Fakultas Teknik", "Labor Komputer");
        tambahEdge_7001("Fakultas Teknik", "Aula");
        tambahEdge_7001("Fakultas Ekonomi", "Kantin");
        tambahEdge_7001("Fakultas Ekonomi", "Masjid Kampus");
        tambahEdge_7001("Masjid Kampus", "Kantin");
        tambahEdge_7001("Kantin", "Lapangan");
        tambahEdge_7001("Labor Komputer", "Gedung Kuliah");
        tambahEdge_7001("Aula", "Lapangan");
        tambahEdge_7001("Parkiran", "Masjid Kampus");
        tambahEdge_7001("Parkiran", "Lapangan");

        posisi_7001.put("Gerbang Utama", new Point(80, 250));
        posisi_7001.put("Rektorat", new Point(220, 150));
        posisi_7001.put("Perpustakaan", new Point(400, 90));
        posisi_7001.put("Fakultas Teknik", new Point(620, 90));
        posisi_7001.put("Fakultas Ekonomi", new Point(360, 250));
        posisi_7001.put("Masjid Kampus", new Point(250, 390));
        posisi_7001.put("Kantin", new Point(480, 370));
        posisi_7001.put("Labor Komputer", new Point(750, 170));
        posisi_7001.put("Aula", new Point(730, 300));
        posisi_7001.put("Parkiran", new Point(120, 430));
        posisi_7001.put("Gedung Kuliah", new Point(570, 220));
        posisi_7001.put("Lapangan", new Point(650, 430));
    }

    private void tambahEdge_7001(String a_7001, String b_7001) {
        graph_7001.get(a_7001).add(b_7001);
        graph_7001.get(b_7001).add(a_7001);
    }

    public void BFS_7001() {
        resetData_7001();

        String start_7001 = (String) startBox_7001.getSelectedItem();
        String goal_7001 = (String) goalBox_7001.getSelectedItem();

        Queue<String> queue_7001 = new LinkedList<>();
        Map<String, String> parent_7001 = new HashMap<>();

        queue_7001.add(start_7001);
        visited_7001.add(start_7001);
        parent_7001.put(start_7001, null);

        while (!queue_7001.isEmpty()) {
            String current_7001 = queue_7001.poll();

            if (current_7001.equals(goal_7001)) {
                break;
            }

            for (String neighbor_7001 : graph_7001.get(current_7001)) {
                if (!visited_7001.contains(neighbor_7001)) {
                    visited_7001.add(neighbor_7001);
                    parent_7001.put(neighbor_7001, current_7001);
                    queue_7001.add(neighbor_7001);
                }
            }
        }

        buatPath_7001(parent_7001, start_7001, goal_7001);
        displayPath_7001("BFS");
    }

    public void DFS_7001() {
        resetData_7001();

        String start_7001 = (String) startBox_7001.getSelectedItem();
        String goal_7001 = (String) goalBox_7001.getSelectedItem();

        Stack<String> stack_7001 = new Stack<>();
        Map<String, String> parent_7001 = new HashMap<>();

        stack_7001.push(start_7001);
        parent_7001.put(start_7001, null);

        while (!stack_7001.isEmpty()) {
            String current_7001 = stack_7001.pop();

            if (!visited_7001.contains(current_7001)) {
                visited_7001.add(current_7001);

                if (current_7001.equals(goal_7001)) {
                    break;
                }

                for (String neighbor_7001 : graph_7001.get(current_7001)) {
                    if (!visited_7001.contains(neighbor_7001)) {
                        stack_7001.push(neighbor_7001);
                        if (!parent_7001.containsKey(neighbor_7001)) {
                            parent_7001.put(neighbor_7001, current_7001);
                        }
                    }
                }
            }
        }

        buatPath_7001(parent_7001, start_7001, goal_7001);
        displayPath_7001("DFS");
    }

    private void buatPath_7001(Map<String, String> parent_7001, String start_7001, String goal_7001) {
        path_7001.clear();

        if (!parent_7001.containsKey(goal_7001)) {
            return;
        }

        String current_7001 = goal_7001;
        while (current_7001 != null) {
            path_7001.add(current_7001);
            current_7001 = parent_7001.get(current_7001);
        }

        Collections.reverse(path_7001);
    }

    public void displayPath_7001(String metode_7001) {
        hasilArea_7001.setText("");
        hasilArea_7001.append("Hasil Pencarian Menggunakan " + metode_7001 + "\n");

        if (path_7001.isEmpty()) {
            hasilArea_7001.append("Jalur: Tidak ditemukan\n");
        } else {
            hasilArea_7001.append("Jalur: " + String.join(" -> ", path_7001) + "\n");
        }

        hasilArea_7001.append("Node Dikunjungi: " + visited_7001 + "\n");
        hasilArea_7001.append("Jumlah Node Dieksplorasi: " + visited_7001.size() + "\n");

        displayGraph_7001();
    }

    public void displayGraph_7001() {
        panelGraph_7001.repaint();
    }

    public void resetGraph_7001() {
        resetData_7001();
        hasilArea_7001.setText("Graph dikembalikan ke kondisi awal.\n");
        displayGraph_7001();
    }

    private void resetData_7001() {
        visited_7001.clear();
        path_7001.clear();
    }

    class GraphPanel_7001 extends JPanel {
        protected void paintComponent(Graphics g_7001) {
            super.paintComponent(g_7001);
            setBackground(Color.WHITE);

            Graphics2D g2_7001 = (Graphics2D) g_7001;
            g2_7001.setStroke(new BasicStroke(2));

            for (String node_7001 : graph_7001.keySet()) {
                Point p1_7001 = posisi_7001.get(node_7001);

                for (String tetangga_7001 : graph_7001.get(node_7001)) {
                    Point p2_7001 = posisi_7001.get(tetangga_7001);
                    g2_7001.setColor(Color.GRAY);
                    g2_7001.drawLine(p1_7001.x, p1_7001.y, p2_7001.x, p2_7001.y);
                }
            }

            for (String node_7001 : graph_7001.keySet()) {
                Point p_7001 = posisi_7001.get(node_7001);

                if (path_7001.contains(node_7001)) {
                    g2_7001.setColor(Color.ORANGE);
                } else if (visited_7001.contains(node_7001)) {
                    g2_7001.setColor(Color.GREEN);
                } else {
                    g2_7001.setColor(Color.CYAN);
                }

                g2_7001.fillOval(p_7001.x - 25, p_7001.y - 25, 50, 50);
                g2_7001.setColor(Color.BLACK);
                g2_7001.drawOval(p_7001.x - 25, p_7001.y - 25, 50, 50);
                g2_7001.drawString(node_7001, p_7001.x - 45, p_7001.y + 45);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new PetaKampus_2511537001().setVisible(true);
        });
    }
}