package graphDoThi;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class SampleDFSWithStack {
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
        Stack<Integer> stack = new Stack<>();
        Set<Integer> daDuyet = new HashSet<>();
        // khoi tao
        stack.add(0);
        daDuyet.add(0);

        // duyet theo Stack
        while (!stack.isEmpty()){
            int u =stack.pop();
            System.out.print(u+" ");
            // add tat ca dinh ke voi u vao stack
            for (int v = 0; v <graph.length ; v++) {
                if (graph[u][v]==1&&daDuyet.contains(v)==false){
                    stack.add(v);
                    daDuyet.add(v);
                }
            }
        }

    }
}
