//left rotation in linkedlist
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
        newNode.next=head;
        return;
      }
      Node temp=head;
      while(temp.next!=head){
        temp=temp.next;
      }
      temp.next=newNode;
      newNode.next=head;
    }
   void leftRotate(int k) {
    if(head==null)return;
    Node temp=head;
    int len=1;
    while(temp.next!=head){
        temp=temp.next;
        len++;
    }
    k=k%len;
    for(int i=0;i<k;i++){
        head=head.next;
    }
    }

    void display(){
        Node temp=head;
        do{
            System.out.print(temp.data+" ");
            temp=temp.next;
        }while(temp!=head);
        System.out.println();
    }
}
public class leftrotation {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
       
        int t=s.nextInt();
        while(t-->0){
             Linkedlist l=new Linkedlist();
        int n=s.nextInt();
        for(int i=0;i<n;i++){
           l.insert(s.nextInt());
        }
        int k=s.nextInt();
       l.leftRotate(k);
       l.display();
    }
    }
}
 