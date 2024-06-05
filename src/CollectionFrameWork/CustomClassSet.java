package CollectionFrameWork;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class CustomClassSet {
    public static void main(String[] args) {
        Set<Student> students=new HashSet<>();
        students.add(new Student(1,"Milan"));
        students.add(new Student(1,"Milan"));
        students.add(new Student(2,"Milan"));
        System.out.println(students);

    }
}
class Student{
    int rollno;
    String name;

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) { //this is for unique student identification
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollno == student.rollno;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollno);//it generates unique hash code for the roll no so that set can easily take the unique student 
    }

    @Override
    public String toString() {//this is nothing but to convert that into tostring
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                '}';
    }
}
