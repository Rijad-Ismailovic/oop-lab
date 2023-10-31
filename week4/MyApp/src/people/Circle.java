package people;

public class Circle extends Shape {
    private double radius;
    public Circle(String color, FillType filled, double radius){
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public void displayInfo(){
        System.out.print("Color: " + this.getColor() + "\n FillType: " + this.getFilled() + "\n Radius: " + this.radius);
    }

    public double getArea(){
        return (this.radius * this.radius * 3.14);
    }

    public double getCircumference(double r){
        return 2 * 3.14 * r;
    }
}
