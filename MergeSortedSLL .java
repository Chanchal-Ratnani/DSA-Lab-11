class MergeSortedSLL {
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
    public static Node mergeLists(Node head1, Node head2) {
        Node dummy = new Node(0);
        Node tail = dummy;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                tail.next = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }

        if (head1 != null) {
            tail.next = head1;
        }

        if (head2 != null) {
            tail.next = head2;
        }

        return dummy.next;
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
        MergeSortedSLL list1 = new MergeSortedSLL();
        MergeSortedSLL list2 = new MergeSortedSLL();

        list1.addNode(10);
        list1.addNode(20);
        list1.addNode(30);

        list2.addNode(15);
        list2.addNode(25);
        list2.addNode(35);

        System.out.println("List 1:");
        list1.printList(list1.head);

        System.out.println("List 2:");
        list2.printList(list2.head);

        Node mergedHead = mergeLists(list1.head, list2.head);

        System.out.println("Merged list:");
        list1.printList(mergedHead);
    }
}
