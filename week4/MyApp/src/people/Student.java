package people;

public class Student extends Person {
    private int credits = 0;
    private int student_id;
    private int grade = 0;
    public Student(String fullName, String streetName){
        super(fullName, streetName);
    }
    
    public void study(){
        this.credits++;
    }
    public int credits(){
        return this.credits;
    }

    public void addGrade(int x){
        if(x >= 5 && x <= 10){
            this.grade = x;
        }
    }
    
}
