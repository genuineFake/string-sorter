import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Reads a file and returns a list of read strings.
 */
public class FReader {
    private BufferedReader bufferedReader;
    private String filename;

    public FReader(String fileName) {
        this.filename = fileName;
    }

    public List<String> readFile() {
        try {
            bufferedReader = new BufferedReader(new FileReader(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<String> list = new ArrayList<>();
        String line = "";
        try {
            while ((line = bufferedReader.readLine()) != null) {
                if (!line.isEmpty()) {
                    list.add(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
