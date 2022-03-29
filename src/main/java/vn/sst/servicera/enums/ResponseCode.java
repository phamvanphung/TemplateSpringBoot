package vn.sst.servicera.enums;

public class ResponseCode {
    public enum Common {
        SUCCESS(0,"Success"),
        FAILED(1,"Failed"),
        COMMON_ERROR(2, "Common Error")
        ;

        private final int code;
        private final String message;

        Common(int code, String message) {
            this.code = code;
            this.message = message;
        }

        public String getMessage() {
            return message;
        }

        public int getCode() {
            return code;
        }
    }
}
