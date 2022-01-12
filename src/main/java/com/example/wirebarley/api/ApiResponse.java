package com.example.wirebarley.api;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse<T> {
    private int code;
    private String message;
    private T data;

    public static <T> ApiResponse<T> ok(T t){
        return new ApiResponse<>(200, "성공", t);
    }

    public static <T> ApiResponse<T> error(String msg){
        return new ApiResponse<>(500, msg, null);
    }

}
