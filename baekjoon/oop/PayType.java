package baekjoon.oop;

public enum PayType {
    KAKAO("kakao"),
    NAVER("naver");

    private final String type;

    PayType(String type) {
        this.type = type;
    }

    public static PayType fromString(String type) {
        for (PayType payType : values()) {
            if (payType.type.equals(type)) {
                return payType;
            }
        }
        return null; // 잘못된 결제 타입 처리
    }
}
