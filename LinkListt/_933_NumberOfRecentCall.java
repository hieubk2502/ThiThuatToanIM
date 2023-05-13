package LinkListt;

import java.util.LinkedList;
import java.util.Queue;

public class _933_NumberOfRecentCall {
    private Queue<Integer> myqueue= new LinkedList<>();
    public int ping(int t){
        myqueue.add(t);
        while (myqueue.peek()<(t-3000)){
            myqueue.remove();
        }
        return myqueue.size();
    }

}
