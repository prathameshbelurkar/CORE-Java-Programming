import java.lang.*;

//_________________________________ CLASS SUBJECT ___________________________________
class Subject {

    //    Properties
    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtain;

    //    Enquiry method
    boolean isQualified(int m) {
        return marksObtain >= maxMarks / 10 * 4;
    }

    //    Getters And Setters
    public String getSubID() {
        return subID;
    }

    public String getName() {
        return name;
    }

    public int getMaxMarks() {
        return maxMarks;
    }

    public int getMarksObtain() {
        return marksObtain;
    }

    public void setMaxMarks(int m) {
        maxMarks = m;
    }

    public void setMarksObtain(int m) {
        marksObtain = m;
    }

    //    Constructors
    public Subject(String id, String n) {
        subID = id;
        name = n;
    }

    public Subject(String id, String n, int maxmrk) {
        subID = id;
        name = n;
        maxMarks = maxmrk;
        marksObtain = 0;
    }

    public Subject(String id, String n, int maxmrk, int mrkobt) {
        subID = id;
        name = n;
        maxMarks = maxmrk;
        marksObtain = mrkobt;
    }

    // Display
    public String toString() {
        return "\nSubject ID: " + subID + "\nName: " + name + "\nMarks Obtained: " + marksObtain;
    }
}

//_________________________________ CLASS STUDENT_ ___________________________________
class Student_ {

    //    Properties
    private int rollNo;
    private String name;
    private String dept;
    private Subject[] subjects;

//    Getters And Setters

    public int getRollNo() {
        return rollNo;
    }

    public String getDept() {
        return dept;
    }

    public String getName() {
        return name;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }

    //    Constructors
//            ___


}


public class student_subject {
    public static void main(String[] args) {

        Subject subs[] = new Subject[3];

        subs[0] = new Subject("s101", "DS", 100);
        subs[1] = new Subject("s102", "Algorithms", 100);
        subs[2] = new Subject("s103", "Operating System", 100);

        //Display Subs
        for (Subject s : subs)
            System.out.println(s);


    }
}