import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //List collection interface
        ArrayList<Integer> list = new ArrayList<>();
        //add
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.remove(0);
        //System.out.println(list);

        //addAll
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(70);
        list2.add(80);

        list2.addAll(list);
        //System.out.println(list2);

        //removeAll
//        list.removeAll(list2);
//        System.out.println(list);
//        Iterator<Integer> iterator = list2.iterator();
//        while (iterator.hasNext()) {
//            System.out.println("Element " + iterator.next());
//        }

        List<Integer> list3 = new ArrayList<>();
        list3.add(11);
        list3.add(12);
        list3.add(13);
//        System.out.println(list3.get(0));

        //before set
//        System.out.println("before set " + list3);
        //after set
        list3.set(0, 17);
//        System.out.println("after set " + list3);

        //toArray
//        Object[] arr= list3.toArray();
//        for (Object obj: arr) {
//            System.out.println(obj);
//        }

        list.add(9);
        System.out.println("Printing entire list : "  + list);

        //sorting
        Collections.sort(list);
        System.out.println("Printing after sorting : " + list);

        System.out.println(list.indexOf(30));

    }
}
