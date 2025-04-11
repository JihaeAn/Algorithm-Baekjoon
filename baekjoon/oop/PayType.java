package baekjoon.oop;

public enum PayType {
    KAKAO("kakao", "카카오페이"),
    NAVER("naver", "네이버페이");

    private final String type;
    private final String value;

    PayType(String type, String value) {
        this.type = type;
        this.value = value;
    }

    public static PayType fromString(String type) {
        for (PayType payType : values()) {
            if (payType.type.equals(type)) {
                return payType;
            }
        }
        return null; // 잘못된 결제 타입 처리
    }

    public String getValue() {
        return value;
    }
}
