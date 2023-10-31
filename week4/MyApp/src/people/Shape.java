package people;

public abstract class Shape {
    private String color;
    private FillType filled;
    public Shape (String color, FillType filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {return this.color;}
    public FillType getFilled() {return this.filled;}
    public void setColor(String x) {this.color = x;}
    public void setFilled(FillType x) {this.filled = x;}

    void displayInfo(){
        System.out.println("Color: " + this.color + "\n FillType: " + this.filled);
    }
    public abstract double getArea();
}
