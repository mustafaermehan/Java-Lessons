/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muham
 */
public class Employee {  // superclass or baseclass
    
    private String name;
    
    private int salary;
    
    private String department;
    
    public Employee(String name, int salary, String department){
        
        this.name = name ;
        this.salary = salary ;
        this.department = department ;
    }
    public void work(){
        
        System.out.println("Employee is working... ");
        
    }
    public void showinformation(){
        
        System.out.println("Name : "+ name);
        System.out.println("Salary : "+ salary);
        System.out.println("Department : "+ department);
    }
    public void change_department(String new_department){
        
        System.out.println("Department is changing...");
        this.department = new_department;
        System.out.println("New department : "+ this.department);
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
     * @return the salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }
    
}
