public class Teacher extends Person {

    private String specialization;


    public Teacher(String name, int age, boolean parent_permission, String specialization) {

        super(name, age, parent_permission);

        this.specialization = specialization;

    }


    public String getSpecialization() {

        return specialization;


    }
}