import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Files {

  public static void main(String[] args) {
    try {
      FileWriter myWriter = new FileWriter("filename.txt");
      myWriter.write("Files in Java might be tricky, but it is fun enough!");
      myWriter.close();
      System.out.println("Successfully wrote to the file.");

      LocalDateTime myObj = LocalDateTime.now();
        System.out.println(myObj);
        System.out.println(myObj.toLocalDate());
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
