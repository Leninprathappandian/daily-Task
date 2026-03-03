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
    void node(int k){
        if(head==null||head.next==null)return;
        Node slow=head;
        Node fast=head;
        for(int i=0;i<k;i++){
           fast=fast.next;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow=slow.next;
        System.out.print(slow.data);
    }
}
public class nNode {
    public static void main(String[]args){
     Scanner s=new Scanner(System.in);
     linked l=new linked();
     int n=s.nextInt();
     for(int i=0;i<n;i++){
        int data=s.nextInt();
        l.insert(data);
     }
     int k=s.nextInt();
     l.node(k);
    }
    
}
