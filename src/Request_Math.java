public class Request_Math extends Request {

    public Request_Math() {
        
    }

    public Request_Math(String request) {
        this.request = request;
    }

    @Override
    public Response handleRequest(String request) {
        response = new Response();
        response.setResponse("Math handled: " + request);
        return response; // Return the response object with the handled message
    }
    
}
