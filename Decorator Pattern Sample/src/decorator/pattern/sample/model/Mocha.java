/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator.pattern.sample.model;

import java.util.Objects;

/**
 *
 * @author Administrator
 */
public class Mocha extends Condiments {

    Beverage beverage;

    public Mocha(Beverage Beverage) {
        this.beverage = Beverage;
    }

    public Integer getSize(Beverage Beverage) {
        return beverage.getSize();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + Mocha";
    }

    @Override
    public double cost() {
        double cost = beverage.cost() ;
        if (Objects.equals(beverage.size, Beverage.TALL)) {
             cost +=  .1;
        }if (Objects.equals(beverage.size, Beverage.GRANDE)) {
             cost +=  .15;
        }if (Objects.equals(beverage.size, Beverage.VENTI)) {
             cost +=  .2;
        }
        return cost;
    }


}
