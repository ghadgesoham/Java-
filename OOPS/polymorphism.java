class Student{
    String name;
    int age;

    Student(String name,int age){    //this is a constructor 
        this.name = name;
        this.age = age;
    }

    public void printInfo(String name){
        System.out.println(this.name);
    }

    public void printInfo(int age){
        System.out.println(this.age);
    }

    public void printInfo(String name, int age){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println("Hello soham");
    }
}
public class polymorphism {
    public static void main(String[] args) {
        Student s1 = new Student("Soham", 19);
        s1.printInfo(19);
        s1.printInfo("Soham",19);
        s1.printInfo("soham");
    }
}
