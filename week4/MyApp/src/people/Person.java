package people;

public class Person {
    private String fullName;
    private String streetName;
    private int age;
    private String country;
    public Person(String fullName, String streetName){
        this.fullName = fullName;
        this.streetName = streetName;
    }

    String getFullName() {return this.fullName;}
    String getStreetName() {return this.streetName;}
    int getAge() {return age;}
    String getCountry() {return country;}

    void setFullName(String x) {this.fullName = x;}
    void setStreetName(String x) {this.streetName = x;}
    void setAge(int x) {this.age = x;}
    void setCountry(String x) {this.country = x;}

    public String toString(){
        return (this.fullName + "\n " + this.streetName);
    }
}
