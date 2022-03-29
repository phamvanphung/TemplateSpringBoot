package vn.sst.servicera.common;

import lombok.Builder;
import lombok.Data;
import vn.sst.servicera.enums.ResponseCode;

@Data
@Builder
public class ResponseObject {
    private int status = 0;
    private String message = "OK";
    private Object data = null;

    public ResponseObject(){
    }
    public ResponseObject(int status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public ResponseObject(int status, String message) {
        this.status = status;
        this.message = message;
        this.data = null;
    }

    public ResponseObject success(Object data) {
        this.data = data;
        status = ResponseCode.Common.SUCCESS.getCode();
        message = ResponseCode.Common.SUCCESS.getMessage();
        return this;
    }

    public ResponseObject success() {
        this.data = null;
        status = ResponseCode.Common.SUCCESS.getCode();
        message = ResponseCode.Common.SUCCESS.getMessage();
        return this;
    }

    public ResponseObject failed() {
        return failed(null);
    }

    public ResponseObject failed(Object data) {
        this.data = data;
        status = ResponseCode.Common.FAILED.getCode();
        message = ResponseCode.Common.FAILED.getMessage();
        return this;
    }

    public ResponseObject common(String message) {
        this.status = ResponseCode.Common.COMMON_ERROR.getCode();
        this.message = message;
        return this;
    }
}

