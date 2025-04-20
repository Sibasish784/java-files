package variable.global;
class EmployeeInfo9 {
    static int empId = 123;
    static int empSalary = 50000; // Changed empSal to empSalary for better readability
    static char empGrade = 'A';

    public static void main(String[] args) {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Salary: " + empSalary);
        System.out.println("Employee Grade: " + empGrade);
    }
}
