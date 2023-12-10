package task2;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> gradeList = new ArrayList<>();
        gradeList.add(7);
        gradeList.add(9);
        gradeList.add(8);
        GradeAnalyzer gradeAnalyzer = new GradeAnalyzer(gradeList);

        Field[] gradeAnalyzerFields = gradeAnalyzer.getClass().getDeclaredFields();
        for(Field f : gradeAnalyzerFields){ //printing fields
            f.setAccessible(true);
            try{
                System.out.println(f.getName() + ": " + f.get(gradeAnalyzer));
            } catch (IllegalAccessException e){
                System.out.println("NE MERE");
            }
        }

        Method[] gradeAnalyzerMethods = gradeAnalyzer.getClass().getMethods();
        for(Method m : gradeAnalyzerMethods){
            if(m.getName().startsWith("calculate")){
                m.setAccessible(true);
                try{
                    System.out.println("Average:" + m.invoke(gradeAnalyzer));
                } catch(Exception e){
                    System.out.println("NE MERE");
                }
            }
        }
    }
}
