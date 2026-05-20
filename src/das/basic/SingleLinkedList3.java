package das.basic;

public class SingleLinkedList3 {

    Node head;
    Node tail;
    int size;

    public SingleLinkedList3(){
        this.size=0;
    }

    private void addFirst(int value) {

        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {
           this. tail = head;
        }

        size+=1;
    }

    private void addLast(int value){
        Node node=new Node(value);
        if(tail==null){
            addFirst(value);
            return;
        }

        tail.next=node;
        tail=node;
        size++;
    }

    private void add(int value, int index) {
        if (index == 0) {
            addFirst(value);
            return;
        }

        if (index == size) {
            addLast(value);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node newNode = new Node(value, temp.next);
        temp.next = newNode;
        size++;
    }

    private int removeFirst(){
        int val=head.data;

        head=head.next;

        if(head==null){
            tail=null;
        }

        size--;
        return val;

    }

    private int removeLast(){
        int val=tail.data;

        if(size<1){
            removeFirst();
        }

        Node secondLast=get(size-2);
        tail=secondLast;
        tail.next=null;

        return val;
    }

    private void displayAll(){
        Node temp=head;
        while(temp !=null){
            System.out.print(temp.data+ " ->");
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
        SingleLinkedList3 ll3=new SingleLinkedList3();
        ll3.addFirst(23);
        ll3.addFirst(43);
        ll3.addFirst(53);
        ll3.addFirst(76);
        ll3.addFirst(90);
        ll3.add(35,3);
        ll3.addLast(100);
        ll3.displayAll();

    }
}
