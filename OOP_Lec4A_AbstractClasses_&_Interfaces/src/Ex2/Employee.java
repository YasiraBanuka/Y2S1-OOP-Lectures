package Ex2;

public class Employee implements Printable {

    private int empId;
    private String empName;
    private String empAddress;

    public Employee(int empId, String empName, String empAddress) {
        this.empId = empId;
        this.empName = empName;
        this.empAddress = empAddress;
    }

    @Override
    public void print() {
        System.out.println("Emp ID : " + this.empId);
        System.out.println("Emp Name : " + this.empName);
        System.out.println("Emp Address : " + this.empAddress);
    }

}
