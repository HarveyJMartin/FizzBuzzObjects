public class RuleBuzz extends Rule {

    public RuleBuzz() {
        super("Buzz every fifth number");
    }

    @Override
    public void applyRule(StringBuilder builder, int number) {
        if (number % 5 == 0)
            builder.append("Buzz");
    }
}
