package decoratorDesignPattern;

import decoratorDesignPattern.decorator.ExtraCheese;
import decoratorDesignPattern.decorator.Mushroom;
import decoratorDesignPattern.pizza.BasePizza;
import decoratorDesignPattern.pizza.Margherita;
import decoratorDesignPattern.pizza.VegDelight;

public class PizzaShop {
    public static void main(String[] args) {
        BasePizza pizza1 = new Margherita();
        pizza1 = new Mushroom(pizza1);
        System.out.println("Margherita with Mushroom: " + pizza1.cost());

        BasePizza pizza2 = new VegDelight();
        pizza2 = new ExtraCheese(pizza2);
        System.out.println("Veg Delight with extra cheese: " + pizza2.cost());

        BasePizza pizza3 = new VegDelight();
        pizza3 = new ExtraCheese(pizza3);
        pizza3 = new Mushroom(pizza3);
        System.out.println("Veg Delight with extra cheese and Mushroom: " + pizza3.cost());
    }
}
