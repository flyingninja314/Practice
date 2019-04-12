/*
* Count the number of "xx" in the given string. We'll say that overlapping is
* allowed, so "xxx" contains 2 "xx".
*
* countXX("abcxx") → 1
* countXX("xxx") → 2
* countXX("xxxx") → 3
*/

int countXX(String str) {
  char prevChar = ' ';
  char currChar = ' ';
  int xxs = 0;

  for(int i = 0; i < str.length(); i++) {
    currChar = str.charAt(i);
    if(currChar == 'x' && prevChar == 'x') {
      xxs++;
    }
    prevChar = currChar;
  }
  return xxs;
}
