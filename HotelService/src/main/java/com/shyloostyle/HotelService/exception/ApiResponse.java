package com.shyloostyle.HotelService.exception;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;
@Data
@Builder
public class ApiResponse {
    private String message;
    private boolean success;
    private HttpStatus status;
}
