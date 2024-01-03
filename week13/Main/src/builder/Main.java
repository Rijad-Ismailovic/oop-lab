package builder;

import java.lang.reflect.Field;

import builder.Coffee.CappuccinoBuilder;
import builder.Coffee.EspressoBuilder;

public class Main {
    public static void main(String[] args){
        EspressoBuilder coffee0 = new Coffee.EspressoBuilder().buildType().buildSize();

        CoffeeDirector coffeeDirector = new CoffeeDirector();
        CappuccinoBuilder coffeeBuilder = new CappuccinoBuilder();
        coffeeDirector.buildCappuccino(coffeeBuilder);
        Coffee coffee1 = coffeeBuilder.build(); 

        Field[] fields = coffee0.getClass().getDeclaredFields();
        for(Field field : fields){
            field.setAccessible(true);
            try {
                System.out.println(field.getName() + ": " + field.get(coffee0));
            } catch(IllegalAccessException e){
                throw new RuntimeException(e);
            }
        }
    }
}
