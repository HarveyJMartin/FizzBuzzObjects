public class RuleFizz extends Rule {

    public RuleFizz() {
        super("Fizz every third number");
    }

    @Override
    public void applyRule(StringBuilder builder, int number) {
        if (number % 3 == 0)
            builder.append("Fizz");
    }
}
