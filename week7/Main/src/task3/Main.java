package task3;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        EmployeeManagementSystem ems = new EmployeeManagementSystem();

        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(0, "rijad", 2000));
        employeeList.add(new Employee(0, "armin", 2800));
        employeeList.add(new Employee(0, "dino", 2300));
        employeeList.add(new Employee(0, "idris", 3000));
        employeeList.add(new Employee(0, "mirza", 4100));

        System.out.println(ems.filterEmployeeBySalary(employeeList, 2500));
        System.out.println(ems.calculateTotalSalary(employeeList));
        ems.displayEmployeeDetails(employeeList);
    }
}
