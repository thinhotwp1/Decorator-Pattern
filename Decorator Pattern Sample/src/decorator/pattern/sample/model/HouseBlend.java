
package decorator.pattern.sample.model;

import java.util.Objects;


/**
 *
 * @author Administrator
 */
public class HouseBlend extends Beverage{

    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        Double cost = null;
        if (Objects.equals(super.size, Beverage.TALL)) {
            cost = 1.00;
        }if (Objects.equals(super.size, Beverage.GRANDE)) {
            cost = 2.00;
        }if (Objects.equals(super.size, Beverage.VENTI)) {
            cost = 3.00;
        }
        return cost;
    }
    
    
}
