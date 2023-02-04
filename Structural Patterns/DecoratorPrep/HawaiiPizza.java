package DecoratorPrep;

public class HawaiiPizza extends Decorator
{
    private Pizza pizza;
    public HawaiiPizza(Pizza pizza)
    {
        super(pizza);
        pizza.setElements(pizza.getElements() + ", Ananas");
        pizza.setPrice(pizza.getPrice() + 2);
    }

    @Override
    public void doSomething()
    {
        super.doSomething();
    }
}
