package easy;

import java.util.Arrays;

public class MaximumNumberOfWordsFoundInSentences {

  // https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
  public int mostWordsFound(String[] sentences) {
    var ref =
        new Object() {
          int result = 0;
        };

    Arrays.stream(sentences)
        .forEach(
            sentence -> {
              if (sentence.split(" ").length > ref.result) {
                ref.result = sentence.split(" ").length;
              }
            });

    return ref.result;
  }
}
