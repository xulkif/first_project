public class Main {
    public static void main(String[] args) {
        Person person = new Person("abdi",23,true);
        System.out.println(person.correct_name()); // Output: maximilianus

        CapitalizeDecorator capitalizedPerson = new CapitalizeDecorator(person);
        System.out.println(capitalizedPerson.correct_name()); // Output: MAXIMILIANUS

        TrimmerDecorator capitalizedTrimmedPerson = new TrimmerDecorator(capitalizedPerson);
        System.out.println(capitalizedTrimmedPerson.correct_name()); // Output: MAXIMILIAN
    }
}