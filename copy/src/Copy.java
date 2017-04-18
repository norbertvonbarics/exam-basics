import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Copy {
  private static final String LINE = "=======================================\n";
  private static final String NODESTINAITON = "No destination provided\n";
  private static final String ERROR = "SYNTAX ERROR: ";
  private static String source;
  private static String destination;



  public static void main(String[] args) {
    //source = args[0];
   //destination = args[1];
    Ascii logo = new Ascii();
    if (args.length == 0) {
      logo.printAscii();
      logo.printUsage();
    } else if (args.length == 1){
      System.out.println(LINE + NODESTINAITON + LINE);
      logo.printAscii();
      logo.printUsage();
    } else if (args.length == 2) {
      source = args[0];
      destination = args[1];
      List<String> file = readFiles();
      readFiles();
      writeToFile(file);
      logo.printAscii();
    } else {
      lineBreak();
      logo.printUsage();
    }
  }

  private static List<String> readFiles() {
    List<String> rawLines = new ArrayList<>();
    Path myPath = Paths.get(source);
    try {
      rawLines = Files.readAllLines(myPath);
    } catch (IOException ex) {
      System.out.println(ERROR + " READ");
    }
    return rawLines;
  }

  private static void writeToFile(List<String> data) {
    List<String> file = readFiles();
    Path myPath = Paths.get(destination);
    try {
      Files.write(myPath, file);
    } catch (IOException ex) {
      System.out.println(ERROR + " WRITE");
    }
  }

  private static void lineBreak() {
    System.out.println("");
  }
}


