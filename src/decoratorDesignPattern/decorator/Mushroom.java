package decoratorDesignPattern.decorator;

import decoratorDesignPattern.pizza.BasePizza;

public class Mushroom extends BasePizza {
    BasePizza basePizza;
    public Mushroom(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost() + 15;
    }
}
