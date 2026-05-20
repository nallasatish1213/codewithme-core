package das.basic;

public class SingleLinkedList2 {

    private Node head;
    private Node tail;

    private int size;

    public SingleLinkedList2(){
        this.size=0;
    }

    public void addFirst(int value) {
        Node valueNode=new Node(value);
        valueNode.next=head;
        head=valueNode;

        if(tail == null){
            this.tail=head;
        }

        size +=1;
    }

    public void addLast(int value){
        Node node=new Node(value);

        if(tail==null){
            addFirst(value);
            return;
        }

        tail.next=node;
        tail=node;
        size++;
    }

    public void add(int value,int index){
        if(index==0){
            addFirst(value);
            return;
        }

       /* if(index==1){
            addLast(value);
            return;
        }*/

        if (index==size){
            addLast(value);
            return;
        }

        Node temp=head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }

        Node mid=new Node(value,temp.next);
        temp.next=mid;
        size++;
    }

    public int removeFirst() {
        int val = head.data;
        head = head.next;

        if (head == null) {
            tail = null;
        }

        size--;
        return val;
    }

    public int removeLast(){
        if(size< 1){
            removeFirst();
        }

        Node secondLast=get(size-2);
        int val=tail.data;
        tail=secondLast;
        tail.next=null;

        return val;
    }

    public void displayAll(){
        Node temp=head;
        while(temp !=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }

        System.out.println("END");
    }

    public Node get(int index){

        Node node=head;

        for (int i = 0; i <index ; i++) {
            node=node.next;
        }
        return node;
    }


    public static void main(String[] args) {
        SingleLinkedList2 ll=new SingleLinkedList2();
        ll.addFirst(23);
        ll.addFirst(53);
        ll.addFirst(10);
        ll.addFirst(67);

        ll.addLast(90);

        ll.displayAll();

        ll.removeFirst();
        ll.displayAll();

        ll.removeLast();

        ll.displayAll();
    }
}
