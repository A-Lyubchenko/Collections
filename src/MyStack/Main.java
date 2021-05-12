package MyStack;

public class Main {
    public static void main(String[] args) {
        MyStack<String> stringMyStack = new MyStack<String>();
        stringMyStack.push("Hi");
        stringMyStack.push("how");
        stringMyStack.push("are");
        stringMyStack.push("you?");

        System.out.println(stringMyStack.pop());

        System.out.println(stringMyStack.size());
        System.out.println(stringMyStack);
    }
}

