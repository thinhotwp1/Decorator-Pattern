/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator.pattern.sample.model;

/**
 *
 * @author Administrator
 */
public abstract class Beverage {
    String description = "Unknow Beverage";
    Integer size;
    
    public static Integer TALL = 1;
    public static Integer GRANDE = 2;
    public static Integer VENTI = 3;
    
    public String getDescription(){
        return description;
    }
    
    public void setSize(int size){
        this.size = size;
    }

    public Integer getSize() {
        return size;
    }
    
    public abstract double cost();
}
