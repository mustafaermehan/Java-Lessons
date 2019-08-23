/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muham
 */
public class Manager extends Employee { //SubClass
    
    private int responsible_person ;
    
    public Manager(String name, int salary, String department, int responsible_person){
        
        super(name, salary, department);
        
        this.responsible_person = responsible_person ;
        
    }
    
    public void raise(int raise_amount){
        
        System.out.println("Personnel "+ raise_amount +" £ have a raise");
    }
    
    public void showinformation(){
        
        /*System.out.println("Name :"+ getName());
        System.out.println("Salary :"+ getSalary());
        System.out.println("Department :"+ getDepartment());
        */
        
        super.showinformation();
        System.out.println("Number of responsible person :"+ this.responsible_person);
        
    }
    
    
}
