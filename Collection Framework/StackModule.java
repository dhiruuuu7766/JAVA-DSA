import java.util.Stack;

public class StackModule {
    public static void main(String[] args) {
        Stack<Integer> list = new Stack<>();
        list.push(10);
        list.push(20);
        list.push(30);
        System.out.println(list);
        list.pop();
        System.out.println(list);
        System.out.println(list.peek());
        System.out.println(list);
        System.out.println(list.get(0));
        list.set(1, 33);
        System.out.println(list);
        System.out.println(list.search(30));
        System.out.println(list.empty());
    }
}
