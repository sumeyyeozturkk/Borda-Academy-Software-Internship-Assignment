package Q2;
import java.util.HashSet;

public class LinkedList {
    
    public Node head;

    public LinkedList() {
        this.head = null;
    }
    
    //Checks whether the list is empty.
    public boolean isEmpty() {
        return head == null;
    }
    
    public void add(int data) {
        
        Node link = new Node(data); //New node
        if(head == null){
            link.next = head;
            head=link;
        }
        else
        {
            Node iterator = head;
            Node pre = null;

            while(iterator != null)
            {
                pre = iterator;
                iterator = iterator.next;
            }
            iterator = link;
            pre.next = link;
        }
    }
    
    public boolean detectLoop(Node h)
    {
        HashSet<Node> s = new HashSet<Node>();
        while (h != null)
        {
            if (s.contains(h))
                return true;
            s.add(h);   
            h = h.next;
        }  
        return false;
    }
    
    public void Display() {
        Node iterator = head;
        System.out.print("List: ");
        
        while(iterator != null) 
        {
            System.out.print("{" + iterator.data + "}-> ");
            iterator = iterator.next;
        }
        System.out.println("");
    }
}
