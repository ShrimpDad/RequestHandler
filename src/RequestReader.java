import java.util.Scanner;

public class RequestReader {

    private static final Scanner scanner = new Scanner(System.in);

    String request;

    public String readRequest() {
        System.out.println("Please enter your request:");
        if(scanner.hasNextLine()) {
            request = scanner.nextLine();
        } else {
            System.out.println("No request entered.");
            request = null;
        }
        return request;
    }

    public static void closeScanner() {
        scanner.close();
    }
}
