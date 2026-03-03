//Reverse a singly linked list.
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class linked{
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
void rever(){
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
void display(){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
    System.out.println();
}
}
public class revers{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        linked l=new linked();
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            int data=s.nextInt();
            l.insert(data);
        }
        l.rever();
        l.display();
    }
}
