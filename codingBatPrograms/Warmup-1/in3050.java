/*
* Given 2 int values, return true if they are both in the range 30..40
* inclusive, or they are both in the range 40..50 inclusive.
*
* in3050(30, 31) → true
* in3050(30, 41) → false
* in3050(40, 50) → true
*/

public boolean in3050(int a, int b) {
  return ((29 < a && a < 41) && (29 < b && b < 41)) ||
    ((39 < a && a < 51) && (39 < b && b < 51));
}
