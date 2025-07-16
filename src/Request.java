public class Request {
    Response response;
    String request;

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    Response handleRequest(String request) {
        return null; // Default implementation, should be overridden by subclasses
    }
}
