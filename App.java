import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public   class App {
    private static List<Book> books = new ArrayList<>();
    private static List<Person> people = new ArrayList<>();
    private static List<Rental> rentals = new ArrayList<>();

    public static void listAllBooks() {
        System.out.println("List of books:");
        for (Book book : books) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }
    }

    public static void listAllPeople() {
        System.out.println("List of people:");
        for (Person person : people) {
            System.out.println(person.getName() + " (ID: " + person.getId() + ")");
        }
    }

    public static void createPerson() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter person's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter person's age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Does the person have parent permission? (true/false): ");
        boolean parentPermission = scanner.nextBoolean();
        scanner.nextLine();

        System.out.print("Is the person a teacher or student? (teacher/student): ");
        String personType = scanner.nextLine();

        if (personType.equalsIgnoreCase("teacher")) {
            System.out.print("Enter teacher's specialization: ");
            String specialization = scanner.nextLine();
            Teacher teacher = new Teacher(name, age, parentPermission, specialization);
            people.add(teacher);
            System.out.println("Teacher created successfully.");
        } else if (personType.equalsIgnoreCase("student")) {
            Student student = new Student(name, age, parentPermission);
            people.add(student);
            System.out.println("Student created successfully.");
        } else {
            System.out.println("Invalid person type.");
        }
    }

  public static void createBook() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter book title: ");
        String title = scanner.nextLine();

        System.out.print("Enter book author: ");
        String author = scanner.nextLine();

        Book book = new Book(title, author);
        books.add(book);
        System.out.println("Book created successfully.");
    }

    public static void createRental() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter person ID: ");
        int personId = scanner.nextInt();
        scanner.nextLine();

        Person person = findPersonById(personId);
        if (person == null) {
            System.out.println("Person not found.");
            return;
        }

        System.out.print("Enter book title: ");
        String title = scanner.nextLine();

        Book book = findBookByTitle(title);
        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        Rental rental = new Rental(book, person);
        rentals.add(rental);
        System.out.println("Rental created successfully.");
    }

    public static void listRentalsForPerson() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter person ID: ");
        int personId = scanner.nextInt();
        scanner.nextLine();

        Person person = findPersonById(personId);
        if (person == null) {
            System.out.println("Person not found.");
            return;
        }

        System.out.println("Rentals for " + person.getName() + " (ID: " + person.getId() + "):");
        boolean rentalsFound = false;
        for (Rental rental : rentals) {
            if (rental.getPerson().getId() == personId) {
                System.out.println(rental.getBook().getTitle() + " by " + rental.getBook().getAuthor());
                rentalsFound = true;
            }
        }
        if (!rentalsFound) {
            System.out.println("No rentals found for the person.");
        }
    }

    public static Person findPersonById(int personId) {
        for (Person person : people) {
            if (person.getId() == personId) {
                return person;
            }
        }
        return null;
    }

    public static Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;

    }
}
