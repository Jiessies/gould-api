package com.ykly.controller;

import com.ykly.common.enums.ERetCode;
import com.ykly.entity.ResMsg;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.validation.ConstraintViolationException;
import javax.validation.ValidationException;

//@EnableWebMvc
//(annotations = {RestController.class})
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    
    /*@Bean
    public MethodValidationPostProcessor methodValidationPostProcessor() {
        return new MethodValidationPostProcessor();
    }
    
    @ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public String handle(ValidationException exception) {
        log.error("bad request, " + exception.getMessage());
        return "bad request, " + exception.getLocalizedMessage();
    }*/
    
    @ExceptionHandler(value = Throwable.class)
    public ResMsg throwableHandler(Throwable t) throws Exception {
        
        if (t instanceof MissingServletRequestParameterException) {
            MissingServletRequestParameterException msrpe = (MissingServletRequestParameterException) t;
            return ResMsg.fail(ERetCode.INPUT_ERROR, "", msrpe.getMessage());
        }
        if (t instanceof MethodArgumentNotValidException) {
            MethodArgumentNotValidException manve = (MethodArgumentNotValidException) t;
            return ResMsg
                    .fail(ERetCode.INPUT_ERROR, "", manve.getBindingResult().getFieldError().getDefaultMessage());
        }
        if (t instanceof ConstraintViolationException) {
            ConstraintViolationException cve = (ConstraintViolationException) t;
            return ResMsg.fail(ERetCode.INPUT_ERROR, "", cve.getConstraintViolations().toString());
        }

        /*未作处理的异常抛出未知异常*/
        log.error("--> GlobalExceptionHandler ", t);
        return ResMsg.unknowWithMsg(t.toString());
    }
    
}
