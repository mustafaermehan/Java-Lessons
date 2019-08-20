
public class Account {
    
    private String AccountNo ;
    private double remainder ;
    private String name ;
    
    private String email ;
    private String PhoneNo ;
    
    public Account(){
        
        System.out.println("I created constructor");
        
    }
    public Account(String AccountNo, double remainder, String name, String email, String PhoneNo){
        
        this.AccountNo = AccountNo ;
        this.remainder = remainder ;
        this.name = name ;
        this.email = email ;
        this.PhoneNo = PhoneNo ;
        
    }
    
    
    public void lodgement (double amount){
        remainder += amount ;
        System.out.println("New remainder = "+ remainder);
        
    }
    public void withdraw (double amount){
        
        if (amount > 1500){
            
            System.out.println("Max. limit 1500.. Come tomorrow");
        }
        if (remainder - amount < 0){
            
            System.out.println("Not enough remainder. Remainder = "+ remainder);
            
        }
        else {
            remainder -= amount ;
            System.out.println("New remainder = "+ remainder);
            
        }
    }

    /**
     * @return the AccountNo
     */
    public String getAccountNo() {
        return AccountNo;
    }

    /**
     * @param AccountNo the AccountNo to set
     */
    public void setAccountNo(String AccountNo) {
        this.AccountNo = AccountNo;
    }

    /**
     * @return the remainder
     */
    public double getRemainder() {
        return remainder;
    }

    /**
     * @param remainder the remainder to set
     */
    public void setRemainder(double remainder) {
        this.remainder = remainder;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the PhoneNo
     */
    public String getPhoneNo() {
        return PhoneNo;
    }

    /**
     * @param PhoneNo the PhoneNo to set
     */
    public void setPhoneNo(String PhoneNo) {
        this.PhoneNo = PhoneNo;
    } 
}
