public class RequestDirector {
    
    String request;
    Request requestHandler;

    public void setRequest(String request) {
        this.request = request;
    }

    public String getRequest() {
        return request;
    }

    public Response sendRequest(String request) {
        if (this.request == null){
            this.request = request;
        }
        if (this.request == null){
            return null;
        }

        establishHandler();
        
        if(requestHandler == null) {
            return null; // No handler established for the request
        }

        requestHandler.handleRequest(this.request);
        return requestHandler.response;
    }

    private void establishHandler() {
        if (isMathRequest()) {
            requestHandler = new Request_Math();
        } else if (isDayRequest()) {
            requestHandler = new Request_Day();
        }
    }

    public Boolean isMathRequest() {
        return request != null && !request.isEmpty() && request.charAt(0) == '1';
    }
    public Boolean isDayRequest() {
        return request != null && !request.isEmpty() && request.charAt(0) == '2';
    }
}
