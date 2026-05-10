public class doublyll {
    class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }
    }
    Node head;
    Node tail;
    int size = 0;
    public void insertatbeg(int val) {
        Node newnode = new Node(val);
        if (head == null) {
            head = newnode;
            tail = head;
            size++;
            return;
        }
        newnode.next = head;
        newnode.prev = null;
        head.prev = newnode;
        head = newnode;
        size++;
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " <-> ");
            temp = temp.next;
        }
        System.out.print(" END ");
        System.out.println();
    }
    public void displayrev(){
        if(head==null){
            System.out.println("List is empty");
        }
        Node temp = tail;
        System.out.print("END <-> ");
        while(temp != null){
            System.out.print(temp.val+" <-> ");
            temp = temp.prev;
        }
        System.out.print(" START ");
    }
    public void insertatlast(int val){
        if(head==null){
            insertatbeg(val);
            return;
        }
        Node newnode = new Node(val);
        tail.next = newnode;
        newnode.prev = tail;
        newnode.next = null;
        tail = newnode;
        size++;
    }
    public void insertatindex(int index,int val){
        if(index==0){
            insertatbeg(val);
            return;
        }
        if(index==size-1){
            insertatlast(val);
            return;
        }
        Node newnode = new Node(val);
        Node temp = head;
        for(int i=1;i<index-1;i++){
            temp = temp.next;
        }
        newnode.next = temp.next;
        newnode.prev = temp;
        temp.next.prev = newnode;
        temp.next = newnode;
        size++;
    }
    public void find(int val){
        int index = 0;
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            if(temp.val == val){
                System.out.println("Found at index at "+index);
            }
            index++;
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        doublyll l1 = new doublyll();
        l1.insertatbeg(5);
        l1.insertatbeg(8);
        l1.insertatbeg(3);
        l1.display();
        l1.displayrev();
    }
}