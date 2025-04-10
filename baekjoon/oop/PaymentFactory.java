package baekjoon.oop;

public class PaymentFactory {

    public PayMent getPayment(String type) {

        PayType payType = PayType.fromString(type);

        if(payType == null) return null;

        if(payType.equals(PayType.KAKAO)) {
            return new KakaoPayMent();
        } else if(payType.equals(PayType.NAVER)) {
            return new NaverPayMent();
        }

        return null;
    }
}
