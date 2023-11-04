public class Main {
    public static void main(String[] args) throws Exception {
        //1 ZADATAK
        Book book1 = new Book("Fedor Dostojevski", "Crime and Punishment", 2);
        CD cd1 = new CD("Pink Floyd", "Dark side of the Moon", 1973);

        System.out.println(book1);
        System.out.println(cd1);

        //2 ZADATAK
        Box box = new Box(5);
        box.add(book1);
        box.add(cd1);
        System.out.println(box);

        MaxWeightBox coffeeBox = new MaxWeightBox(10);
        coffeeBox.add(new Thing("Saludo", 5));
        coffeeBox.add(new Thing("Pirkka", 5));

        System.out.println(coffeeBox.isInTheBox(new Thing("Saludo", 5)));
        System.out.println(coffeeBox.isInTheBox(new Thing("nijeInTheBox", 5)));

        OneThingBox oneThingBox = new OneThingBox();
        oneThingBox.add(new Thing("Saludo", 5));
        oneThingBox.add(new Thing("Pirkka", 5));
        System.out.println(oneThingBox.isInTheBox(new Thing("Saludo", 5)));
        System.out.println(oneThingBox.isInTheBox(new Thing("Pirkka", 5)));
    }
}
