package DecoratorPrep;

public class SpicyPizza extends Decorator
{
    private Pizza pizza;
    public SpicyPizza(Pizza pizza)
    {
        super(pizza);
        pizza.setElements(pizza.getElements() + ", spicy pepper");
        pizza.setPrice(pizza.getPrice() + 4);
    }

    @Override
    public void doSomething()
    {
        super.doSomething();
    }
}
