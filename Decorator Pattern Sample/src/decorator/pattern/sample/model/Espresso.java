
package decorator.pattern.sample.model;

import java.util.Objects;

/**
 *
 * @author Administrator
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        Double cost = null;
        if (Objects.equals(super.size, Beverage.TALL)) {
            cost = 1.99;
        }if (Objects.equals(super.size, Beverage.GRANDE)) {
            cost = 2.99;
        }if (Objects.equals(super.size, Beverage.VENTI)) {
            cost = 3.99;
        }
        return cost;
    }


}
