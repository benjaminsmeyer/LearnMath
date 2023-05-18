package cs3500.learnmath;

import java.util.ArrayList;
import java.util.Random;

public class ProblemSet {
  private ArrayList<MathProblem> problemSet= new ArrayList<> ();

  /**
   * Generate a set of math problems
   * @param countToGenerate the number of problems to generate
   */
  public void generateProblems (int countToGenerate) {
    Random r = new Random();
    for (int i = 0; i < countToGenerate; i++) {
      MathProblem additionP = new AdditionMathProblem(r.nextInt() % 10, r.nextInt() % 10);
      MathProblem subtractionP = new SubtractionMathProblem(r.nextInt() % 10, r.nextInt() % 10);
      MathProblem p = r.nextInt(2) == 1 : additionP ? subtractionP;
      problemSet.add(p);
    }
  }
}
