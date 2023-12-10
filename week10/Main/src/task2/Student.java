package task2;

import java.util.ArrayList;

public class Student {
    private int id;
    private String name;
    private ArrayList<Integer> gradeList = new ArrayList<>();

    public Student(int id, String name, ArrayList<Integer> gradeList){
        this.id = id;
        this.name = name;
        this.gradeList = gradeList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGradeList() {
        return gradeList;
    }

    public void setGradeList(ArrayList<Integer> gradeList) {
        this.gradeList = gradeList;
    }

    public void printInfo(){
        System.out.println("ID: " + this.id + "\nName: " + this.name);
        for(Integer grade : this.gradeList){
            System.out.print(grade + " ");
        }
    }
    
    
}
