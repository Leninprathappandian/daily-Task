//Search for a given value in a linked list

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
    void sear(int k){
      if(head==null)return;
      Node temp=head;
      
        if(temp.next.data==k||temp.data==k){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
      
temp=temp.next;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
public class search{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
       linked l=new linked();
       int n=s.nextInt();
       for(int i=0;i<n;i++){
        int data=s.nextInt();
        l.insert(data);
       }
       int k=s.nextInt();
       l.sear(k);
    }
}
