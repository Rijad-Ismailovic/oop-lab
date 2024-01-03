package builder;

import java.util.List;

public interface CoffeeBuilder<T> {
    public T buildType();
    public T buildSize();
    public T buildToppings(List<String> toppings);
}
