package LinkListt;

public class MyQueueTest {
    public static void main(String[] args) {
//        MyArrayQueue myArrayQueue =new MyArrayQueue(3);
//        System.out.println(myArrayQueue.push(1));
//        System.out.println(myArrayQueue.push(2));
//        System.out.println(myArrayQueue.push(3));
//        myArrayQueue.show();
//        System.out.println(myArrayQueue.pop());
//        myArrayQueue.show();

        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.show();
        queue.pop();
        queue.show();
        queue.pop();
        queue.show();
    }

}
