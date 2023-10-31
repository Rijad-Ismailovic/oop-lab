package people;

public class Rectangle extends Shape{
    private double width;
    private double height;
    public Rectangle(String color, FillType filed, double width, double height){
        super(color, filed);
        this.width = width;
        this.height = height;
    }

    @Override
    public void displayInfo(){
        System.out.print("Color: " + this.getColor() + "\n FillType: " + this.getFilled() + "\n Width: " + this.width + "\n Width: " + this.height);
    }

    public double getArea(){
        return (2 * this.width + 2 * this.height);
    }
}
