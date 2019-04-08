/*
* Given a string, return a string made of the first 2 chars (if present),
* however include first char only if it is 'o' and include the second only if it
* is 'z', so "ozymandias" yields "oz".
*
* startOz("ozymandias") → "oz"
* startOz("bzoo") → "z"
* startOz("oxx") → "o"
*/

public String startOz(String str) {
  if(str.length() < 1) return "";
  String toReturn = "";
  char a1 = str.charAt(0);
  String a = "" + a1;
  if(a.equals("o")) toReturn += a;
  if(str.length() > 1) {
    char b1 = str.charAt(1);
    String b = "" + b1;
    if(b.equals("z")) toReturn += b;
  }
  return toReturn;
}
