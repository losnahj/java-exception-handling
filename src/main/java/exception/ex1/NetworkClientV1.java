package exception.ex1;

public class NetworkClientV1 {

    // 연결할 서버의 네트워크 주소
    private final String address;
    private boolean availableState = true;

    public NetworkClientV1(String address) {
        this.address = address;
    }

    public String connect() {
        // 서버 연결 성공
        if (availableState) {
            System.out.println(address + " 서버 연결 성공");
            return "Success";
        }
        return "Error";
    }

    public String send(String data) {
        // 데이터 전송 성공
        System.out.println(address + " 서버에 데이터 전송 " + data);
        return "Success";
    }

    public void disconnect() {
        System.out.println(address + " 서버 연결 해제");
    }

    public void initError(String input) {
        if (input.contains("error")) {
            availableState = false;
        }
    }
}
