/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator.pattern.sample.model;

import decorator.pattern.sample.model.Beverage;

/**
 *
 * @author Administrator
 */
public abstract class Condiments extends Beverage{ // Condiments: topppings
    @Override
    public abstract String getDescription();
}
