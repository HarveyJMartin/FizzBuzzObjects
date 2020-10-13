public abstract class Rule {
    private String userMessage;
    private boolean isEnabled;

    public Rule(String userMessage) {
        this.userMessage = userMessage;
    }

    /**
     * Apply this object's rule to the existing string.  Should return blank if the number is unchanged.
     * @param existingString The string which is being built up.
     * @param number The number to compare.
     * @return The existing string, plus any words to be appended
     */
    public abstract String applyRule(String existingString, int number);
}
