
public class App {

    static String request = null;
    static Response myResponse = null;
    static Boolean requesting = true;

    public static void main(String[] args) throws Exception {
        greet();
        while (requesting) {
            if (readRequest()) {
                sendRequest();
            } else {
                requesting = false;
            }
        }
        System.out.println("No valid request received. Exiting.");
        RequestReader.closeScanner();
    }

    private static void greet() {
        System.out.println("Welcome to the Request Handler Application!");
        System.out.println("You can prefix requests starting with '1' for math operations or '2' for day requests.");
        System.out.println("Type 'exit' or null to quit the application.");
    }

    static Boolean readRequest() {
        RequestReader requestReader = new RequestReader();
        request = requestReader.readRequest();
        System.out.println("Received request: " + request);
        return request != null && !request.isEmpty() && !request.equalsIgnoreCase("exit");
    }

    static String sendRequest() {
        RequestDirector requestDirector = new RequestDirector();
        myResponse = requestDirector.sendRequest(request);
        if (myResponse == null) {
            return "No response available";
        }
        System.out.println("Received response: " + myResponse.getResponse());
        return myResponse.getResponse();
    }
}
