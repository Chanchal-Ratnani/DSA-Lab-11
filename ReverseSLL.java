class ReverseSLL {
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
    public Node reverseList() {
        Node current = head;
        Node prev = null;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }


    public ReverseSLL copyList() {
        ReverseSLL copy = new ReverseSLL();
        Node current = head;
        while (current != null) {
            copy.addNode(current.data);
            current = current.next;
        }
        return copy;
    }

 

    public void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ReverseSLL list = new ReverseSLL();

        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);
        list.addNode(50);

        System.out.println("Original list:");
        list.printList(list.head);

        ReverseSLL copiedList = list.copyList();
        Node reversedHead = copiedList.reverseList();

        System.out.println("Reversed list (copy):");
        copiedList.printList(reversedHead);

        System.out.println("Original list remains unchanged:");
        list.printList(list.head);
    }
}