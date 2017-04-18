import java.util.Objects;

public class Card {
  String color;
  String value;

  Card(String value, String color) {
    this.value = value;
    this.color = color;
  }

  Card (){
    this.value = value;
    this.color = color;
  }

  public String toOneString(Object Card) {
    return this.value + " " + this.color;
  }
}
