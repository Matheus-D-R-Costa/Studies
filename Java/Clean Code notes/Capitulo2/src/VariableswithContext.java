public class VariableswithContext {
    private String number;
    private String verb;
    private String pluralModifier;

    public String make(char candidate, int count) {
        createPluralDependentMessageParts (count);
        return String.format(
                "there %s %s %s %s",
                verb, number, candidate, pluralModifier);
    }
        private void createPluralDependentMessageParts (int count) {
            if (count == 0) {
                thereAreNoLetters();
            } else if (count == 1) {
                thereIsOneLetter();
            } else {
                thereAreManyLetters (count);
            }
        }

        private void thereAreManyLetters (int count) {
            number = Integer.toString(count);
            verb = "is";
            pluralModifier = "";
        }
        private void thereIsOneLetter () {
            number = "1";
            verb = "are";
            pluralModifier = "";
        }

        private void thereAreNoLetters () {
            number = "no";
            verb = "are";
            pluralModifier = "s";
        }
}

// nomes curtos são melhores desde que sejam claros.