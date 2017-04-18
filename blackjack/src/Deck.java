import java.util.*;

public class Deck {
  private int cardNumber;
  private int Clubs = 0;
  private int Diamonds = 0;
  private int Hearts = 0;
  private int Spades = 0;

  List<String> deck = new ArrayList<>();
  private final List<String> CARDVALUES = new ArrayList<>(
          Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"));

  private final List<String> CARDCOLORS = new ArrayList<>(
          Arrays.asList("Clubs", "Diamonds", "Hearts", "Spades"));

  @Override
  public String toString() {
    return super.toString();
  }

  public Deck(int cardNumber) {
    this.cardNumber = cardNumber;

    int Colors = 0;
    for (int i = 0; i < cardNumber; i++) {
      int randomNumber1 = (int) (Math.random() * 4);
      int randomNumber2 = (int) (Math.random() * 13);
      Card newCard = new Card(CARDVALUES.get(randomNumber2), CARDCOLORS.get(randomNumber1));
      newCard.toOneString(newCard);
      deck.add(newCard.toOneString(newCard));

    }

    System.out.println(deck);
    System.out.println(deck.get(2).substring(deck.get(3).length() - 5));
    for (int k = 0; k < deck.size(); k++) {
      String color;
      if (deck.get(k).substring(deck.get(k).length() - 5).equals("Clubs")) {
        Clubs++;
      } else if (deck.get(k).substring(deck.get(k).length() - 6).equals("Spades")) {
        Spades++;
      } else if (deck.get(k).substring(deck.get(k).length() - 8).equals("Diamonds")) {
        Diamonds++;
      } else if (deck.get(k).substring(deck.get(k).length() - 6).equals("Hearts")) {
        Hearts++;
      }
    }
    System.out.println(deck.size() + " Cards - " + Clubs + " Clubs, " + Diamonds + " Diamonds, " + Hearts + " Hearts, "+ Spades + "  Spades");
    draw(deck);
    System.out.println(deck.size() + " Cards - " + Clubs + " Clubs, " + Diamonds + " Diamonds, " + Hearts + " Hearts, "+ Spades + "  Spades");
  }

  void draw (List deck) {
    int randomNumber = (int) (Math.random() * deck.size());
    System.out.println(deck.get(randomNumber));
    deck.remove(randomNumber);
  }
}