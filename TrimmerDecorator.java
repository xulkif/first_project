
public class TrimmerDecorator extends BaseDecorator {

    public TrimmerDecorator(Nameable nameable) {
        super(nameable);
    }

    @Override
    public String correct_name() {
        String name = nameable.correct_name();
        if (name.length() > 10) {
            return name.substring(0, 10);
        }
        return name;
    }
}


