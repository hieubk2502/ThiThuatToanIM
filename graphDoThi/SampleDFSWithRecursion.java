package graphDoThi;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class SampleDFSWithRecursion {
    public static void DFS(int u, int[][] graph, Set<Integer> daDuyet) {
        System.out.println(u +" ");
        for (int v = 0; v < graph.length; v++) {
            if (graph[u][v]==1 &&daDuyet.contains(v)==false){
                daDuyet.add(v);
                DFS(v,graph,daDuyet);
            }
        }
    }
    public static void main(String[] args) {
        int[][] graph =
                {
                        {0,1,0,0,0,0,0},
                        {1,0,1,1,1,0,0},
                        {0,1,0,0,0,1,0},
                        {0,1,0,0,0,1,1},
                        {0,1,0,0,0,0,1},
                        {0,0,1,1,0,0,0},
                        {0,0,0,1,1,0,0}
                };
        // khai bao
        Set<Integer> daDuyet = new HashSet<>();
        // khoi tao
        daDuyet.add(0);
        DFS(0,graph,daDuyet);
    }


}
