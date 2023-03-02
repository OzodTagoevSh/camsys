package miu.edu.northeastenbank.camsys.camsysspringbootapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class GlobalException {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleException(MethodArgumentNotValidException ex) {
        Map<String, String> getError = new HashMap<>();
        ex.getBindingResult().getFieldErrors().forEach(er -> getError.put(er.getField(), er.getDefaultMessage()));
        return getError;
    }
}
