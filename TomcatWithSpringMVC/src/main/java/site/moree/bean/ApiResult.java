/*
 * Copyright (C) 2016 TP-LINK Technologies Co., Ltd. All rights reserved.
 *
 * Project: com.tplink.ump
 *
 */

package site.moree.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @author Tyrian
 */

public class ApiResult implements Serializable {

    private static final long      serialVersionUID = -5441900659429686421L;
    public static final  ApiResult RESULT_SUCCESS   = new ApiResult(ErrCode.ERR_SUCCESS);
    public static final  ApiResult RESULT_FAIL      = new ApiResult(ErrCode.ERR_FAIL);

    @JsonProperty("error_code")
    private int errCode;

    @JsonProperty("result")
    private Object result;

    @JsonProperty("msg")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String message;

    public int getErrCode() {
        return errCode;
    }

    public void setErrCode(int errCode) {
        this.errCode = errCode;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ApiResult() {

    }

    public ApiResult(int errCode) {
        this.errCode = errCode;
        this.result = null;
        this.message = null;
    }

    public ApiResult(int errCode, Object result) {
        this.errCode = errCode;
        this.result = result;
        this.message = null;
    }

    public ApiResult(int errCode, String message) {
        this.errCode = errCode;
        this.message = message;
        this.result = null;
    }

    public static ApiResult createResult(Object result) {
        if (result == null) {
            return new ApiResult(ErrCode.ERR_FAIL);
        }
        return new ApiResult(ErrCode.ERR_SUCCESS, result);
    }

    @JsonIgnore
    public boolean isSucceed() {
        return errCode == ErrCode.ERR_SUCCESS;
    }

    public static class ErrCode {
        public static final int ERR_SUCCESS = 0;
        public static final int ERR_FAIL    = 1;
        public static final int SILENCE     = 10;
    }
}
