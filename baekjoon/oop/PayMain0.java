package baekjoon.oop;

public class PayMain0 {
    // enum
    // 결제 인터페이스 -> Payment
    // 인터페이스 상속 받는 각각의 결제 시스템들 -> KakaoPay etc
    // 결제 객체를 생성하는 팩토리 클래스(어떤 결제 시스템 이용할 건지)
    // 결제 서비스 클래스
    // 실행 클래스

    public static void main(String[] args) {
        PayService payService = new PayService();

        payService.processPay("kakao", 5000);

        payService.processPay("naver", 10000);

        payService.processPay("bad", 15000);

        //결제를 시작합니다: option=kakao, amount=5000
        //카카오페이 시스템과 연결합니다.
        //5000원 결제를 시도합니다.
        //결제가 성공했습니다.

        //결제를 시작합니다: option=naver, amount=10000
        //네이버페이 시스템과 연결합니다.
        //10000원 결제를 시도합니다.
        //결제가 성공했습니다.

        //결제를 시작합니다: option=bad, amount=15000
        //결제 수단이 없습니다.
        //결제가 실패했습니다.
    }
}
