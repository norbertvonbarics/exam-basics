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

  int randomNumber = (int) (Math.random() * deck.size());

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
    printDeck();
    draw(deck);
    if (deck.get(randomNumber).substring(deck.get(randomNumber).length() - 5).equals("Clubs")) {
      Clubs--;
    } else if (deck.get(randomNumber).substring(deck.get(randomNumber).length() - 6).equals("Spades")) {
      Spades--;
    } else if (deck.get(randomNumber).substring(deck.get(randomNumber).length() - 8).equals("Diamonds")) {
      Diamonds--;
    } else if (deck.get(randomNumber).substring(deck.get(randomNumber).length() - 6).equals("Hearts")) {
      Hearts--;
    }
    deck.remove(randomNumber);
    printDeck();
  }

  void draw (List deck) {
    System.out.println(deck.get(randomNumber));
  }

  void printDeck(){
    System.out.println(deck.size() + " Cards - " + Clubs + " Clubs, " + Diamonds + " Diamonds, " + Hearts + " Hearts, "+ Spades + "  Spades");
  }
}