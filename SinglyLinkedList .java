class SinglyLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public int getLength() {
        int count = 0;
        Node current = head;

        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);
        list.addNode(50);

        int length = list.getLength();
        System.out.println("The length of the linked list is: " + length);
    }
}
