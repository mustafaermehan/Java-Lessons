/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muham
 */
public class Training {
    
    private int burpee_number ;
    private int pushup_number ;
    private int situp_number ;
    private int squat_number ;

    public Training(int burpee_number, int pushup_number, int situp_number, int squat_number) {
        this.burpee_number = burpee_number;
        this.pushup_number = pushup_number;
        this.situp_number = situp_number;
        this.squat_number = squat_number;
        
        
    }

    public int getBurpee_number() {
        return burpee_number;
    }

    public void setBurpee_number(int burpee_number) {
        this.burpee_number = burpee_number;
    }

    public int getPushup_number() {
        return pushup_number;
    }

    public void setPushup_number(int pushup_number) {
        this.pushup_number = pushup_number;
    }

    public int getSitup_number() {
        return situp_number;
    }

    public void setSitup_number(int situp_number) {
        this.situp_number = situp_number;
    }

    public int getSquat_number() {
        return squat_number;
    }

    public void setSquat_number(int squat_number) {
        this.squat_number = squat_number;
    }
    
    public void move(String moveType, int howMany){
        
        if (moveType.equals("Burpee")) {
            
            burpeeDo(howMany);
            
        }
        else if (moveType.equals("Pushup")){
            
            pushupDo(howMany);
            
        }
        else if (moveType.equals("Situp")){
            
            situpDo(howMany);
            
        }
        else if (moveType.equals("Squat")){
            
            squatDo(howMany);
            
        }
        else {
            System.out.println("Invalid move type");
            
        } 
    }  
       public void burpeeDo(int howMany){
      
            if (burpee_number == 0) {
                
                System.out.println("No more burpee to do");
                
            }
            if (burpee_number - howMany < 0){
                
                System.out.println("You passed the target.. Congratulations");
                burpee_number = 0;
                System.out.println("Remaining burpee : "+ burpee_number);
                
            }
            else {
                
                burpee_number -= howMany;
                System.out.println("Remaining burpee : "+ burpee_number);
                
            }   
    }
      
   
     public void pushupDo(int howMany){
      
            if (pushup_number == 0) {
                
                System.out.println("No more pushup to do");
                
            }
            if (pushup_number - howMany < 0){
                
                System.out.println("You passed the target.. Congratulations");
                pushup_number = 0;
                System.out.println("Remaining pushup : "+ pushup_number);
                
            }
            else {
                
                pushup_number -= howMany;
                System.out.println("Remaining pushup : "+ pushup_number);
                
            }   
    }
      public void situpDo(int howMany){
      
            if (situp_number == 0) {
                
                System.out.println("No more situp to do");
                
            }
            if (situp_number - howMany < 0){
                
                System.out.println("You passed the target.. Congratulations");
                situp_number = 0;
                System.out.println("Remaining situp : "+ situp_number);
                
            }
            else {
                
                situp_number -= howMany;
                System.out.println("Remaining situp : "+ situp_number);
                
            }   
    }
       public void squatDo(int howMany){
      
            if (squat_number == 0) {
                
                System.out.println("No more squat to do");
                
            }
            if (squat_number - howMany < 0){
                
                System.out.println("You passed the target.. Congratulations");
                squat_number = 0;
                System.out.println("Remaining squat : "+ squat_number);
                
            }
            else {
                
                squat_number -= howMany;
                System.out.println("Remaining squat : "+ squat_number);
                
            }   
    }
       public boolean TrainingEnd(){
           
           return ( (burpee_number == 0) && (pushup_number == 0) && (situp_number == 0) && (squat_number == 0));
       } 
    
}
