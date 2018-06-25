
package Q2;

public class SinglyLinkedList {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.Display();
        list.head.next.next.next.next.next= list.head.next;
        
        if(list.detectLoop(list.head))
            System.out.println("Found loop");
        else
            System.out.println("Not Found Loop");
    }
    
}
