public class ClassesV2 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Employee BadBoyRajat = new Employee("Rajat", "1298hasd", 1.0);

    }
}

class Employee {
    String name;
    String empId;
    double pay;

    public Employee() {
        name = null;
        empId = null;
        pay = 0;
    }

    public Employee(String EmployeeName, String EmployeeID) {
        name = EmployeeName;
        empId = EmployeeID;
        pay = 0;
    }

    public Employee(String EmployeeName, String EmployeeID, double EmployeeSalary) {
        name = EmployeeName;
        empId = EmployeeID;
        pay = EmployeeSalary;
    }
}