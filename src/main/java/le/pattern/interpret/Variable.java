package le.pattern.interpret;

public class Variable extends AbstractExpression{
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    int interpret(Context context) {
        return context.getValue(this);
    }

    @Override
    public String toString() {
        return name;
    }
}
