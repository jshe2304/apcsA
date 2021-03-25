package Chapter6;

public class EmployeeDriver {
    public static void main(String[] args) {
        int id = 12345, originalSalary = 1000;
        String first = "John", last = "Doe";
        Employee John = new Employee(id, originalSalary, first, last);
        System.out.println(John);
        John.setSalary(2000);
        System.out.println(John);
    }
}

/*
ID : 12345
Name : John Doe
Original Salary : $1000
Current Raised Salary : $1000
Annual Salary : $12000

ID : 12345
Name : John Doe
Original Salary : $1000
Current Raised Salary : $2000
Annual Salary : $24000
*/