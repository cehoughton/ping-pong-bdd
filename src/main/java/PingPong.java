import java.util.ArrayList;

public class PingPong {
  public static void main(String[] args) {}

  public ArrayList<String> pingPong(Integer number) {
    ArrayList<String> results = new ArrayList<String>();

    for (int i = 1; i <= number; i++) {
      results.add(Integer.toString(i));
    }

    return results;


  }
}
