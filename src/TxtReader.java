import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TxtReader {
    // want to use private to keep attribute within class //
    private final File file;

    // Set up constructor to instantiate into main with the file object
    // as a parameter.
    public TxtReader(File file) {
        this.file = file;
    }

    public void readFile() {
        try {
            Scanner scanner = new Scanner(file);


            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Not found: " + file.getAbsolutePath());
            e.printStackTrace();
        }
    }
}


