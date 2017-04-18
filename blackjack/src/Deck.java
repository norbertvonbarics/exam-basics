import java.util.*;

public class Deck {
  private int cardNumber;
  List<Card> deck = new ArrayList<>();
  List<String> cardValues = new ArrayList<>(
          Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"));

  List<String> cardColors = new ArrayList<>(
          Arrays.asList("Clubs", "Diamonds", "Hearts", "Spades"));
  List<String> cardList = new ArrayList<>();

  public Deck(int cardNumber) {
    this.cardNumber = cardNumber;

    int Colors = 0;
    for (int j = 0; j < 4; j++) {
      Colors = j;
    }

    for (int i = 0; i < cardNumber; i++) {
      int randomNumber = (int) (Math.random() * 13);
      Card newCard = new Card(cardValues.get(randomNumber), cardColors.get(Colors));
      deck.add(newCard);
    }

    String temp = "";
    for (int k = 0; k < deck.size(); k++) {

      temp = deck.get(k).toString();
      cardList.add(deck.get(k).toString());
    }
    System.out.println(temp);
    System.out.println(cardList);
  }
/*
  List<String> toString (List<Card> deck) {
    Collections.
  }*/
}
