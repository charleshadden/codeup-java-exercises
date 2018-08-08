import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class FilePractice {
    public static void main(String[] args) {

//=============create directory=============\\
    String directory = "data";
    String filename = "myInfo.txt";

    Path dataDirectory = Paths.get(directory);
    Path dataFile = Paths.get(directory, filename);

if (!Files.notExists(dataDirectory)) {
    try {
        Files.createDirectories(dataDirectory);
        } catch (IOException e) {
        e.printStackTrace();
    }
}

if (! Files.exists(dataFile)) {
    try {
        Files.createFile(dataFile);
    } catch (IOException e) {
        e.printStackTrace();
    }
}




        Path c = dataFile;

        List<String> names = new ArrayList<>();
        names.add("Charles");
        names.add("Tiff");
        names.add("Frau");
        names.add("Diesel");
        try {
            Files.write(c, names, StandardOpenOption.APPEND);
        } catch(IOException e) {
            e.printStackTrace();
        }

    }
}
