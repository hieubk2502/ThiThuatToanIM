package LinkListt;

import java.util.ArrayList;

public class MyLinkedListStack implements IStackQueue{
    private class Node{
        int value;
        Node next;
        Node(int value){
            this.value=value;
        }
    }
    Node topNode;

    @Override
    public boolean push(int value) {
        // them vao dau linked list
        if (!isFull()){
            Node newNode = new Node(value);
            newNode.next =topNode;
            topNode=newNode;
            return true;
        }

        return false;
    }

    @Override
    public int pop() {
        if (empty()){
            return -1;
        }
        int value = topNode.value;
        topNode=topNode.next;
        return value;
    }

    @Override
    public boolean empty() {
        return topNode==null;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void show() {
        if (empty()){
            System.out.println("Stack is empty");
        }
        Node temp = topNode;
        ArrayList<Integer> tempList = new ArrayList<>();
        while (temp !=null){
//            System.out.println(temp.value+" ");
            tempList.add(temp.value);
            temp=temp.next;
        }
        for (int i = tempList.size()-1; i >=0 ; i--) {
            System.out.print(tempList.get(i)+" ");
        }
        System.out.println();
    }
}
