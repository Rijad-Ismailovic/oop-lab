package people;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        System.out.println("--- 1. ZADATAK a) ---");
        Person pekka = new Person("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa");
        Person esko = new Person("Esko Ukkonen", "Mannerheimtie Street 15 00100 Helsinki");

        System.out.println(pekka);
        System.out.println(esko);

        System.out.println("--- 1. ZADATAK b) ---");
        Student olli = new Student("Olli", "Ida Alberginite Street 1 00400 Helsinki");
        System.out.println(olli);
        System.out.println("Credits: " + olli.credits());
        olli.study();
        System.out.println("Credits: " + olli.credits());

        System.out.println("--- 1. ZADATAK c) ---");
        Teacher idris = new Teacher("Idris Hasanovic", "Trg heroja 13", 1200);
        Teacher mirza = new Teacher("Mirza Cesir", "Hrasno brdo 32", 1900);
        System.out.println(idris);
        System.out.println(mirza);
        for(int i = 0; i < 25; i++){
            olli.study();
        }
        System.out.println(olli.credits());

        System.out.println("--- 1. ZADATAK d) ---");
        ArrayList<Person> people = new ArrayList<Person>();
        people.add(new Person("Armin Buza", "Visoko pri dnu piramide"));
        people.add(new Person("Dino Muslic", "Bihac 1"));
        printDepartment(people);

        System.out.println("--- 2. ZADATAK ---");
        Circle circle = new Circle("BLACK", FillType.FILLED, 3.5);
        Rectangle rectangle = new Rectangle("RED", FillType.NOT_FILLED, 2.0, 4.0);
        circle.displayInfo();
        System.out.println(circle.getArea());
        rectangle.displayInfo();
        System.out.println(rectangle.getArea());
    }

    public static void printDepartment(ArrayList<Person> people){
        for(int i = 0; i < people.size(); i++){
            System.out.println(people.get(i));
        }
    }

    public static double calculateCircumference(double PI, double r){
        return 2 * PI * r;
    }
}
