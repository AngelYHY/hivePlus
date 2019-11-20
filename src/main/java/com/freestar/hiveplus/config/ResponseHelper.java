package com.freestar.hiveplus.config;

import org.springframework.http.HttpStatus;

/**
 * 统一返回相应参数
 */
public class ResponseHelper {

    public ResponseHelper() {
    }

    public static <T> ResponseModel<T> responseModel(int code, String message, T data) {
        ResponseModel<T> response = new ResponseModel<T>();
        response.setCode(code);
        response.setMessage(message);
        response.setData(data);
        return response;
    }

    public static <T> ResponseModel<T> errorModel(int code, String message) {
        ResponseModel<T> response = new ResponseModel<T>();
        response.setCode(code);
        response.setMessage(message);
        return response;
    }

    public static <T> ResponseModel<T> jsonarrayErrorModel() {
        ResponseModel<T> response = new ResponseModel<T>();
        response.setCode(403);
        response.setMessage("jsonarray 格式错误");
        return response;
    }

    public static <T> ResponseModel<T> error(String message) {
        ResponseModel<T> response = new ResponseModel<T>();
        response.setCode(403);
        response.setMessage(message);
        return response;
    }

    public static <T> ResponseModel<T> notFound(String message) {
        ResponseModel<T> response = new ResponseModel<T>();
        response.setCode(HttpStatus.NOT_FOUND.value());
        response.setMessage(message);
        return response;
    }

    public static <T> ResponseModel<T> internalServerError(String message) {
        ResponseModel<T> response = new ResponseModel<T>();
        response.setCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
        response.setMessage(message);
        return response;
    }

    public static <T> ResponseModel<T> validationFailure(String message) {
        ResponseModel<T> response = new ResponseModel<T>();
        response.setCode(HttpStatus.BAD_REQUEST.value());
        response.setMessage(message);
        return response;
    }

    public static <T> ResponseModel<T> authorizedFailure(String message) {
        ResponseModel<T> response = new ResponseModel<T>();
        response.setCode(HttpStatus.UNAUTHORIZED.value());
        response.setMessage(message);
        return response;
    }

    public static <T> ResponseModel<T> buildResponseModel(T data) {
        ResponseModel<T> response = new ResponseModel<T>();
        response.setCode(HttpStatus.OK.value());
        response.setMessage(HttpStatus.OK.getReasonPhrase());
        response.setData(data);
        return response;
    }

    public static <T> ResponseModel<T> buildResponseModel() {
        ResponseModel<T> response = new ResponseModel<T>();
        response.setCode(HttpStatus.OK.value());
        response.setMessage(HttpStatus.OK.getReasonPhrase());
        return response;
    }
}
