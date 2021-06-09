import java.io.*;
import java.lang.*;
import java.util.Scanner;

class Customer implements Serializable {
    static int i = 1;
    String custID;
    String name;
    String phno;

    Customer() {
    }

    Customer(String n, String p) {
        name = n;
        phno = p;
        custID = "Cust" + i;
        i++;
    }

    @Override
    public String toString() {
        return "Customer ID: " + custID +
                "Name: " + name +
                "Phone Number: " + phno + "\n";
    }

}

public class Demo1 {

    // WRITING TO THE TEST.TXT
    /*
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

        Customer list[] = {new Customer("Smith", "+2145782"), new Customer("John", "+2175782"), new Customer("Ron", "+2635782")};
        FileOutputStream fos = new FileOutputStream("C:/Users/SANJAY/Downloads/Challenge4/Test.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeInt(list.length);
        for (Customer c:list) {
            oos.writeObject(c);
        }

        oos.close();
        fos.close();

    }
    */

    // READING FROM THE TEXT.TXT
    /*
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

        FileInputStream fis = new FileInputStream("C:/Users/SANJAY/Downloads/Challenge4/Test.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        int length = ois.readInt();
        Customer c;

        for (int i=0;i<length;i++) {
            c = (Customer) ois.readObject();
            System.out.println(c);
        }

        ois.close();
        fis.close();

    }
    */
     
}