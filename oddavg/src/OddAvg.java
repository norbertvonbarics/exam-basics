import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddAvg {
  public static void main(String[] args) {
    List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
    OddAvg(numberList);
    System.out.println(OddAvg(numberList));
  }


  static int OddAvg(List<Integer> numbers) {
    List<Integer> oddList = new ArrayList<>();
    int averageNumber = 0;
    for (int i = 0; i < numbers.size(); i++) {
      if (numbers.get(i) % 2 != 0) {
        oddList.add(numbers.get(i));
      }
    }
    for (int j = 0; j < oddList.size(); j++) {
      averageNumber += oddList.get(j);
    }

    return averageNumber/ oddList.size();
  }
}
