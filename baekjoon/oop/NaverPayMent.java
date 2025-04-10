package baekjoon.oop;

public class NaverPayMent implements PayMent {

    @Override
    public void process(int amount) {
        System.out.println("네이버페이 시스템과 연결합니다.");
        System.out.println(amount + "원 결제를 시도합니다.");
        System.out.println("결제가 성공했습니다.");
    }
}
