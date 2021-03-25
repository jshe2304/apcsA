package Chapter6;

public class Employee {
    int id, originalSalary, currentSalary;
    String first, last;
    
    public Employee (int id, int salary, String first, String last) {
        this.id = id;
        originalSalary = salary;
        currentSalary = salary;
        this.first = first;
        this.last = last;
    }
    
    public int getId() {
        return id;
    }
    
    public String getFirst() {
        return first;
    }
    
    public String getLast() {
        return last;
    }
    
    public int getSalary() {
        return originalSalary;
    }
    
    public int getCurrentSalary() {
        return currentSalary;
    } 
    
    public void setSalary(int newSalary) {
        currentSalary = newSalary;
    }
    
    public int getAnnualSalary() {
        return currentSalary * 12;
    }
    
    public String toString() {
        String result;
        result = "ID : " + id + "\n";
        result += "Name : " + first + " " + last + "\n";
        result += "Original Salary : $" + originalSalary + "\n";
        result += "Current Raised Salary : $" + currentSalary + "\n";
        result += "Annual Salary : $" + getAnnualSalary() + "\n";
        return result;
    }
}
/*
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