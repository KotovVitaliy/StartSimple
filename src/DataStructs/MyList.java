package DataStructs;

public class MyList<T> {

    private Node<T> startNode;
    private Node<T> currentNode;
    private int size = 0;

    public MyList() {
        this.startNode = new Node<>();
        this.currentNode = this.startNode;
    }

    public void add(T val) {
        currentNode.val = val;

        Node<T> nextNode = new Node<>();
        currentNode.nextNode = nextNode;
        currentNode = nextNode;

        ++this.size;
    }

    public void add(int position, T val) {

        if (position > size || position < 0) {
            throw new IllegalArgumentException("Wrong position param");
        }

        if (position == 0) {
            Node<T> newNode = new Node<>();
            newNode.val = val;
            newNode.nextNode = startNode;
            startNode = newNode;
            ++this.size;

            return;
        }

        Node<T> node = startNode;
        for (int i = 1; i < position; i++) {
            if (node.nextNode == null) {
                throw new IllegalArgumentException("Cannot iterate to position " + i);
            }

            node = node.nextNode;
        }

        Node<T> newNode = new Node<>();
        newNode.val = val;
        newNode.nextNode = node.nextNode;
        node.nextNode = newNode;

        ++this.size;
    }

    public String toString() {
        String str = "[";

        Node<T> node = startNode;
        for (int i = 0; i < size; ++i) {
            str += node.val;

            if (i != size - 1) {
                str += " | ";
            }

            if (node.nextNode != null) {
                node = node.nextNode;
            } else {
                throw new IllegalArgumentException("Cannot get next value of list. Current position: " + i);
            }
        }

        str += "]";

        return str;
    }

    public int size() {
        return this.size;
    }
}
