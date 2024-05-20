package exception.ex1;

public class NetworkServiceV2 {
    public void sendMessage(String data) throws Exception {
        String address = "http://example.com";
        NetworkClientV1 networkClient = new NetworkClientV1(address);
        networkClient.initError(data);


        String connectResult = networkClient.connect();

        // Refactoring 요소 : 조건에서 결과의 부정은 가독성이 안좋다.
        if (isError(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드 :" + connectResult);
            return ;
        }

        String sendResult = networkClient.send(data);
        if (isError(sendResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드 :" + sendResult);
            return ;
        }

        networkClient.disconnect();
    }

    private static boolean isError(String connectResult) {
        return !connectResult.equals("Success");
    }
}
