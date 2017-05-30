import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteToFile {
    private BufferedWriter bufferedWriter;
    private FileWriter fileWriter;

    public void useFileWriter(List<String> readStrings, String filePath) {
        StringBuilder sb = new StringBuilder();
        for (String s : readStrings) {
            sb.append(s);
            sb.append("\n");
        }

        filePath = filePath.substring(0, filePath.length() - 4) + "-output.txt";

        try {
            fileWriter = new FileWriter(filePath);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.append(sb);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedWriter != null)
                    bufferedWriter.close();
                if (fileWriter != null)
                    fileWriter.close();

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
