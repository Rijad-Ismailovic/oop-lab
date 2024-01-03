package builder;

import builder.Coffee.CappuccinoBuilder;
import builder.Coffee.EspressoBuilder;
import builder.Coffee.LatteBuilder;

public class CoffeeDirector {

    public void buildEspresso(EspressoBuilder builder){
        builder.buildType()
               .buildSize();
    }

    public void buildLatte(LatteBuilder builder){
        builder.buildType()
               .buildSize();
    }

    public void buildCappuccino(CappuccinoBuilder builder){
        builder.buildType()
               .buildSize();
    }
}
