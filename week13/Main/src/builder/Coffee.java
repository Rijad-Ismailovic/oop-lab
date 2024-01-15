package builder;

import java.util.List;

public class Coffee{

    private String type;
    private String size;
    private List<String> toppings;

    public Coffee(EspressoBuilder builder){ //mora biti nacin da zguram ova 3 konstruktora u jedan
        this.type = builder.type;           //pokusao sam staviti da konstruktor prima CoffeeBuilder, jer svaki builder implementira taj interface, ali nece
        this.size = builder.size;
        this.toppings = builder.toppings;
    }
    public Coffee(LatteBuilder builder){
        this.type = builder.type;
        this.size = builder.size;
        this.toppings = builder.toppings;
    }
    public Coffee(CappuccinoBuilder builder){
        this.type = builder.type;
        this.size = builder.size;
        this.toppings = builder.toppings;
    }

    public static class EspressoBuilder implements CoffeeBuilder<EspressoBuilder>{
        
        private String type;
        private String size;
        private List<String> toppings; 

        public EspressoBuilder buildType(){
            this.type = "espresso";
            return this;
        }

        public EspressoBuilder buildSize(){
            this.size = "small";
            return this;
        }

        public EspressoBuilder buildToppings(List<String> toppings){
            this.toppings = toppings;
            return this;
        }

        public Coffee build(){
            return new Coffee(this);
        }
    }

    public static class LatteBuilder implements CoffeeBuilder<LatteBuilder>{
        
        private String type;
        private String size;
        private List<String> toppings; 

        public LatteBuilder buildType(){
            this.type = "latte";
            return this;
        }

        public LatteBuilder buildSize(){
            this.size = "medium"; 
            return this;
        }

        public LatteBuilder buildToppings(List<String> toppings){
            this.toppings = toppings;
            return this;
        }

        public Coffee build(){
            return new Coffee(this);
        }
    }

    public static class CappuccinoBuilder implements CoffeeBuilder<CappuccinoBuilder>{
        
        private String type;
        private String size;
        private List<String> toppings; 

        public CappuccinoBuilder buildType(){
            this.type = "cappuccino";
            return this;
        }

        public CappuccinoBuilder buildSize(){
            this.size = "large";
            return this;
        }

        public CappuccinoBuilder buildToppings(List<String> toppings){
            this.toppings = toppings;
            return this;
        }

        public Coffee build(){
            return new Coffee(this);
        }
    }
    
}