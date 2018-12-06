public class Cards {
  public enum Color {
    WHITE, BLUE, BLACK, RED, GREEN, COLORLESS
  }
  public enum Type {
    CREATURE, SORCERY, INSTANT
  }
  Color color;
  Type type
  int power;
  int toughness;

  public Cards(Color color, Type type, int power, int toughness){
    this.color = color;
    this.type = type;
    this.power = power;
    this.toughness = toughness;
    if(this.type != CREATURE) {
      this.toughness = 1;
    }
  }


}
