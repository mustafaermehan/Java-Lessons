
public class Programmer extends Worker{
    
    private String languages ;
    
    public Programmer(String name, String surname, int id, String languages) {
        
        super(name, surname, id);
        this.languages = languages ;    
    }
    public void format(String operating_system){
        
        System.out.println(getName() +""+ operating_system + "loading...");
        
    }

    @Override
    public void showinformation() {
        super.showinformation(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Languages known to the developer : "+ languages);
        
    }
   
}
