package practica.anul.model.response;

import org.springframework.http.HttpStatus;

public class ErrorRes {
    HttpStatus httpStatus;
    String message;

    public ErrorRes(HttpStatus httpStatus, String message) {
        this.httpStatus = httpStatus;
        this.message = message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }


    public String getMessage() {
        return message;
    }

}
