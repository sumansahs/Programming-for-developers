package ques1;//b)
//        Assume you were hired to create an application for an ISP, and there is n number of network devices, such as routers,
//        that are linked together to provides internet access to home user users. You are given a 2D array that represents network
//        connections between these network devices such that a[i]=[xi,yi] where xi is connected to yi device.  Suppose there is a
//        power outage on a certain device provided as int n represents id of the device on which power failure occurred)), Write an
//        algorithm to return impacted network devices due to breakage of the link between network devices. These impacted device
//        list assists you notify linked consumers that there is a power outage and it will take some time to rectify an issue.
//        Note that: node 0 will always represent a source of internet or gateway to international network..
//         
//
//        Input: edges= {{0,1}, {0,2}, {1,3}, {1,6}, {2,4}, {4,6}, {4,5}, {5,7}}
//        Target Device (On which power Failure occurred): 4
//        Output (Impacted Device List) = {5,7}
//        Explanation: power failure on network device 4 will disconnect 5 and 7 from internet



import java.util.*;

class Graph {

    static void addEdge(ArrayList<ArrayList<Integer>> am, int s, int d) {
        am.get(s).add(d);
        am.get(d).add(s);
    }


    static void removeEdge(ArrayList<ArrayList<Integer>> am, int s, int d) {
        if (am.get(s).contains(d)) {
            am.get(s).remove(Integer.valueOf(d));
            System.out.println("removed node " + s);
        }
        if (am.get(d).contains(s)) {
            am.get(d).remove(Integer.valueOf(s));
            System.out.println("removed node " + d);
        }
    }



    private static void printDisconnectedNodes(ArrayList<ArrayList<Integer>> am, int disconnectedNode) {
        for (int i = am.get(disconnectedNode).size() - 1; i >= 0; i--) {
            int neighbor = am.get(disconnectedNode).get(i);
            System.out.println("Removing edge between " + disconnectedNode + " and " + neighbor);
            removeEdge(am, disconnectedNode, neighbor);
        }
    }
    static boolean isReachable(ArrayList<ArrayList<Integer>> am, int s, int d) {
        boolean[] visited = new boolean[am.size()];
        return dfs(am, visited, s, d);
    }

    static boolean dfs(ArrayList<ArrayList<Integer>> am, boolean[] visited, int s, int d) {
        visited[s] = true;
        if (s == d) {
            return true;
        }
        for (int i = 0; i < am.get(s).size(); i++) {
            int v = am.get(s).get(i);
            if (!visited[v] && dfs(am, visited, v, d)) {
                return true;
            }
        }
        return false;
    }



    public static void main(String[] args) {

        int V = 8;
        ArrayList<ArrayList<Integer>> am = new ArrayList<ArrayList<Integer>>(V);

        for (int i = 0; i < V; i++)
            am.add(new ArrayList<Integer>());
            addEdge(am, 0, 1);
            addEdge(am, 0, 2);
            addEdge(am, 1, 3);
            addEdge(am, 2, 4);
            addEdge(am, 1, 6);
            addEdge(am, 4, 6);
            addEdge(am, 4, 5);
            addEdge(am, 5, 7);
            int disconnectedNode=4;
            printDisconnectedNodes(am,disconnectedNode);

            int nodes[] ={0,1,2,3,4,5,6,7};
            int destination = 0;
            for(int i=0; i<nodes.length;i++){
                int source = nodes[i];
                boolean disconn = isReachable(am,source,destination);
                if(disconn==false){
                    System.out.println("disconnected nodes are "+nodes[i]);
                }

            }
    }
}


