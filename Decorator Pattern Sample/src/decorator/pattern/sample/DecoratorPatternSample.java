
package decorator.pattern.sample;

import decorator.pattern.sample.model.HouseBlend;
import decorator.pattern.sample.model.Beverage;
import decorator.pattern.sample.model.Espresso;
import decorator.pattern.sample.model.Mocha;

/**
 *
 * @author Administrator
 */
public class DecoratorPatternSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("===== Buy an espresso =====");
        Beverage espresso = new Espresso();
        espresso.setSize(Beverage.VENTI);
        espresso = new Mocha(espresso);
        System.out.println(espresso.getDescription()+" $"+espresso.cost());
        
        System.out.println("===== Buy a HouseBlend =====");
        Beverage houseBlend = new HouseBlend();
        houseBlend.setSize(Beverage.VENTI);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Mocha(houseBlend); // add mocha second
        System.out.println(houseBlend.getDescription()+" $"+houseBlend.cost());
        
        // stratergy tách hành vi ra riêng, decorator bọc lần lượt các lớp 
        // vào với nhau (cộng lần lượt lại với nhau)
    }
    
}
