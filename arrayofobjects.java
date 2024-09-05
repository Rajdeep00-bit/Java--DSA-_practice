import java.util.*;
class Student{
    int roll;
    String name;
}
public class arrayofobjects {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Rajdeep";
        s1.roll=5;
        Student s2=new Student();
        s2.name="Busan";
        s2.roll=6;
        Student[]students=new Student[2];
        students[0]=s1;
        students[1]=s2;
        for(int i=0;i<students.length;i++){
            System.out.println(students[i].name+" "+students[i].roll);
        }

    }

}
