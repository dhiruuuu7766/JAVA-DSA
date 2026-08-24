import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueModule {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(40);
        q.offer(23);
        q.offer(24);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q);
    }
}
