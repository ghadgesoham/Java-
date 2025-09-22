class Student {     //Class created of student 
    String name;
    int age;

    public void getInfo() {
        System.out.println("Name is:" + this.name); //this. refers to current object accesseed by class of object 
        System.out.println("Age is: " + this.age);
    }
}

public class codeone {
    public static void main(String[] args) {
        Student s2 = new Student(); //Created object of student class 
        s2.age = 18;
        s2.name = "Soham" ;
        s2.getInfo();
    }
}
