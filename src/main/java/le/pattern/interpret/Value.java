package le.pattern.interpret;

public class Value extends AbstractExpression{
    private int value;

    public Value(int value) {
        this.value = value;
    }

    @Override
    int interpret(Context context) {
        return value;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}
