//print the first k element of a queue without altering its structur
import java.util.*;
class Node{
    Node next;
    int data;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class dequek{
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
            rear=front=null;
        }
       front=front.next;
        if(front==null){
            rear=null;
        }
    }
    void printfir(int k){
        Node temp=front;
        int count=0;
        while(temp!=null&&count<k){
            System.out.print(temp.data+" ");
            temp=temp.next;
            count++;
        }
        temp=temp.next;
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

public class kqueue {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        dequek q=new dequek();
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            int data=s.nextInt();
            q.enque(data);
        }
        int k=s.nextInt();
        q.printfir(k);
       
    }
    
}
