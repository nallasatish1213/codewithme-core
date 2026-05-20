
package das.basic;

public class SingleLInkedList {

    private Node head;

    public void add(int data) {
        Node newNode=new Node(data);
        if(head == null){ //initial node will be null
            head=newNode;
            return;
        }

        Node current = head;

        while(current.next !=null){ // finding second last node
            current = current.next;
        }

        current.next = newNode; // adding into last node

    }

    public void delete(int data){
        if(head == null)
            return;
        if(head.data == data){
            head=head.next;
            return;
        }
        Node current=head;
        while(current.next !=null && current.next.data !=data){
            current = current.next;
        }

        if(current.next != null){
            current.next=current.next.next;
        }
    }

    public boolean search(int value) {
        Node current=head;
        while (current != null){
            if(current.data == value)
                return true;
            current =current.next;
        }
        return false;
    }

    public void displayAll(){
        Node current=head;

        while(current != null){
            System.out.print(current.data+ " ->");
            current=current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SingleLInkedList single=new SingleLInkedList();
        single.add(9);// here node will be null
        single.add(5);// node !=null but node.next will be null
        single.add(8);//
        single.add(3);//
        single.add(6);

        single.displayAll();
    }

}

