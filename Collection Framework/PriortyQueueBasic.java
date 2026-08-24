import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriortyQueueBasic {
    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>();
        q.add(30);
        q.add(34);
        q.add(45);
        q.add(55);

        System.out.println(q);
        //jiski integer ki value sbse kam uski priority sbse jyada
        System.out.println(q.poll());
        System.out.println(q);

    }
}
