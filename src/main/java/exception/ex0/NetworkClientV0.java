package exception.ex0;

public class NetworkClientV0 {

    // 연결할 서버의 네트워크 주소
    private final String address;

    public NetworkClientV0(String address) {
        this.address = address;
    }

    public String connect() {
        // 서버 연결 성공
        System.out.println(address + " 서버 연결 성공");
        return "Success";
    }

    public String send(String data) {
        // 데이터 전송 성공
        System.out.println(address + " 서버에 데이터 전송 " + data);
        return "Successs";
    }

    public void disconnect() {
        System.out.println(address + " 서버 연결 해제");
    }
}
