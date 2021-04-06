import java.lang.*;
import java.util.Date;

class Student {
    private String RollNo;
    private static int count = 1;

    private String GenerateRollNo() {
        Date d = new Date();
        String rn = "Univ-" + (d.getYear() + 1900) + "-" + count;
        count++;
        return rn;
    }

    public Student() {
        RollNo = GenerateRollNo();
    }

    public String getRollNo() {
        return RollNo;
    }
}

class Customer {
    private String CustomerNo;
    private static int count1 = 1;

    private String GenerateCustomerNo() {
        Date d = new Date();
        String rn = "Cust" + (d.getYear() + 1900) + "-" + count1;
        count1++;
        return rn;
    }

    public Customer() {
        CustomerNo = GenerateCustomerNo();
    }
}

class Account {
    private String AccNo;
    private static int count3 = 1;

    private String GenerateAccNo() {
        Date d = new Date();
        String rn = "AccNo-Person" + (d.getYear() + 1900) + "-" + count3;
        count3++;
        return rn;
    }

    public Account() {
        AccNo = GenerateAccNo();
    }
}

public class Challenge1 {
    public static void main(String[] args) {


    }
}