/*
* Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value,
* followed by the value plus 5, followed by the value minus 1. Additionally the
* 271 counts even if the "1" differs by 2 or less from the correct value.
*
* has271([1, 2, 7, 1]) → true
* has271([1, 2, 8, 1]) → false
* has271([2, 7, 1]) → true
*/

public boolean has271(int[] nums) {
  int start = 0;
  int partTwo = 0;
  boolean one, two;
  for (int i = 0; i < nums.length - 2; i++) {
    start = nums[i];
    partTwo = nums[i] - 1;
    one = (start + 5 == nums[i + 1]);
    two = (Math.abs(nums[i + 2] - partTwo) < 2);
    if ((start + 5 == nums[i + 1]) && (Math.abs(nums[i + 2] - partTwo) < 3)) {
      return true;
    }
  }
  return false;
}
