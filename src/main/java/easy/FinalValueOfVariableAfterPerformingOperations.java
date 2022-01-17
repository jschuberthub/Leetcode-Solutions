package easy;

public class FinalValueOfVariableAfterPerformingOperations {

  public int finalValueAfterOperations(String[] operations) {
    int solution = 0;
    for (String operation : operations) {
      if (operation.equals("++X") || operation.equals("X++")) {
        solution++;
      } else {
        solution--;
      }
    }
    return solution;
  }
}
