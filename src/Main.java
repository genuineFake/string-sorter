import java.util.*;

public class Main {

    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        List<String> readStrings;
        String filePath = ui.start();

        readStrings = new StringSorter().sortStrings(new FReader(filePath).readFile());

        new WriteToFile().useFileWriter(readStrings, filePath);

        ui.giveResult(readStrings);
    }
}
