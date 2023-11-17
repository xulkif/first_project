
public abstract class BaseDecorator implements Nameable {
    protected Nameable nameable;

    public BaseDecorator(Nameable nameable) {
        this.nameable = nameable;
    }

    @Override
    public String correct_name() {
        return nameable.correct_name();
    }
}
