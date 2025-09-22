package OOPS;
//Static variable is the variable which is common for every objects. 
//Static variable is always called using class name



class Mobile{
    String brand;                                  //Instance variable - Variable created in class 
    int price;
    static String name;                             //Here static is used so that name in the whole program stays the same 

    void show(){                                   //Local variable method created in class 
        System.out.println("Brand : " + brand + "Price : " + price + " name : " + name);
    }

    public static void show1(Mobile obj){
        System.out.println(obj.brand + " : " + obj.price + " : " + Mobile.name);
    }
}


public class StaticVariable {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        
        obj1.brand = "Apple";
        obj1.price = 60000;
        Mobile.name = "SmartPhone";         //Declaring the static varibale 

        Mobile obj2 = new Mobile();

        obj2.brand = "Samsung";
        obj2.price = 30000;

        obj1.show();
        obj2.show();

        Mobile.show1(obj1);
        Mobile.show1(obj2);   //Call static method directly with the class name
    }
}