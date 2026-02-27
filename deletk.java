import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class linkedlist{
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
    void delete(int k){
        if(head==null){
            return;
        }
        if(head.data==k){
            head=head.next;
        }
        Node temp=head;
        while(temp.next!=null&&temp.next.data!=k){
            temp=temp.next;
        }
 temp.next=temp.next.next;
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
public class deletk {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        linkedlist l=new linkedlist();
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            int data=s.nextInt();
            l.insert(data);
        }
        int k=s.nextInt();
        l.delete(k);
        l.display();
    }
    
}
