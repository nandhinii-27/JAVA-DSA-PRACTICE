class Node {
    int val;
    Node next;
    Node(int val) {
        this.val = val;
        this.next = null;
    }
}
class Linkedlist {
    Node head;
    Node tail;
    int size;
    void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    void addatHead(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void addatTail(int val) {
        if (head == null) {
            addatHead(val);
            return;
        }
        Node temp = new Node(val);
        tail.next = temp;
        tail = temp;
        size++;
    }
    int search(int val) {
        if (head == null) {
            return -1;
        }
        Node temp = head;
        int idx = 0;
        while (temp != null) {
            if (temp.val == val) {
                return idx;
            }
            temp = temp.next;
            idx++;
        }
        return -1;
    }
    void deleteathead() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
    }
    void deleteattail() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head == tail) {
            head = tail = null;
            size--;
            return;
        }
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
    }
    int get(int idx) {
        if (idx < 0 || idx >= size) {
            System.out.println("Invalid index");
            return -1;
        }
        Node temp = head;
        for (int i = 1; i <= idx; i++) {
            temp = temp.next;
        }
        return temp.val;
    }
    void insert(int val, int idx) {
        if (idx < 0 || idx > size) {
            System.out.println("Invalid index");
        } else if (idx == 0) {
            addatHead(val);
        } else if (idx == size) {
            addatTail(val);
        } else {
            Node temp = head;
            for (int i = 1; i <= idx - 1; i++) {
                temp = temp.next;
            }
            Node t = new Node(val);
            t.next = temp.next;
            temp.next = t;
            size++;
        }
    }
    void delete(int idx) {
        if (idx < 0 || idx >= size) {
            System.out.println("Invalid index");
            return;
        }
        if (idx == 0) {
            deleteathead();
            return;
        }
        if (idx == size - 1) {
            deleteattail();
            return;
        }
        Node temp = head;
        for (int i = 1; i <= idx - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }
}
public class linkedlistprac {
    public static void main(String[] args) {
        Linkedlist l1 = new Linkedlist();
        l1.addatHead(10);
        l1.addatHead(20);
        l1.addatTail(30);
        l1.addatHead(50);
        l1.display();
    }
}
