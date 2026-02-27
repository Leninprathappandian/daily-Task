//right rotation
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
    void rotat(int k){
         if(head==null||head.next==null||k==0){
            return;
        }
        int len=1;
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
            len++;
        }
        temp.next=head;
       k=k%len;
       int step=len-k;
       Node newtail=head;
       for(int i=1;i<step;i++){
        newtail=newtail.next;
       }
       Node newHead=newtail.next;
       newtail.next=null;
       head=newHead;
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
public class rotation {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Linkedlist l=new Linkedlist();
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            int data=s.nextInt();
            l.insert(data);
        }
        int k=s.nextInt();
        l.rotat(k);
        l.display();
    }
    
}
