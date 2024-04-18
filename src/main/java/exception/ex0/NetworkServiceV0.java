package exception.ex0;

public class NetworkServiceV0 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV0 networkClient = new NetworkClientV0(address);

        networkClient.connect();
        networkClient.send(data);
        networkClient.disconnect();
    }
}
