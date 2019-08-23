
public class Manager extends Worker {
    
    private int number_of_responsible ;

    public Manager(String name, String surname, int id, int number_of_responsible) {
        super(name, surname, id);
        this.number_of_responsible = number_of_responsible ;
    }

    @Override
    public void showinformation() {
        super.showinformation(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("The number of people the manager is responsible for "+ number_of_responsible);
        
    }
    public void raise(int raiseAmount){
        
        System.out.println(getName() +raiseAmount+ "raise to employees");
        
    }
}