import java.lang.*;
import java.util.Scanner;

class Cuboid {
    public static void main(String[] args) {
        int length, breadth, height;
        float area, vol;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length, Breadth And Height: ");
        length = sc.nextInt();
        breadth = sc.nextInt();
        height = sc.nextInt();
        area = (float) 2* (length*breadth + height*breadth + length*height);
        vol = (float)(length * breadth * height);
        System.out.println("Area: " + area + " Volume: " + vol);
    }
}