package people;

public class Teacher extends Person {
    private int salary;
    public Teacher(String fullName, String streetName, int salary){
        super(fullName, streetName);
        this.salary = salary;
    }

    //@Override
    public String toString(){
        return this.getFullName() + "\n " + this.getStreetName() + "\n salary " + this.salary + " euros/month";
    }
}
