package decoratorDesignPattern.pizza;

public class VegDelight extends BasePizza{
    @Override
    public int cost() {
        return 120;
    }
}
