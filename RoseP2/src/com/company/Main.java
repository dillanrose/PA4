import java.io.FileNotFoundException;
import java.util.Scanner;

class Application {
    public static void main(String[] args) {
        new DuplicateCounter();

    }
}

class DuplicateCounter {

    public void count(String dataFile) {
        System.out.println("Items counted.");
    }

    //This method will write the contents of Set to the ouytput file
    public void Write(String outputFile) throws FileNotFoundException {
        outputFile = new String(outputFile);
        new Scanner(outputFile);
        outputFile.close();
        System.out.println("Counted items outputted.");

    }
}