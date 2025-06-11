package SOLID;
 
public class SRP_02 {
 // Single Responsibility Principle (SRP) Example
    public static class EmployeeData {
        public String getDesignation(int employeeID) {
            System.out.println("Getting designation for employee ID: " + employeeID);
            return "Software Engineer"; 
        }
    }
 
    public static class SalaryManager {
        public void updateSalary(int employeeID) {
            System.out.println("Updating salary for employee ID: " + employeeID);
        }
    }
 
    public static class EmailService {
        public void sendMailToEmployee(int employeeID, String designation) {
            System.out.println("Sending mail to employee ID: " + employeeID + " with designation: " + designation);
        }
    }
 
    public static void main(String[] args) {
        EmployeeData employeeData = new EmployeeData();
        SalaryManager salaryManager = new SalaryManager();
        EmailService emailService = new EmailService();
 
        int employeeID = 123;
        String designation = employeeData.getDesignation(employeeID);
        salaryManager.updateSalary(employeeID);
        emailService.sendMailToEmployee(employeeID, designation);
    }
}