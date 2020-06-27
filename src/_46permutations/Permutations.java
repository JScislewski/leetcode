package _46permutations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Permutations {
  private List<List<Integer>> permutationsList = new ArrayList<>();

  public List<List<Integer>> permute(int[] nums) {
    helper(new ArrayList<>(), nums);
    return Collections.unmodifiableList(permutationsList);
  }

  private void helper(List<Integer> temporaryList, int[] nums) {
    int temporaryListSize = temporaryList.size();
    if (temporaryListSize == nums.length) {
      permutationsList.add(new ArrayList<>(temporaryList));
      return;
    }
    for (int num : nums) {
      if (!temporaryList.contains(num)) {
        temporaryList.add(num);
        helper(temporaryList, nums);
        temporaryList.remove(temporaryListSize - 1);
      }
    }
  }
}
