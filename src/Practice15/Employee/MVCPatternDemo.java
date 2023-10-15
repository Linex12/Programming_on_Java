package Practice15.Employee;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Employee model = retriveCourseFromDatabase();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new
                EmployeeController(model, view);
        controller.updateView();
        controller.setEmployeeSalary("0");
        System.out.println("\nAfter updating, Course Details are as follows");
                controller.updateView();
    }
    private static Employee retriveCourseFromDatabase(){
        Employee employee = new Employee();
        employee.setName("Alex");
        employee.setSalary("1000000");
        return employee;
    }
}
