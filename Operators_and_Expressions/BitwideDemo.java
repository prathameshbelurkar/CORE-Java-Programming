import java.lang.*;

class BitwiseDemo {
    public static void main(String[] args) {
        int a = 9, b = 12, c;
        b = b << 4;
        c = a | b;
        System.out.println("c=" + c);

    }
}