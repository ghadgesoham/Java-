enum Laptop{
    Mackbook(2000) , Lenovo (4000);

    private int price;

    private Laptop(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
}

public class EnumClass {
    public static void main(String[] args) {
        //Laptop lap = Laptop.Mackbook;
        //System.out.println(lap + " : " +lap.getPrice());
        
        for(Laptop lap : Laptop.values() ){
            System.out.println(lap + " : " + lap.getPrice());
        }


    }    
}
