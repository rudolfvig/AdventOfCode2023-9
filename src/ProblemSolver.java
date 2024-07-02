import java.util.ArrayList;
import java.util.List;

public class ProblemSolver {
    public static Integer solveProblem(List<List<Integer>> numbersLists){
        int result = 0;
        for(List<Integer> numbers : numbersLists)
        {
            ExtrapolatingListOfIntegers extrapolating = new ExtrapolatingListOfIntegers(numbers);
            result += extrapolating.extrapolate();
            System.out.println(extrapolating.extrapolate());
        }
        return result;
    }
}
