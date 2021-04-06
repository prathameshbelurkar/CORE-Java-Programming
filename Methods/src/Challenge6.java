import java.lang.*;

//____________________OVERLOADED METHOD TO VALIDATE NAME AND AGE__________________
public class Challenge6 {

    static boolean validate(String str){
        return str.matches("[a-zA-Z\\s]+");
    }

    static boolean validate(int age){
        if (3<age && age<14)
            return true;
        return false;
    }

    public static void main(String[] args){
        int age=10;
        String name = "John";
        System.out.println("Validate(age): "+validate(age));
        System.out.println("Validate(name): "+validate(name));
    }
}