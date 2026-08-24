import java.util.HashSet;
import java.util.Set;

public class HashSetBasics {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(); // does not maintain order it uses hashcode ..
        Set<Integer> set2 = new HashSet<>();
        set1.add(20);
        set1.add(21);
        set1.add(22);
        set1.add(22);
        System.out.println("Elements in set1 are : " + set1);

        set2.add(34);
        set2.add(321);
        set2.add(20);
        set2.add(44);
        System.out.println("Elements is set2 are : " + set2);

        set1.retainAll(set2);  // intersion of set1 and set2 return same elements
        System.out.println(set1);
    }
}
