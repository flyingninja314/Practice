/*
* Suppose the string "yak" is unlucky. Given a string, return a version where
* all the "yak" are removed, but the "a" can be any char. The "yak" strings will
* not overlap.
*
* stringYak("yakpak") → "pak"
* stringYak("pakyak") → "pak"
* stringYak("yak123ya") → "123ya"
*/

public String stringYak(String str) {
  String noYak = "";
  boolean endYak = false;

  for(int i = 0; i < str.length(); i++) {
    if(str.length() - i < 3) {
      if(!endYak) {
        noYak += str.charAt(i);
      }
    } else if(!(str.charAt(i) == 'y' && str.charAt(i + 2) == 'k')) {
      noYak += str.charAt(i);
    } else if (str.charAt(i) == 'y' && str.charAt(i + 2) == 'k' && i + 2 > str.length()){
      endYak = true;
      i += 2;
    } else {
      i += 2;
    }
  }

  return noYak;
}
