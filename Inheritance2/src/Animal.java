/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muham
 */
public class Animal {
    
    private String name ;
    private int weight ;
    private int height ;
    private int number_of_legs ;
    
    public Animal(String name, int weight, int height, int number_of_legs){
        // constuructor
        this.name = name ;
        this.weight = weight ;
        this.height = height ;
        this.number_of_legs = number_of_legs ;
    }
    public void eat(){
        
        System.out.println("Animal is eating right now...");
    }
    public void start_to_move(int speed){
        
        System.out.println("Animal is moving at a speed of "+ speed + "km/h");
        
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
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return the number_of_legs
     */
    public int getNumber_of_legs() {
        return number_of_legs;
    }

    /**
     * @param number_of_legs the number_of_legs to set
     */
    public void setNumber_of_legs(int number_of_legs) {
        this.number_of_legs = number_of_legs;
    }
}
