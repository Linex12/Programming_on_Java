package Practice15.Student;

public class MVCPatternDemo1 {
    public static void main(String[] args) {
        Student model = retriveCourseFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new
                StudentController(model, view);
        controller.updateView();
        controller.setStudentRollNo("02");
        System.out.println("\nAfter updating, Course Details are as follows");
                controller.updateView();
    }
    private static Student retriveCourseFromDatabase(){
        Student student = new Student();
        student.setName("John");
        student.setRollNo("01");
        return student;
    }
}
