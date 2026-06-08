package Pekan9_2511537001;

import java.util.*;

public class GraphTraversal_2511537001 {

    private Map<String, List<String>> graph_7001 = new HashMap<>();

    // Menambahkan edge (graf tak berarah)
    public void addEdge_7001(String node1_7001, String node2_7001) {
        graph_7001.putIfAbsent(node1_7001, new ArrayList<>());
        graph_7001.putIfAbsent(node2_7001, new ArrayList<>());

        graph_7001.get(node1_7001).add(node2_7001);
        graph_7001.get(node2_7001).add(node1_7001);
    }

    // Menampilkan graf awal
    public void printGraph_7001() {
        System.out.println("Graf Awal (Adjacency List):");

        for (String node_7001 : graph_7001.keySet()) {
            System.out.print(node_7001 + " -> ");

            List<String> neighbors_7001 = graph_7001.get(node_7001);
            System.out.println(String.join(", ", neighbors_7001));
        }

        System.out.println();
    }

    // DFS rekursif
    public void dfs_7001(String start_7001) {
        Set<String> visited_7001 = new HashSet<>();

        System.out.println("Penelusuran DFS:");
        dfsHelper_7001(start_7001, visited_7001);

        System.out.println();
    }

    private void dfsHelper_7001(String current_7001, Set<String> visited_7001) {
        if (visited_7001.contains(current_7001)) {
            return;
        }

        visited_7001.add(current_7001);
        System.out.print(current_7001 + " ");

        for (String neighbor_7001 : graph_7001.getOrDefault(current_7001, new ArrayList<>())) {
            dfsHelper_7001(neighbor_7001, visited_7001);
        }
    }
 // BFS iteratif
    public void bfs_7001(String start_7001) {
        Set<String> visited_7001 = new HashSet<>();
        Queue<String> queue_7001 = new LinkedList<>();

        queue_7001.add(start_7001);
        visited_7001.add(start_7001);

        System.out.println("Penelusuran BFS:");

        while (!queue_7001.isEmpty()) {
            String current_7001 = queue_7001.poll();

            System.out.print(current_7001 + " ");

            for (String neighbor_7001 : graph_7001.getOrDefault(current_7001, new ArrayList<>())) {
                if (!visited_7001.contains(neighbor_7001)) {
                    queue_7001.add(neighbor_7001);
                    visited_7001.add(neighbor_7001);
                }
            }
        }

        System.out.println();
    }

    // Main
    public static void main(String[] args_7001) {
        GraphTraversal_2511537001 graph_7001 = new GraphTraversal_2511537001();

        // Contoh graf: A-B, A-C, B-D, B-E
        graph_7001.addEdge_7001("A", "B");
        graph_7001.addEdge_7001("A", "C");
        graph_7001.addEdge_7001("B", "D");
        graph_7001.addEdge_7001("B", "E");

        // Cetak graf awal
        System.out.println("Graf Awal adalah: ");
        graph_7001.printGraph_7001();

        // Lakukan penelusuran
        graph_7001.dfs_7001("A");
        graph_7001.bfs_7001("A");
    }
}