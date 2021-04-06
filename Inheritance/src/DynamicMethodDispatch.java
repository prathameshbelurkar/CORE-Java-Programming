import java.lang.*;

class Super1 {

    public void Meth1() {
        System.out.println("Super1 Meth1");
    }

    public void Meth2() {
        System.out.println("Super1 Meth2");
    }
}

class Sub1 extends Super1{

    @Override
    public void Meth2() {
        System.out.println("Sub Meth2");
    }

    public void Meth3() {
        System.out.println("Sub Meth3");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
//        Super1 su = new Super1();
//        su.Meth1();
//        su.Meth2();

//        Sub1 s = new Sub1();
//        s.Meth1();
//        s.Meth2();
//        s.Meth3();

        // DYNAMIC METHOD DISPATCH
        Super1 sup = new Sub1();
        sup.Meth1();
        sup.Meth2();


    }
}