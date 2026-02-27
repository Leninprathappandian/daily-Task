//display the elements of a queue wihtout using a loop(recursion-based);
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
    Node front=null;
    Node rear=null;
    void enque(int data){
         Node newNode=new Node(data);
         if(rear==null){
            front=rear=newNode;
            return;
         }
         rear.next=newNode;
         rear=newNode;
    }
    void deque(){
        if(front==null){
            front=rear=null;
        }
        front=front.next;
        if(front==null){
            rear=null;
        }
    }
        void displayRec(Node temp){
    if(temp == null)
        return;

    System.out.print(temp.data + " ");
    displayRec(temp.next);

    }
    void display(){
        displayRec(front);
        System.out.println();
    }
}
public class recur {
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
