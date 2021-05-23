package com.boot.bookrestaurantapi.exceptions;

import com.boot.bookrestaurantapi.dtos.ErrorDto;

import java.util.ArrayList;
import java.util.List;

public class BookingException extends Exception {
    private static final long serialVersionUID = 1L;

    private final String code;
    private final int responseCode;
    private final List<ErrorDto> errorList = new ArrayList<>();

    public BookingException(String code, int responseCode, String message) {
        super(message);
        this.code = code;
        this.responseCode = responseCode;
    }

    public BookingException(String code, int responseCode, String message, List<ErrorDto> errorList) {
        super(message);
        this.code = code;
        this.responseCode = responseCode;
        errorList.addAll(errorList);
    }

    public String getCode() {
        return code;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public List<ErrorDto> getErrorList() {
        return errorList;
    }
}