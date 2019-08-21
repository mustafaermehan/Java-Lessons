
public class Account {
    
    private String user_name ;
    private String password ;
    private int remainder ;

    public Account(String user_name, String password, int remainder) {
        this.user_name = user_name;
        this.password = password;
        this.remainder = remainder;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRemainder() {
        return remainder;
    }

    public void setRemainder(int remainder) {
        this.remainder = remainder;
    }
    
    public void lodgement(int amount){
        remainder += amount ;
        System.out.println("New remainder : "+ remainder);
    }
    
    public void withdraw(int amount){
        
        if ((remainder - amount) < 0){
            
            System.out.println("Not enough remainder");
        }
        else {
            remainder -= amount ;
            System.out.println("New remainder : "+ remainder);
        }
        
    }
}
