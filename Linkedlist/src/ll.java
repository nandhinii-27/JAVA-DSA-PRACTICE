import java.util.LinkedList;

public class ll {
    private Node head;
    private Node tail;
    private int size;

    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
        public void insertatbeg(int val) {
            Node newnode = new Node(val);
            newnode.next = head;
            head = newnode;
            if (tail == null) {
                tail = head;
            }
            size = size + 1;
        }

        public void display() {
            Node temp;
            temp = head;

            while (temp != null) {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }
            System.out.print("END");
        }

        public void insertatend(int val){
             if(tail == null) {
                 insertatbeg(val);
             }
             else {
                 Node newnode = new Node(val);
                 tail.next = newnode;
                 tail = newnode;
             }
             size++;
        }

        public void insertatpos(int val,int index){
        if(index==0){
            insertatbeg(val);
            return;
        }
        if(index==size){
            insertatend(val);
            return;
        }
             Node newnode = new Node(val);
             Node temp = head;
            for(int i=1;i<index-1;i++){
                temp = temp.next;
            }
            newnode.next = temp.next;
            temp = newnode;
            size++;
        }
        public void deleteatfirst(){
              if(head==null) {
                  System.out.println("List is empty");
                  return;
              }
              head = head.next;
              size--;
              if(head==null){
                  tail=null;
              }
        }
        public int get(int index){
        if(head == null){
            System.out.println("list is empty");
            return -1;
        }
        Node temp = head;
           for(int i = 1;i<index-1;i++){
               temp = temp.next;
           }
           return temp.next.val;
        }
        public void deleteatlast(){
              if(tail==null){
                  System.out.println("list is empty");
              }
              if(size==1){
                  deleteatfirst();
                  return;
              }
              Node temp = head;
              while(temp.next!=tail){
                  temp = temp.next;
              }
              temp.next = null;
              tail = temp;
              size--;
        }
        public void deleteatindex(int index){
           if(head==null){
            System.out.println("list is empty");
            return;
        }
           if(index==0){
            deleteatfirst();
            return;
        }
           if(index==size-1){
            deleteatlast();
            return;
        }
        Node temp = head;
        for(int i=1;i<index;i++){
            temp = temp.next;
        }
            temp.next = temp.next.next;
            size--;
        }
        public int find(int val){
        int index = 0;
          Node temp = head;
          while(temp != null){
              if(temp.val == val){
                  return index;
              }
              temp = temp.next;
              index++;
          }
          return -1;
        }

    }

