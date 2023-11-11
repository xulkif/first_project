public class CapitalizeDecorator extends BaseDecorator {

    public CapitalizeDecorator(Nameable nameable) {
        super(nameable);
    }

    @Override
    public String correct_name() {
        String name = nameable.correct_name();
        return name.toUpperCase();
    }
}