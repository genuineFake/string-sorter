import java.util.List;
import java.util.Scanner;


public class UserInterface {
    private String input;
    private Scanner scanner = new Scanner(System.in);


    public String start() {
        System.out.println("Enter file path: ");
        input = scanner.nextLine();

        return input;
    }

    public void giveResult(List<String> readStrings) {
        System.out.println("You can find output data here: " + input.substring(0, input.length() - 4) + "-output.txt" + "\n");
        System.out.println("The result: " + "\n");
        for (String s : readStrings) {
            System.out.println(s);
        }
    }
}
