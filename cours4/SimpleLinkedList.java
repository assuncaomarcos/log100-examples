public class SimpleLinkedList {
    Node head;

    class Node {
        Object data;
        Node next = null;

        Node(Object obj) {
            data = obj;
        }
    }

    public void add(Object obj) {
        Node newNode = new Node(obj);

        if (this.head == null) {
            this.head = newNode;
        } else {
            Node last = this.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node current = this.head;

        while (current != null) {
            builder.append(current.data + " ");
            current = current.next;
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        SimpleLinkedList list = new SimpleLinkedList();
        list.add("A"); list.add("B"); list.add("C");
        System.out.println(list);
    }
}