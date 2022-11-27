import java.lang.*;
import java.util.*;


class Subject{
    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtain;

    public Subject(String sid, String name){
        subID = sid;
        this.name = name;
    }
    public Subject(String sid, String name, int max, int marksob){
        subID = sid;
        this.name = name;
        setmaxMarks(max);
        setmarksObtain(marksob);
    }

    public String subID(){
        return subID;
    }

    public String name(){
        return name;
    }

    public int maxMarks(){
        return maxMarks;
    }

    public int marksObtain(){
        return marksObtain;
    }

    public void setmaxMarks(int maxmark){
        maxMarks = maxmark;
    }
    public void setmarksObtain(int marksobtain){
        marksObtain = marksobtain;
    }

    public String toString(){
        return "\n Subject ID: " + subID + "\n Name: " + name + "\n Marks Obtained: " + marksObtain + "/" + maxMarks ;
    }
}


class Student{
    private int rollNo;
    private String name;
    private String dept;
    private Subject [] subjects;

    public int getrollNo(){
        retuen rollNo;
    }
    public String getName(){
        return name;
    }
    public String getDept(){
        return dept;
    }
    public Subject [] getSubjects(){
        
    }




    

}



public class constructor_3 {

    public static void main (String args[]){

        Subject subs[] = new Subject[3];
        subs[0] = new Subject("S101", "DS", 100, 89);
        subs[1] = new Subject("S102", "Algo", 100, 90);
        subs[2] = new Subject("S103", "OS", 100, 99);

        for(Subject s:subs){
            System.out.println(s);
        }

    }
    
}


