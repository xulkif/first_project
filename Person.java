
public class Person implements Nameable  {
    int id;


    String name;

    int age;

    boolean parent_permission;


    public Person(String name, int age, boolean parent_permission) {
        this.id = (int) (Math.random() * 1000000);
        this.name = name;
        this.age = age;
        this.parent_permission = parent_permission;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isParentPermission() {
        return parent_permission;
    }

    public void setParentPermission(boolean parent_permission) {
        this.parent_permission = parent_permission;
    }

    public String correct_name() {
        return name;
    }
}

