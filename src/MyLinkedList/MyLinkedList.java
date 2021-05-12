package MyLinkedList;

public class MyLinkedList<E> {
    Node<E> first;
    Node<E> last;
    private int size;

    public static class Node<E> {
        E element;
        Node<E> next;
        Node<E> prev;

        public Node(E element, Node<E> next, Node<E> prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }


    public void add(E element) {
        size++;
        Node<E> node = new Node<>(element, null, null);
        if (first == null)
            first = last = node;
        else {
            last.next = node;
            node.prev = last;
        }
        last = node;
    }

    public int size() {
        return size;
    }

    public E get(int index) {
        Node<E> node = first;
        int i = 0;
        while (i != index) {
            node = node.next;
            i++;
        }
        return node.element;
    }

    public void remove(int index) {
        Node<E> node = first;
        if (index == 0) {
            first = node.next;
            size--;
            return;
        }

        int i = 0;
        while (i != index - 1) {
            node = node.next;
            i++;
        }
        node.next = node.next.next;
        last = node;
        size--;
    }

    public void clear() {
        first = last = null;
        size = 0;
    }

    @Override
    public String toString() {
        Node<E> node = first;
        StringBuilder stringBuilder = new StringBuilder();
        while (node != null) {
            stringBuilder.append(node.element).append(" ");
            node = node.next;
        }
        return stringBuilder.toString();
    }
}
