class Account{
    public String name;   //Accessible from anywhere 
    protected String email;   //Aceesible from same class same package or subclass
    private String password;

    //getters and setters to set things for private items: 
    public String getPassword(){
        setPassword(password);
        return this.password;
    }

    public void setPassword(String pass){
        this.password = pass;
    }
}
public class bank {

    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Soham Ghadge";
        account1.email = "ghadgesoham@gmail.com";
        account1.setPassword("abc");
        System.out.println(account1.getPassword());
    }
}