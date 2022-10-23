import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        Stack<String> mystack = new Stack<>();

        mystack.add("Kamal");
        mystack.push("Amal");
        mystack.push("Nimal");
        System.out.println(mystack);

        mystack.pop();
        System.out.println(mystack);
    }
}
