package task3;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class EmployeeManagementSystem {
    public ArrayList<Employee> filterEmployeeBySalary (ArrayList<Employee> employeeList, int minimumSalary){
        return employeeList.stream()
            .filter(employee -> employee.salary() >= minimumSalary)
            .collect(Collectors.toCollection(ArrayList::new));
    } 

    public int calculateTotalSalary(ArrayList<Employee> employeeList){
        int sum = 0;
        for(Employee employee : employeeList){
            sum += employee.salary();
        }
        return sum;
    }

    public void displayEmployeeDetails(ArrayList<Employee> employeeList){
        for(Employee employee : employeeList){
            System.out.println(employee.id() + " " + employee.name() + " " + employee.salary());
        }
    }
}
