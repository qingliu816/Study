

import java.io.IOException;

public class arg6 {

  public static void main(String[] args) {
    try {
      Process p = Runtime.getRuntime().exec("java star 1200 600 100");
    } catch (IOException e) {
      System.out.println("error");
    }
  }

}
