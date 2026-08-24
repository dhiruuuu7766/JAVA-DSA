import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class StackDeque {
    public static void main(String[] args) {
        Deque<Integer> q = new ArrayDeque<>();
        q.push(20);
        q.push(30);
        q.push(89);
        q.push(45);
        System.out.println(q);
        System.out.println(q.peekLast());
    }
}
