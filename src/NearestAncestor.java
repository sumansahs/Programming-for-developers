//import java.util.Arrays;
//
//public class NearestAncestor {
//    public static int[] NearestAncestor(int[] values, int[][] edges) {
//        int n = values.length;
//        int[] nearestAncestors = new int[n];
//        Arrays.fill(nearestAncestors, -1);
//        boolean[] visited = new boolean[n];
//
//        dfs(0, -1, values, edges, nearestAncestors, visited);
//
//        return nearestAncestors;
//    }
//
//    private static void dfs(int node, int parent, int[] values, int[][] edges, int[] nearestAncestors, boolean[] visited) {
//        visited[node] = true;
//
//        // check if GCD of node and parent's values is 1
//        if (parent != -1 && gcd(values[node], values[parent]) == 1) {
//            nearestAncestors[node] = parent;
//            return;
//        }
//
//        // visit all child nodes
//        for (int[] edge : edges) {
//            if (edge[0] == node) {
//                int child = edge[1];
//                if (!visited[child]) {
//                    dfs(child, node, values, edges, nearestAncestors, visited);
//                }
//            }
//        }
//    }
//
//    private static int gcd(int a, int b) {
//        if (b == 0) {
//            return a;
//        }
//        return gcd(b, a % b);
//    }
//
//    public static void main(String[] args) {
//        int[] values = {3, 2, 6, 6, 4, 7, 12};
//        int[][] edges = {{0, 1}, {0, 2}, {1, 3}, {1, 4}, {2, 5}, {2, 6}};
//        int[] nearestAncestors = NearestAncestor(values, edges);
//        System.out.println(Arrays.toString(nearestAncestors));
//    }
//}
