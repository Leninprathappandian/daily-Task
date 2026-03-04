import java.util.*;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class linked{
    Node head = null;

    void insert(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    Node reverse(Node head){
        Node prev = null;
        Node curr = head;

        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    boolean isPalindrome(){
        if(head == null || head.next == null)
            return true;

        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node secondHalf = reverse(slow);

        Node firstHalf = head;

        while(secondHalf != null){
            if(firstHalf.data != secondHalf.data)
                return false;

            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class palin{
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        linked l = new linked();

        int n = s.nextInt();

        for(int i = 0; i < n; i++){
            l.insert(s.nextInt());
        }

        if(l.isPalindrome())
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}