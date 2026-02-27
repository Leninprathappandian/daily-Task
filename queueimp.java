//queue implementation using linkedlist
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class queue{
    Node rear=null;
    Node front=null;
    void enque(int data){
        Node newNode=new Node(data);
        if(rear==null){
            front=rear=newNode;
        }
        rear.next=newNode;
        rear=newNode;
    }
    void deque(){
           if(front==null){
            return;
           }
           front=front.next;
           if(front==null){
            rear=null;
           }
    }
    void display(){
        Node temp=front;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
public class queueimp {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        queue q=new queue();
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            int data=s.nextInt();
            q.enque(data);
        }
        q.deque();
        q.display();
    }
}
