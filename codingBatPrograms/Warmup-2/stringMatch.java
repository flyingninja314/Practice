/*
* Given 2 strings, a and b, return the number of the positions where they
* contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since
* the "xx", "aa", and "az" substrings appear in the same place in both strings.
*
* stringMatch("xxcaazz", "xxbaaz") → 3
* stringMatch("abc", "abc") → 2
* stringMatch("abc", "axc") → 0
*/

public int stringMatch(String a, String b) {
  int hits = 0;
  String subA = "";
  String subB = "";
  int len  = Math.min(a.length(), b.length()) - 1;
  for(int i = 0; i < len; i++) {
    subA = a.substring(i, i + 2);
    subB = b.substring(i, i + 2);
    if(subB.equals(subA)) {
      hits++;
    }
  }
  return hits;
}
