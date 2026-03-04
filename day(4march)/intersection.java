//Find the intersection point of two linked lists.
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
    static Node find(Node h1,Node h2){
        Node curr=h1;
        while(curr!=null){
            Node run=h2;
            while(run!=null){
                if(curr==run){
                    return curr;
                }
                run=run.next;
            }
            curr=curr.next;
        }
        return null;
    }
   void display(){
     if(head==null){
        return;
     }
     Node temp=head;
     while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
     }
     System.out.println();
   }
}
public class intersection{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        linked l1 = new linked();
        linked l2 = new linked();

        // First list input
        int n1 = s.nextInt();
        for(int i = 0; i < n1; i++){
            l1.insert(s.nextInt());
        }

        // Second list input
        int n2 = s.nextInt();
        for(int i = 0; i < n2; i++){
            l2.insert(s.nextInt());
        }

        // Position to create intersection (1-based index)
        int pos = s.nextInt();

        if(pos > 0){
            Node temp1 = l1.head;
            for(int i = 1; i < pos && temp1 != null; i++){
                temp1 = temp1.next;
            }

            if(temp1 != null){
                Node temp2 = l2.head;
                while(temp2.next != null){
                    temp2 = temp2.next;
                }
                temp2.next = temp1;  // create intersection
            }
        }

        Node result = linked.find(l1.head, l2.head);

        if(result != null)
            System.out.println("Intersection at: " + result.data);
        else
            System.out.println("No Intersection");
    }
}