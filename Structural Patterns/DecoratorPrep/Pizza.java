package DecoratorPrep;

public class Pizza implements Component
{
    private String elements;
    private double price;

    public Pizza(String elements, double price)
    {
        this.elements = elements;
        this.price = price;
    }

    @Override
    public void doSomething()
    {
        System.out.println("Pizza elements: " + elements);
        System.out.println("Pizza price: " + price);
    }

    public void setElements(String elements)
    {
        this.elements = elements;
    }

    public String getElements()
    {
        return this.elements;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public double getPrice()
    {
        return this.price;
    }
}
