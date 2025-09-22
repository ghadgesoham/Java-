class Shape{
    public void area(){
        System.out.println("Area of the shape is: ");
    }
}

class Triangle extends Shape{
    public void area(int h, int b){
        System.out.println(0.5*b*h);
    }
}
class Square extends Triangle{
    public void area(int s){
        System.out.println(s*s);
    }
}
public class inheritance {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        Square s = new Square();
        t.area();
        t.area(3,4);
        s.area();
        s.area(12);
    }
}
