package DecoratorPrep;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<Component> components = new ArrayList<>();

        components.add(new Pizza("paradajka a take kktiny", 10));
        components.add(new Pizza("paradajka a take kktiny", 20));
        components.add(new Pizza("paradajka a take kktiny", 30));
        components.add(new Pizza("paradajka a take kktiny", 40));
        components.add(new Pizza("paradajka a take kktiny", 50));

        components.add(new SpicyPizza(new Pizza("paradajka a take kktiny", 10)));
        components.add(new SpicyPizza(new Pizza("paradajka a take kktiny", 20)));
        components.add(new SpicyPizza(new Pizza("paradajka a take kktiny", 30)));
        components.add(new SpicyPizza(new Pizza("paradajka a take kktiny", 40)));

        components.add(new HawaiiPizza(new Pizza("paradajka a take kktiny", 10)));
        components.add(new HawaiiPizza(new Pizza("paradajka a take kktiny", 20)));
        components.add(new HawaiiPizza(new Pizza("paradajka a take kktiny", 30)));
        components.add(new HawaiiPizza(new Pizza("paradajka a take kktiny", 40)));

        for (Component component : components)
        {
            component.doSomething();
        }
    }
}
