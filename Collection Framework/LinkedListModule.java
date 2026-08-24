import java.util.LinkedList;
import java.util.List;

public class LinkedListModule {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(10);
        list.addFirst(30);
        list.addLast(79);
        list.addFirst(40);
        list.addLast(101);
        System.out.println("LinkedList before remove first " + list);
        list.removeFirst();
        System.out.println("LinkedList are : " + list);
        System.out.println(list.peek());
        System.out.println(list.poll());
        System.out.println(list);
        list.offerLast(123);
        System.out.println(list);
        list.offerFirst(1234);
        System.out.println("After running offerFirst " + list);
    }
}
