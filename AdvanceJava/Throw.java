public class Throw {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            if (j == 0)
            throw new ArithmeticException("Cannot divide by zero");
        } catch (Exception e) {
            
            System.out.println("hey");
        }


        System.out.println(i);
        System.out.println("hello");


    }
}
