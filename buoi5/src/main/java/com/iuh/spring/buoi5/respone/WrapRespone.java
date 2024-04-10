package com.iuh.spring.buoi5.respone;

import com.iuh.spring.buoi5.constant.WrapResponeStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WrapRespone<T> {
    private String statusCode;
    private T data;
    private String message;

    public static <T>WrapRespone<T> ok(T data) {
        WrapRespone<T> wrapRespone = new WrapRespone<>();
        wrapRespone.setStatusCode(WrapResponeStatus.SUCCESS);
        wrapRespone.setMessage("Message");
        wrapRespone.setData(data);
        return wrapRespone;
    }

    public static <T>WrapRespone<T> err (String message){
        WrapRespone<T> wrapRespone = new WrapRespone<>();
        wrapRespone.setStatusCode(WrapResponeStatus.INTERNAL_SERVER_ERROR);
        wrapRespone.setMessage(message);
        wrapRespone.setData(null);
        return wrapRespone;
    }

    public static <T>WrapRespone<T> err (String statusCode, String message){
        WrapRespone<T> wrapRespone = new WrapRespone<>();
        wrapRespone.setStatusCode(statusCode);
        wrapRespone.setMessage(message);
        wrapRespone.setData(null);
        return wrapRespone;
    }
}
