//Interface is a contract that a class must follow.
interface A{
    void show();
    void config();
}
class B implements A{
    public void show(){
        System.out.println("In show");
    }
    public void config(){
        System.out.println("In config");
    }
}
public class Interface {
    public static void main(String[] args) {
        B b = new B();
        b.show();
        b.config();
    }
}
