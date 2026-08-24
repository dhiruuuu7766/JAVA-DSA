import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableInterface {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(19, "Ajay", 65));
        students.add(new Student(20, "Maxx", 45));
        students.add(new Student(21, "Ranjan", 67));
        students.add(new Student(22, "Dhiru", 87));

        System.out.println(students);
        Collections.sort(students);
        System.out.println(students);






//        List<Integer> list = new ArrayList<>();
//        //ArrayList maintain the insetion order ..
//        //first element insert is first will be print
//        list.add(20);
//        list.add(12);
//        list.add(23);
//        list.add(11);
//
//        System.out.println("Elements before sorting the elements " + list);
//        Collections.sort(list);
//        System.out.println("Elements after sorting the elements " + list);
    }
}
