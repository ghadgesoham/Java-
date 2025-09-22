class Student{
    String name;
    int age;

    Student(String name, int age){     //Constructer created type Parametrised contructor 
        this.name = name;
        this.age = age;
    }

    public void show(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
public class constructor {
    public static void main(String[] args) {
    Student s1 = new Student("Soham", 19);
    s1.show();
    Student s2 = new Student("Sravan" , 18);
    s2.show();
    Student s3 = new Student("sai", 19)
    s3.show();
    
    }

}
