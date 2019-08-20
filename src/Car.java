/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muham
 */
public class Car {
    private String Color ;
    private int doors ;
    private int wheels ;
    private String engine ;
    private String model ;
    
    public void setModel(String model){
        
        this.model = model;
    }
    public String getModel(){
        
        return this.model ; 
    }

    /**
     * @return the Color
     */
    public String getColor() {
        return Color;
    }

    /**
     * @param Color the Color to set
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    /**
     * @return the doors
     */
    public int getDoors() {
        return doors;
    }

    /**
     * @param doors the doors to set
     */
    public void setDoors(int doors) {
        if(doors < 0){
            
            System.out.println("Number of doors can not be less than zero");
            
        }
        else {
            
            this.doors = doors ;
        }
    }

    /**
     * @return the wheels
     */
    public int getWheels() {
        return wheels;
    }

    /**
     * @param wheels the wheels to set
     */
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    /**
     * @return the engine
     */
    public String getEngine() {
        return engine;
    }

    /**
     * @param engine the engine to set
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }
}
