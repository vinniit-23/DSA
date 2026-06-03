
import java.util.*;
 class Student implements Comparable<Student> {
    public int age;
    public String name;
    public int weight;

    public Student(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    public String toString() {
        return "Student{" + "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight + '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return this.weight;
    }

    @Override
    public int compareTo(Student that) {

        // this methods is called for current object (which is this).
        // we will define our sorting logic here
        // sort basis on age

        if (this.age == that.age) {
            return this.name.compareTo(that.name);
        }
        return this.age - that.age;
    }
}

// Main.java
class WeightComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.weight - o2.weight;
    }
}

public class Practise1 {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(19, "Vipul", 68));
        students.add(new Student(23, "Love", 87));
        students.add(new Student(21, "Ankit", 55));
        students.add(new Student(7, "Billu", 13));

        System.out.println(students);

        Collections.sort(students);

        System.out.println("Sorting basis of weight with comparatable interface"+students);
        Collections.sort(students, new WeightComparator());
        System.out.println("Sorting basis of weight with comparator interface"+students);
        Collections.sort(students, (a,b)->a.age-b.age);
        System.out.println("Sorting basis of age with comparator interface"+students);
        Collections.sort(students, (a,b)->a.name.compareTo(b.name));
        System.out.println("Sorting basis of name with comparator interface"+students);



        // List<Integer> list = new ArrayList<>();
        // list.add(15);
        // list.add(8);
        // list.add(2);
        // list.add(90);
        // System.out.println(list);

        // Collections.sort(list);
        // System.out.println(list);

    }
}