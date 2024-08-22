import java.io.File;

public class Main {
    public static void main(String[] args) {
        String filePath = "src/FilesForTxtReader/.txt.txt";

        //  instantiate of the object due to contractor in TxtReader
        TxtReader fileReader = new TxtReader(new File(filePath));

        // This is where we call the abstracted function from teh Txt Reader class//
        fileReader.readFile();

    }

}
