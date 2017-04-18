import java.util.*;

public class Deck {
  private int cardNumber;
  List<String> deck = new ArrayList<>();
  List<String> cardValues = new ArrayList<>(
          Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"));

  List<String> cardColors = new ArrayList<>(
          Arrays.asList("Clubs", "Diamonds", "Hearts", "Spades"));

  @Override
  public String toString() {
    return super.toString();
  }

  public Deck(int cardNumber) {
    this.cardNumber = cardNumber;

    for (int i = 0; i < cardNumber; i++) {
      int Colors = 0;
      for (int j = 0; j < 4; j++) {
        Colors = j;
      }
      int randomNumber = (int) (Math.random() * 13);
      Card newCard = new Card(cardValues.get(randomNumber), cardColors.get(Colors));
      newCard.toOneString(newCard);
      deck.add(newCard.toOneString(newCard));

    }

    System.out.println(deck);
    for (int k = 0; k < deck.size(); k++) {
    
    }
  }
}
