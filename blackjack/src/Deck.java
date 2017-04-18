import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Deck {
  private int cardNumber;
  List<Card> deck = new ArrayList<>();
  Card cards = new Card();
  List<String> cardValues = new ArrayList<>(
          Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"));
  List<String> cardColors = new ArrayList<>(
          Arrays.asList("Clubs", "Diamonds", "Hearts", "Spades"));

  public Deck(int cardNumber) {
    this.cardNumber = cardNumber;

    for (int i = 0; i < cardNumber; i++) {
      int randomNumber = (int) (Math.random() * 13);
    }
  }


}
