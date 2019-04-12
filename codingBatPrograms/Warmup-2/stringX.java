/*
* Given a string, return a version where all the "x" have been removed. Except
* an "x" at the very start or end should not be removed.
*
* stringX("xxHxix") → "xHix"
* stringX("abxxxcd") → "abcd"
* stringX("xabxxxcdx") → "xabcdx"
*/

public String stringX(String str) {
  String toReturn = "";

  if(str.length() > 0) {
    toReturn += str.charAt(0);

    if(str.length() > 1) {
      for(int i = 1; i < str.length() - 1; i++) {
        if(str.charAt(i) != 'x') {
          toReturn += str.charAt(i);
        }
      }
      toReturn += str.charAt(str.length() - 1);
    }
  }
  return toReturn;
}
