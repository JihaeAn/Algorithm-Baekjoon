package baekjoon.oop;

public class PayService {
    public void processPay(String type, int amount) {
        System.out.println("결제를 시작합니다: option=" + type + ", amount=" + amount);

        PaymentFactory paymentFactory = new PaymentFactory();
        PayMent payment = paymentFactory.getPayment(type);

        if (payment == null) {
            System.out.println("결제 수단이 없습니다.");
            System.out.println("결제가 실패했습니다.");
            return;
        }

        payment.process(amount);
    }
}
