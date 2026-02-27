//right rotation for multiple test case 
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
    void rotation(int k){
        if(head==null||k==0)return;
        Node temp=head;
        int len=1;
        while (temp.next!=head) { 
            temp=temp.next;
            len++;
        }
        k=k%len;
        if(k==0)return;
        int steps=len-k;
        Node tail=head;
        for(int i=1;i<steps;i++){
            tail=tail.next;
        }
         head=tail.next;    
        tail.next=null;
    
        
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
public class rightrotation {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            Linkedlist l=new Linkedlist();
            int n=s.nextInt();
            for(int i=0;i<n;i++){
                l.insert(s.nextInt());
            }
           int k=s.nextInt();
           l.rotation(k);
            l.display();
        }

    }
}
