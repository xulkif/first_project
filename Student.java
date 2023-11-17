
public class Student extends Person {
    private Classroom classroom;

    public Student(String name, int age, boolean parent_permission) {
        super(name, age, parent_permission);
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }
}
