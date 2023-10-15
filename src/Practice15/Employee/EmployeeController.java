package Practice15.Employee;

public class EmployeeController {
    private Employee model;
    private EmployeeView view;
    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }
    public String getEmployeeName() {
        return model.getName();
    }
    public String getEmployeeSalary() {
        return model.getSalary();
    }
    public void setEmployeeName(String name) {
        model.setName(name);
    }
    public void setEmployeeSalary(String rollNo) {
        model.setSalary(rollNo);
    }
    public void updateView() {
        view.printCourseDetails(model.getName(), model.getSalary());
    }
}
