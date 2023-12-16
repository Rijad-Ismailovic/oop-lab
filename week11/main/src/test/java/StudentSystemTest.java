import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.Student;
import com.example.StudentSystem;
import com.example.exceptions.StudentNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Optional;

public class StudentSystemTest{
    private StudentSystem studentSystem;

    @BeforeEach
    void initializeStudentSystem() throws IOException{
        try{
            this.studentSystem = new StudentSystem("C:/Users/rijad/OneDrive/Desktop/Folders/Programming/school/oop/week11/main/src/main/resources/students.csv");
        } catch (IOException e){
            throw e;
        }
    }
    
    @Test
    void testifStudentisPresent(){
        if(studentSystem.getStudents().size() > 0){
            System.out.println("Students are present (list is not empty)");
            assertTrue(true);
        } else{
            fail("Students are not present (list is empty)");
        }
    }

    @Test
    void testStudentWithId100(){
        try {
        assertFalse(studentSystem.getStudentById(100).isPresent(), "Student with ID: 100 does exist");
    } catch (StudentNotFoundException e) {
        assertTrue(true);
    }
    }

    @Test
    void testStudentNull(){
        int studentID = 1;
        if(studentSystem.getStudentById(studentID) == null){
            System.out.println("Student with ID: " + studentID + " is null");
            assertTrue(true);
        }
    }

    @Test
    void testHighestGPAStudent(){
        assertNotNull(studentSystem.getHighestGPAStudent());
    }

    void testExceptionForEmptyStudentList(){
        assertThrows(IOException.class,
                () -> new StudentSystem("C:/Users/rijad/OneDrive/Desktop/Folders/Programming/school/oop/week11/main/src/main/resources/empty.csv"));
    }

    @Test 
    void testNamesArray(){
        assertTrue(studentSystem.getStudents().size() == 70);
    }

    @Test
    void testLargestName(){
        assertTrue(studentSystem.getLongestNameStudent().getName() != "Ava White");
    }

    @Test
    void testStudent(){
        assertTrue(studentSystem.getHighestGPAStudent() != studentSystem.getLongestNameStudent());
    }

    @Test
    void testSameStudent(){
        Student highestGPAStudent = studentSystem.getHighestGPAStudent();
        Optional<Student> studentById12 = studentSystem.getStudentById(12);
        assertTrue(studentById12.isPresent());
        assertSame(highestGPAStudent, studentById12.get());
    }
}