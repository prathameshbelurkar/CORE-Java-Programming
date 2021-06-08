import java.lang.*;
import java.util.Scanner;
import java.io.*;


public class Demo16 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

        File f = new File("C:/Users/SANJAY/Downloads/Demo15");

        // GIVES WHETHER THE PATH GIVEN IS DIR OR NOT
        // System.out.println(f.isDirectory());

        // GETTING THE NAMES OF FILES IN GIVEN DIR
        // String list[] = f.list();
        // for (String str:list) {
        //     System.out.println(str);
        // }

        // GETTING THE NAMES & PATHS OF FILES IN GIVEN DIR
        // File list[] = f.listFiles();
        // for (File x:list) {
        //     System.out.print(x.getName()+"      ");
        //     System.out.print(x.getPath()+"      ");
        //     System.out.print(x.getParent()+"      ");
        // }

    }
}
