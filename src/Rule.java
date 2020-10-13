public abstract class Rule {
    private String userMessage;

    public Rule(String userMessage) {
        this.userMessage = userMessage;
    }

    /**
     * Apply this object's rule to the existing string.  Should return blank if the number is unchanged.
     * @param builder The string builder to append to.
     * @param number The number to compare.
     */
    public abstract void applyRule(StringBuilder builder, int number);

    public String getUserMessage() {
        return userMessage;
    }
}
