import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Files {

  public static void main(String[] args) {
    try {
      BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("file.txt", false));
      bufferedWriter.write("Mi linea");
      bufferedWriter.newLine();
      bufferedWriter.write("Este es mi archivo de texto\n");
      bufferedWriter.close();

      BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
      String line = reader.readLine();

      while (line != null) {
        System.out.println(line);
        line = reader.readLine();
      }

      reader.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
