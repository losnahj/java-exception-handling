package exception.ex1;

import java.util.Scanner;

public class mainV1 {

    public static void main(String[] args) {
//        NetworkServiceV1 networkService = new NetworkServiceV1();
        NetworkServiceV3 networkService = new NetworkServiceV3();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("전송할 문자: ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            try {
                networkService.sendMessage(input);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return ;
            }
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }
}
