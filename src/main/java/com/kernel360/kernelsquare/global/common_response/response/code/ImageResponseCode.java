package com.kernel360.kernelsquare.global.common_response.response.code;

import com.kernel360.kernelsquare.global.common_response.service.code.ImageServiceStatus;
import com.kernel360.kernelsquare.global.common_response.service.code.ServiceStatus;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@RequiredArgsConstructor
public enum ImageResponseCode implements ResponseCode {
    IMAGE_UPLOAD_COMPLETED(HttpStatus.OK, ImageServiceStatus.IMAGE_UPLOAD_COMPLETED, "이미지 업로드 완료"),
    IMAGE_DELETED(HttpStatus.OK, ImageServiceStatus.IMAGE_DELETED, "이미지 삭제 완료");

    private final HttpStatus httpStatus;
    private final ServiceStatus serviceStatus;
    private final String msg;

    @Override
    public HttpStatus getStatus() {
        return httpStatus;
    }

    @Override
    public Integer getCode() {
        return serviceStatus.getServiceStatus();
    }

    @Override
    public String getMsg() {
        return msg;
    }
}