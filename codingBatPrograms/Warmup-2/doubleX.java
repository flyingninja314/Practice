/*
* Given a string, return true if the first instance of "x" in the string is
* immediately followed by another "x".
*
* doubleX("axxbb") → true
* doubleX("axaxax") → false
* doubleX("xxxxx") → true
*/

boolean doubleX(String str) {
  boolean firstX = false;
  for(int i = 0; i < str.length() - 1; i++) {
    if(str.charAt(i) == 'x' && !firstX) {
      firstX = true;
      if(str.charAt(i + 1) == 'x') {
        return true;
      } else {
        return false;
      }
    }
  }
  return false;
}
