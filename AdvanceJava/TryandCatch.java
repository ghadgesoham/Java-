//Exception handling 
//Runtime errors are called exceptions



public class TryandCatch {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        int a[] = new int[4];



        try {
            int k = 18/j;
            System.out.println(a[1]);
            System.out.println(a[5]);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero " + e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array indes is out of bound " + e);
        }

        System.out.println(a[1]);
        System.out.println(i);
    }    
}
