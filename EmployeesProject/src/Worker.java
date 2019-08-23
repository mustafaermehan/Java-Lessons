
public class Worker {
    
    private String name ;
    private String surname ;
    private int id ;
    
    public void showinformation(){
        
        System.out.println("Employee information...");
        System.out.println("Name : "+ name);
        System.out.println("Surname : "+ surname);
        System.out.println("Id : "+ id);   
    }
    

    public Worker(String name, String surname, int id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }  
}