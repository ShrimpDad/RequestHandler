public class Request_Day extends Request {
    
    public Request_Day() {
        
    }

    public Request_Day(String request) {
        this.request = request;
    }

    @Override
    public Response handleRequest(String request) {
        response = new Response();
        response.setResponse("Day handled: " + request);
        return response; // Return the response object with the handled message
    }
    
}
