import java.lang.*;
import java.util.Scanner;
import java.io.*;


public class Demo15 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");
        RandomAccessFile rf = new RandomAccessFile("C:/Users/SANJAY/Downloads/Demo13/Test.txt", "rw");

        // File Contents: Learn Java Programming
        System.out.println((char) rf.read());
        System.out.println((char) rf.read());
        System.out.println((char) rf.read());
        rf.write('R');
        System.out.println((char) rf.read());
        rf.skipBytes(3);
        System.out.println((char) rf.read());
        rf.seek(3);
        System.out.println((char) rf.read());
        System.out.println(rf.getFilePointer());
        rf.seek(rf.getFilePointer()+2);
        System.out.println((char) rf.read());

    }
}