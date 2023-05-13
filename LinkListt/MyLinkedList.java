package LinkListt;

public class MyLinkedList {
    public static class Node{
        int value;
        Node next;
        Node(int value){
            this.value =value;
        }
    }
    // print Linked List
    public static void printLinkedList(Node head){
        if (head==null){
            System.out.println("List is empty!");
        }
        else {
            Node temp = head;
            while (temp !=null){
                System.out.print(temp.value);
                temp = temp.next;
                if (temp !=null){
                    System.out.print("->");
                }else {
                    System.out.println();
                }
            }
        }
    }
    // them phan tu vao dau addToHead
    public static Node addToHead(Node headNode, int value){
        Node newNode = new Node(value);
        if (headNode !=null){
            newNode.next= headNode;
        }
        return newNode;
    }
    // them phan tu vao cuoi addToTail
    public static Node addToTail(Node headNode, int value){
        Node newNode=new Node(value);
        if (headNode ==null){
            return null;
        }
        else {
            Node lastNode = headNode;
            // B1. xac dinh lastNode( lastNode.next = null
            while (lastNode.next !=null){
                lastNode = lastNode.next;
            }
            // B2 gan next cho lastNode = newNode
            lastNode.next = newNode;
        }
        return headNode;
    }
    // them vao giua linkedlist
    public static Node addToIndex(Node headNode, int value, int index){
        if (index==0){
            return addToHead(headNode,value);
        }else {
            // tim vi tri can them
            Node curNode = headNode;
            Node newNode = new Node(value);
            int count =0;
            while (curNode !=null){
                count++;
                if (count ==index){
                    // thuc hien add
                    newNode.next = curNode.next;
                    curNode.next=newNode;
                    break;
                }
                curNode = curNode.next;
            }
        }
        return headNode;
    }
    // delete addToHead
    public static Node removeAtHead(Node headNode){
        if (headNode !=null){
            return headNode.next;
        }
        return headNode;
    }
    public static Node removeAtTail(Node headNode){
        if (headNode !=null){
            Node lastNode =headNode;
            Node preNode =null;
            while (lastNode.next !=null){
                preNode =lastNode;
                lastNode = lastNode.next;
            }
            if (preNode==null){
                return null;// chi co 1 Node
            }
            else {
                preNode.next = lastNode.next;
            }
        }
        return headNode;
    }
    // delete index
    public static Node removeIndex(Node headNode, int index){
        if(headNode ==null &&index <0){
            return null;
        }
        if (index==0){
            return removeAtHead(headNode);
        }
        Node curNode=headNode;
        Node prevNode = null;
        int count=0;
        boolean bIsFound = false;
        while (curNode.next !=null){
            if (count ==index){
                // remove curNode
                bIsFound =true;
                break;
            }

            prevNode =curNode;
            curNode = curNode.next;
            count++;
        }
        // remove curr
        if(bIsFound){
            if (prevNode==null){
                // current Node is lastNode
                return null;
            }
            else {
                prevNode.next=curNode.next;
            }
        }
        return headNode;
    }
    // reverse LinkedList
    public static class ListNode{
        int value;
        ListNode next;
        ListNode(){};
        ListNode(int value){this.value =value;}
        ListNode(int value, ListNode next){this.value= value;this.next =next;}
    }
    public static ListNode reverseList(ListNode head){
         ListNode curNode = head;
         while (curNode.next !=null &&curNode!=null){
             ListNode nextNode  = curNode.next;
             curNode.next = nextNode.next;
             nextNode.next = head;
             head =nextNode;
         }
         return head;
    }
    public static void printLinkedListReverse(ListNode head){
        while (head != null){
            System.out.printf("%d",head.value);
            head = head.next;
            if (head!=null){
            System.out.print("->");}
        }
        System.out.println();
    }
    // su dung de quy
    public static ListNode reverseList2(ListNode head){
        // TH co so
        if (head==null){
            return null;
        }
        ListNode nextNode = head.next;
        if (nextNode==null){
            return head;
        }
        //TH tong quat
        ListNode newHead=reverseList2(nextNode);
        nextNode.next=head;
        head.next=null;
        return newHead;

    }

    public static void main(String[] args) {
//        Node n1 = new Node(1);
//        Node n2 = new Node(2);
//        Node n3 = new Node(3);
//        n1.next = n2;
//        n2.next = n3;
//        printLinkedList(n1);
//        Node newNode = addToHead(n1,0);
//        printLinkedList(newNode);
//        Node lastNode = addToTail(n1,4);
//        printLinkedList(lastNode);
//        Node indexNode = addToIndex(n1,6,1);
//        printLinkedList(indexNode);
//        Node removeLast =removeAtTail(n1);
//        printLinkedList(removeLast);
//        Node removeIndex= removeIndex(n1,1);
//        printLinkedList(removeIndex);

        ListNode ln1=new ListNode(1);
        ListNode ln2=new ListNode(2);
        ListNode ln3=new ListNode(3);
        ListNode ln4=new ListNode(4);
        ln1.next=ln2;
        ln2.next=ln3;
        ln3.next=ln4;
//        ListNode newListNode = reverseList(ln1);
//        printLinkedListReverse(newListNode);

        ListNode newListNode2 = reverseList2(ln1);
        printLinkedListReverse(newListNode2);

    }
}
