package easy;

public class NumberOfStepsToReduceANumberToZero {

  public int numberOfSteps(int num) {
    int counter = 0;
    while (num != 0) {
      counter++;
      if ((num & 1) == 0) {
        num = num / 2;
      } else {
        num--;
      }
    }

    return counter;
  }
}
