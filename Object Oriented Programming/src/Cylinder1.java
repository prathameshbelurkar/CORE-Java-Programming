import java.lang.*;

class Cylinder2{
//    Properties
    private double radius;
    private double height;

//    Getters And Setters
    public double getRadius(){
        return radius;
    }
    public double getHeight(){
        return height;
    }

    public void setRadius(double rad){
        radius = rad;
    }
    public void setHeight(double h){
        height = h;
    }
    public void setDimensions(double rad, double h){
        radius = rad;
        height = h;
    }

//    Constructors
    public Cylinder2(){
        radius = 0;
        height = 0;
    }

    public Cylinder2(double rad){
        radius = rad;
        height = 1;
    }

    public Cylinder2(double rad, double h){
        radius = rad;
        height = h;
    }


}

public class Cylinder1 {

    public static void main(String[] args){

        Cylinder2 c = new Cylinder2(5, 4);
        System.out.println("Radius: "+c.getRadius());
        System.out.println("Height: "+c.getHeight());



    }
}