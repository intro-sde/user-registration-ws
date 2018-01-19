package soap.endpoint;

import javax.xml.ws.Endpoint;

import soap.UserImpl;

//Endpoint publisher
public class UserPublisher{
    public static void main(String[] args) {
       Endpoint.publish("http://localhost:6900/", new UserImpl());
    }
}
