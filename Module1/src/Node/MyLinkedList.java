package Node;

public class MyLinkedList<T> {
    public class Node<T> {
        Node next;
        private T data;

        public Node() {

        }

        public Node(T data){
            this.data = data;
        }

        public T getData() {
            return this.data;
        }
    }

    Node head;
    int numNodes = 0;

    public MyLinkedList() {
    }

    public MyLinkedList(T data) {
        head = new Node(data);
    }

    public Node get(int index) {
        Node temp = head;
        int i = 0;
        while (i < index) {
            temp = temp.next;
            i++;
        }
        return temp;
    }

    public Node getFirst() {
        return head;
    }

    public Node getLast() {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp;
    }

    public void add(int index, T element) {
        Node temp = this.get(index-1);
        Node holder = temp.next;
        temp.next = new Node<T>(element);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(T element) {
        Node holder = head;
        head = new Node<T>(element);
        head.next = holder;
        numNodes++;
    }

    public void addLast(T element) {
        Node temp = this.getLast();
        temp.next = new Node<T>(element);
        numNodes++;
    }

    public void remove(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            Node temp = this.get(index - 1);
            temp.next = temp.next.next;
            numNodes--;
        }
    }

    public boolean removeObject(T data) {
        Node temp = head;
        int i = 0;
        boolean deleted = false;
        while (temp != null) {
            if (temp.getData() == data) {
                this.remove(i);
                i--;
                deleted = true;
            }
            i++;
        }
        return deleted;
    }

    public int size() {
        return numNodes;
    }

    public MyLinkedList clone() {
        return this;
    }

    public boolean contains(T data) {
        Node temp = head;
        while (temp != null) {
            if (temp.getData() == data) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(T data) {
        int index = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.getData() == data) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return index;
    }

    public void clear() {
        head = new Node();
    }

    public void printList() {
        Node temp = head;
        System.out.println("My list:");
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.next;
        }
    }
}
