//reverse the even node print the odd as original
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class Linkedlist{
    Node head=null;
    void insert(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    void even(){
        Node temp=head;
        while(temp!=null){
            if(temp.data%2==0){
               System.out.print(temp.data+" ");
            }
            temp=temp.next;
        }
    }
    void reverse(){
         Node curr=head;
        Node next=null;
        Node prev=null;
        while(curr!=null){
                  next=curr.next;
               curr.next=prev;
               prev=curr;
               curr=next;
            }
            head=prev;
    }
    void odd(){
        Node temp=head;
        while(temp!=null){
            if(temp.data%2!=0){
                System.out.print(temp.data+" ");
            }
            temp=temp.next;
        }
    }
}

public class evenodd {
    public static void main(String[]args){
           Scanner s=new Scanner(System.in);
           Linkedlist l=new Linkedlist();
           int n=s.nextInt();
           for(int i=0;i<n;i++){
            int data=s.nextInt();
            l.insert(data);
           }
           l.reverse();
           l.even();
           l.reverse();
           l.odd();
        
    }
}
