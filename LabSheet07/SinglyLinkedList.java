public class SinglyLinkedList {
    private Node head;
    

    private static class Node {
        Object data;
        Node next;
        Node(Object data) { this.data = data; this.next = null; }
    }


    public boolean isempty() {
        return head == null;
    }


    public void append(int value) {
        Node newNode = new Node(value);
        if (isempty()) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }


    public Object get(int position) {
        Node current = head;
        int count = 0;
        while (current != null) {
            if (count == position) return current.data;
            count++;
            current = current.next;
        }
        return null;
    }


    public void set(int position, int value) {
        Node current = head;
        int count = 0;
        while (current != null) {
            if (count == position) {
                current.data = value;
                System.out.println("Updated data success!!");
                return;
            }
            count++;
            current = current.next;
        }
        System.out.println("Updated data fail...");
    }


    public boolean contains(int value) {
        Node current = head;
        while (current != null) {
            if ((int) current.data == value) return true;
            current = current.next;
        }
        return false;
    }

    public void addAll(SinglyLinkedList otherlist) {
        if (otherlist.isempty()) return;
        if (this.isempty()) {
            this.head = otherlist.head;
            return;
        }
        Node current = this.head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = otherlist.head;
    }
    

    public void printList() {
        Node current = head;
        System.out.print("[");
        while (current != null) {
            System.out.print(current.data + (current.next != null ? ", " : ""));
            current = current.next;
        }
        System.out.println("]");
    }
    
    public void clear() {
        head = null;
    }
}