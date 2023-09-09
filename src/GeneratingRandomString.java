import java.util.UUID;

public class GeneratingRandomString {
   public static void main(String args[]) {
      UUID uuid = UUID.randomUUID();
      String randomString = uuid.toString();
      System.out.println("Random string: " + randomString);
   }
}