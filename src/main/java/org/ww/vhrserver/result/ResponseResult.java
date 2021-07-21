package org.ww.vhrserver.result;

import lombok.Data;

/**
 * @Author ww
 * @Date 2021/7/15 13:48
 */
@Data
public class ResponseResult {
    private Integer status;
    private String msg;
    private Object data;

    private ResponseResult() {
    }

    private ResponseResult(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }


    public static ResponseResult ok(String msg, Object data) {
        return new ResponseResult(200, msg, data);
    }

    public static ResponseResult ok(String msg) {
        return new ResponseResult(200, msg, null);
    }


    public static ResponseResult error(String msg, Object data) {
        return new ResponseResult(500, msg, data);
    }

    public static ResponseResult error(String msg) {
        return new ResponseResult(500, msg, null);
    }
}
