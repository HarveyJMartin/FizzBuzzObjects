import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        List<Rule> rulesToChooseFrom = getRulesToChooseFrom();
        List<Rule> rulesToUse = askUserForRules(rulesToChooseFrom);
        runFizzBuzz(rulesToUse, 20);
    }

    private static List<Rule> getRulesToChooseFrom() {
        List<Rule> rulesToChooseFrom = new ArrayList<>();
        rulesToChooseFrom.add(new RuleFizz());
        rulesToChooseFrom.add(new RuleBuzz());
        return rulesToChooseFrom;
    }

    private static List<Rule> askUserForRules(List<Rule> rulesToChooseFrom) {
        Scanner in = new Scanner(System.in);
        List<Rule> rulesToUse = new ArrayList<>();
        for (Rule rule : rulesToChooseFrom) {
            System.out.print(rule.getUserMessage() + " (y/n)? ");
            String input = in.next();
            if (input.length() > 0 && input.substring(0,1).equalsIgnoreCase("y"))
                rulesToUse.add(rule);
        }
        in.close();
        return rulesToUse;
    }

    private static void runFizzBuzz(List<Rule> rulesToUse, int maxNumber) {
        for (int i = 1; i <= maxNumber; i++) {
            StringBuilder output = new StringBuilder();
            for (Rule rule : rulesToUse) {
                rule.applyRule(output, i);
            }
            System.out.println(output.length() == 0 ? Integer.toString(i) : output.toString());
        }
    }
}
