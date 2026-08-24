public class Student implements Comparable<Student> {
    public int rollNo;

    public String name;

    public int weight;

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public Student(int rollNo, String name, int weight) {
        this.rollNo = rollNo;
        this.name = name;
        this.weight = weight;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Student that) {
        //this method is called for current object
        //we define here our code section

        return this.rollNo - that.rollNo;
    }
}
