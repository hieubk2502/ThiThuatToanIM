package LinkListt;

public class MyArrayQueue implements IStackQueue{
   private int[] array;
   private int SIZE;
   private int headIndex;
   private int tailIndex;

   MyArrayQueue(int size){
       this.SIZE =size;
       array=new int[SIZE];
       headIndex=-1;
       tailIndex=-1;
   }

    @Override
    public boolean push(int value) {
        if(!isFull()){
            if (empty()){
                headIndex++;
            }
            tailIndex++;
            array[tailIndex]=value;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        int value=-1;
        if (!empty()){
            value=array[headIndex];
            headIndex++;
            if (headIndex>tailIndex){
                headIndex=tailIndex=-1;
            }

        }
        return value;
    }

    public int count(){
        if (empty()){
            return 0;
        }
        return tailIndex-headIndex+1;
    }
    @Override
    public boolean empty() {
        return (headIndex==-1&&tailIndex==-1);
    }

    @Override
    public boolean isFull() {
        return tailIndex==SIZE-1;
    }

    @Override
    public void show() {
        if (empty()){
            System.out.println("Queue is empty!");
        }
        else {
            for (int i=headIndex;i<=tailIndex;i++){
                System.out.print(array[i]+" ");
            }
            System.out.println();
        }
    }
}
