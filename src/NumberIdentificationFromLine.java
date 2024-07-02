import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberIdentificationFromLine {

    private String line;
    private List<Integer> numbers;

    public NumberIdentificationFromLine() {
        this.numbers = new ArrayList<>();
    }

    public void setLine(String line) {
        this.line = line;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void identifyNumbers() {
        numbers.clear();

        // Revised pattern to match positive and negative integers including zero
        Pattern pattern = Pattern.compile("-?\\b(0|[1-9]\\d*)\\b");
        Matcher matcher = pattern.matcher(line);

        while (matcher.find()) {
            int number = Integer.parseInt(matcher.group());
            numbers.add(number);
        }
    }

    public List<Integer> setLineAndGetNumbers(String line) {
        setLine(line);
        identifyNumbers();
        return getNumbers();
    }
}