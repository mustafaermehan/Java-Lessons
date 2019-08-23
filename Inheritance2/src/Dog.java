/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muham
 */
public class Dog extends Animal {
    
    private int nmumber_of_teeth ;
    
    public Dog(String name, int weight, int height, int number_of_legs, int number_of_teeth){
        
        super(name, weight, height, number_of_legs);
        
        this.nmumber_of_teeth = number_of_teeth ;
        
    }
    // Add a method
    public void run(int speed){
        
        System.out.println("Dog is running...");
        
        start_to_move(speed);
    }

    /**
     * @return the nmumber_of_teeth
     */
    public int getNmumber_of_teeth() {
        return nmumber_of_teeth;
    }

    /**
     * @param nmumber_of_teeth the nmumber_of_teeth to set
     */
    public void setNmumber_of_teeth(int nmumber_of_teeth) {
        this.nmumber_of_teeth = nmumber_of_teeth;
    }  
}
