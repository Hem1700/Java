import java.lang.*;
import java.util.*;


class Student{
    public int roll_no;
    public String name;
    public String course;
    public double m1,m2,m3;

    public double total(){
        return m1+m2+m3;
    }
    public double average(){
        return (m1+m2+m3)/3;
    }
    public void grade(){
        if (average() <=100 && average()>=85){
            System.out.println("Grade A");
        }
        if (average() <=70 && average()>=84){
            System.out.println("Grade B");
        }
        if (average() <=50 && average()>=69){
            System.out.println("Grade C");
        }
        if (average() <=0 && average()>=49){
            System.out.println("Grade D");
        }        
 }
}




public class oops_1 {

    public static void main (String args[]){

        Student student = new Student();
        student.m1 = 90;
        student.m2 = 80;
        student.m3 = 90;
        System.out.println("Total Marks: " + student.total());
        System.out.println("Average: " + student.average());
        student.grade();
    }
    
}
