import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.abs;

public class ExtrapolatingListOfIntegers {

    private List<Integer> numbers;

    public ExtrapolatingListOfIntegers(List<Integer> numbers){
        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public int extrapolate(){
        int extrapolatedValue = numbers.get(numbers.size() - 1);
        ArrayList<Integer> differences = new ArrayList<>(numbers);

        while(true){
            boolean allZero = differences.stream().allMatch(x -> x.equals(0));
            boolean onlyOne = differences.size() == 1;
            if (allZero || onlyOne) {
                break;
            }
            differences = calculateDifferences(differences);
            extrapolatedValue += differences.get(differences.size()-1);
        }
        return extrapolatedValue;
    }

    public int extrapolatePrevious(){
        int extrapolatedValue = numbers.get(0);
        ArrayList<Integer> differences = new ArrayList<>(numbers);

        while(true){
            boolean allZero = differences.stream().allMatch(x -> x.equals(0));
            boolean onlyOne = differences.size() == 1;
            if (allZero || onlyOne) {
                break;
            }
            differences = calculateDifferencesReverseOrder(differences);
            extrapolatedValue += differences.get(0);
        }

        return extrapolatedValue;
    }

    private ArrayList<Integer> calculateDifferences(ArrayList<Integer> numbers){
        ArrayList<Integer> differences = new ArrayList<>();
        if(numbers.isEmpty() || numbers.size() == 1){
            return numbers;
        }
        for (int i = 1; i < numbers.size(); i++) {
            differences.add( numbers.get(i) - numbers.get(i-1) );
        }

        return differences;
    }

    private ArrayList<Integer> calculateDifferencesReverseOrder(ArrayList<Integer> numbers){
        ArrayList<Integer> differences = new ArrayList<>();
        if(numbers.isEmpty() || numbers.size() == 1){
            return numbers;
        }
        for (int i = 1; i < numbers.size(); i++) {
            differences.add( numbers.get(i-1) - numbers.get(i) );
        }

        return differences;
    }

}
