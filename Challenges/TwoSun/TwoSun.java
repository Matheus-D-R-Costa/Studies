import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public static void main(String[] args) {
  int[] array = { 2, 7, 11, 15};

  System.out.println(Arrays.toString(twoSun(array, 9)));

}

public static int[] twoSun(int[] nums, int target) {
  Map<Integer, Integer> hasher = new HashMap<>();

  for (int idx = 0; idx < nums.length; idx++) {
    int i = nums[idx];
    if (hasher.containsKey(i)) {
      return new int[] { hasher.get(i), idx };
    }

    hasher.put(target - i, idx);

  }

  return null;

}