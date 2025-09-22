interface Animal{
	void sound(){
		System.out.println("Barks");
	}
}


class Singleton{
	private static Singleton instance;
	
	private Singleton(){} //Private constructor
	
	public static Singleton getInstance(){
		if(instance == null){
			instance = new Singleton();
		}
		return instance;
	}

}

class Car{
	void drive(){
		System.out.println("Car is driving");
	}
}

public class Objects{
	public static void main(String[] args){
		Car myCar = new Car();   //Object creation 
		myCar.drive();		//Calling methods of the class using object 
		
		Singleton obj1 = new Singleton.getInstance();
		Singleton obj2 = new Singleton.getInstance();

		System.out.println(obj1 == obj2);
		
		Animal dog = new Animal();
		dog.sound();		
	}

}