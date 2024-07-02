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
            numbersLists.add(new ArrayList<>(numId.setLineAndGetNumbers(line)));
            //System.out.println(numId.setLineAndGetNumbers(line));
        }
        /*for (List<Integer> numbers : numbersLists){
            System.out.println(numbers);
        }*/
        //System.out.println(numbersLists.get(0));

        int resultOfProblem = ProblemSolver.solveProblem(numbersLists);
        System.out.println("result: " + resultOfProblem);
        int resultOfProblemPart2 = ProblemSolver.solveProblemPart2(numbersLists);
        System.out.println("result for part2: " + resultOfProblemPart2);


        /*System.out.println("Example:");
        List<List<Integer>> example = new ArrayList<>();
        example.add(Arrays.asList(0, 3, 6, 9, 12, 15));
        example.add(Arrays.asList(1, 3, 6, 10, 15, 21));
        example.add(Arrays.asList(10, 13, 16, 21, 30, 45));
        System.out.println(ProblemSolver.solveProblemPart2(example));*/
    }
}