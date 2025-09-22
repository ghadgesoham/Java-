class A extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("hi"); 
            try{   
            Thread.sleep(10);  //Asking thread to wait for 10 mili sec 
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }

        
    }
}

class B extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("hello");
              try{   
            Thread.sleep(10);  //Asking thread to wait for 10 mili sec 
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}




public class ThreadExample {
    public static void main(String[] args) {
        
        A obj = new A();
        B obj1 = new B();

        System.out.println(obj.getPriority());  //Gets priority of thread Range -- 1(min)  to 5 (max)

        obj1.setPriority(Thread.MAX_PRIORITY); //Setting max priority to obj1 

        obj.start();  //runs the first method 

        //creating gap in between 
         try{   
            Thread.sleep(5);  //Asking thread to wait for 10 mili sec 
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        obj1.start(); //runs the second method 
    }
}
