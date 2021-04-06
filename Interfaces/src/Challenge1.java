import java.lang.*;

interface Member
{
    public void CallBack();

}

class Store
{
    Member mem[] = new Member[100];
    int count = 0;

    void Register(Member m){
        mem[count++] = m;
    }

    void InviteSale(){
        for (int i=0; i<count; i++)
            mem[i].CallBack();
    }
}

class Customer implements Member
{
    String name;

    Customer(String n){
        name = n;
    }

    public void CallBack(){
        System.out.println("OK, I will Visit" + name);
    }
}

public class Challenge1 {
    public static void main(){

        Store s = new Store();
        Customer c1 = new Customer("John");
        Customer c2 = new Customer("Smith");

        s.Register(c1);
        s.Register(c2);

        s.InviteSale();

    }
}