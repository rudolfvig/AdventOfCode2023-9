import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberIdentificationFromLine {

    private String line;
    private ArrayList<Integer> numbers;

    public NumberIdentificationFromLine() {
        this.numbers = new ArrayList<>();
    }

    private void setLine(String line) {
        this.line = line;
    }

    private ArrayList<Integer> getNumbers() {
        return numbers;
    }

    private void NumberIdentification(){

        numbers.clear();
        //the pattern is matching positive and negative numbers too
        Pattern pattern = Pattern.compile("\\b-?([1-9]\\d*)\\b");
        Matcher matcher = pattern.matcher(line);

        while(matcher.find()){
            int number = Integer.parseInt(matcher.group(1));
            numbers.add(number);
        }
    }

    public ArrayList<Integer> setLineAndGetNumbers(String line){
        setLine(line);
        this.NumberIdentification();

        return getNumbers();
    }

}
