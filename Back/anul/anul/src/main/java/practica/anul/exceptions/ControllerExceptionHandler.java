package practica.anul.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@RestController
public class ControllerExceptionHandler {
    @ExceptionHandler(UserAlreadyExists.class)
    @ResponseStatus(value = HttpStatus.CONFLICT) // 409 Conflict status code
    public ErrorMessage userAlreadyExistsException(UserAlreadyExists ex, WebRequest request) {
        return new ErrorMessage(
                HttpStatus.CONFLICT.value(),
                new Date(),
                ex.getMessage(),
                request.getDescription(false)
        );
    }
}

