package MyLinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> integerMyLinkedList = new MyLinkedList<Integer>();
        integerMyLinkedList.add(1);
        integerMyLinkedList.add(45);
        integerMyLinkedList.add(234);
        integerMyLinkedList.clear();
        System.out.println(integerMyLinkedList.size());
    }
}

