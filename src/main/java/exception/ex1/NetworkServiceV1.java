package exception.ex1;

public class NetworkServiceV1 {

    public void sendMessage(String data) throws Exception {
        String address = "http://example.com";
        NetworkClientV1 networkClient = new NetworkClientV1(address);

        networkClient.initError(data);

        networkClient.connect();
        networkClient.send(data);
        networkClient.disconnect();
    }
}
