import java.lang.*;
import java.util.Scanner;


class stackUnderflowException extends Exception {
    @Override
    public String toString() {
        return "Stack Underflow!. Can't be Removed.....";
    }
}

class stackOverflowException extends Exception {
    @Override
    public String toString() {
        return "Stack Overflow!. Can't be Inserted.....";
    }
}

class Stack {
    private int size;
    private int top = -1;
    private int S[];

    public Stack(int sz) {
        size = sz;
        S = new int[sz];
    }

    public void Push(int x) throws stackOverflowException {
        if (top == size - 1) {
            throw new stackOverflowException();
        }
        top++;
        S[top] = x;
    }

    public int Pop() throws stackUnderflowException {
        if (top == -1) {
            throw new stackUnderflowException();
        }
        int x = S[top];
        top--;
        return x;
    }
}

public class Demo10 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

        Stack st = new Stack(5);

        try {
            st.Push(20);
            st.Push(20);
            st.Pop();
            st.Pop();
            st.Pop();
            st.Pop();
            st.Pop();
            st.Pop();
            st.Pop();
            st.Pop();
            st.Pop();
            st.Pop();
        }
        catch (stackOverflowException e) {
            System.out.println(e);
        }
        catch (stackUnderflowException e) {
            System.out.println(e);
        }


    }
}
