package MyQueue;

public class Main {
    public static void main(String[] args) {
        MyQueue<String> stringMyQueue = new MyQueue<String>();
        stringMyQueue.add("Hi");
        stringMyQueue.add("how");
        stringMyQueue.add("are");
        stringMyQueue.add("you?");


        System.out.print(stringMyQueue.poll());
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println(stringMyQueue);

    }
}

