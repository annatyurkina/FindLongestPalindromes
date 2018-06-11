import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Insert input string:\n");

        String input = "";
        try {
            input = br.readLine();
        } catch (IOException e) {
            System.out.println(String.format("Invalid string format: %s", e.getMessage()));
        }

        System.out.println(ManachersAlgorithm.analyze(3, input).toString());
    }
}
