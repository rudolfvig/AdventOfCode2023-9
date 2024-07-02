import java.util.ArrayList;
import java.util.List;

public class ProblemSolver {
    public static Integer solveProblem(List<List<Integer>> numbersLists){
        int result = 0;
        ExtrapolatingListOfIntegers extrapolating = new ExtrapolatingListOfIntegers(null);
        for(List<Integer> numbers : numbersLists)
        {
            extrapolating.setNumbers(numbers);
            result += extrapolating.extrapolate();
            //System.out.println(extrapolating.getNumbers());
            //System.out.println(extrapolating.extrapolate());
        }
        return result;
    }

    public static Integer solveProblemPart2(List<List<Integer>> numbersLists) {
        int result = 0;
        ExtrapolatingListOfIntegers extrapolating = new ExtrapolatingListOfIntegers(null);
        for(List<Integer> numbers : numbersLists)
        {
            extrapolating.setNumbers(numbers);
            result += extrapolating.extrapolatePrevious();
            //System.out.println(extrapolating.getNumbers());
            //System.out.println(extrapolating.extrapolate());
        }
        return result;
    }
}
