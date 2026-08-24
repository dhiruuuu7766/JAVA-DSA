import java.util.Set;
import java.util.TreeSet;

public class TreeHashSetBasic {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(40);
        set.add(34);
        set.add(30);
        set.add(20);
        set.add(10);

        //TreeSet is based on binary search tree(BST)
        System.out.println("Elements in tree set is always in sorted order : " + set);
    }
}
