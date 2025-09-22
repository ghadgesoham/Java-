//Bugs are logical problems where you want something else and you get something else 

//Annotation are used to find errors while compile time instead of run time


class A{
    public void showData(){
        System.out.println("In a show");
    }
}

class B extends A{

    @Override       //Annotation
    public void showData(){
        System.out.println("In B show");
    }
}

public class Anotation {
    public static void main(String[] args) {
        B obj = new B();
        obj.showData();x
    }
}
