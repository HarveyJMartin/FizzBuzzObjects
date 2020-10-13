public class RuleFizz extends Rule {

    public RuleFizz() {
        super("Fizz every third number?");
    }

    @Override
    public String applyRule(String existingString, int number) {
        if (number % 3 == 0)
            return existingString + "Fizz";
        return "";
    }
    
}
