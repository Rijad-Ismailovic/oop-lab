package task2;

import java.util.ArrayList;

public class GradeAnalyzer {
    private ArrayList<Integer> gradeList = new ArrayList<Integer>();

    public GradeAnalyzer(ArrayList<Integer> gradeList){
        this.gradeList = gradeList;
    }

    public double calculateAverage(){
        double sum = 0;
        for(Integer grade : this.gradeList){
            sum += grade;
        }
        return sum / this.gradeList.size();
    }

    public void printSummary(){
        System.out.println("Grades: " + this.gradeList + "\nAverage: " + this.calculateAverage());
    }
}
