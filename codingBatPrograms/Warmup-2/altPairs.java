/*
* Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ...
* so "kittens" yields "kien".
*
* altPairs("kitten") → "kien"
* altPairs("Chocolate") → "Chole"
* altPairs("CodingHorror") → "Congrr"
*/

public String altPairs(String str) {
  String toReturn = "";
  if(str.length() < 3) {
    return str;
  } else if(str.length() == 3) {
    return str.substring(0, 2);
  }
  for(int i = 0; i < str.length() - 3; i += 4) {
    toReturn += str.substring(i, i + 2);
    if(i + 4 > str.length() - 3) {
      toReturn += str.substring(i + 4, str.length());
    }
  }
  return toReturn;
}
