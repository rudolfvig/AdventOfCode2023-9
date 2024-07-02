import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyFileScanner mySc = new MyFileScanner("input.txt");
        ArrayList<String> lines =  mySc.getLines();
        List<List<Integer>> numbersLists = new ArrayList<>();
        NumberIdentificationFromLine numId = new NumberIdentificationFromLine();
        for (String line : lines) {
            numbersLists.add(numId.setLineAndGetNumbers(line));
            //System.out.println(numId.setLineAndGetNumbers(line));
        }

        int resultOfProblem = ProblemSolver.solveProblem(numbersLists);
        System.out.println("result: " + resultOfProblem);
        /*List<Integer> numbers = Arrays.asList(10, 13, 16, 21, 30, 45);
        ExtrapolatingListOfIntegers extrapolating = new ExtrapolatingListOfIntegers(numbers);
        System.out.println(extrapolating.extrapolate());*/

    }
}