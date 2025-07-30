package org.skypro.counter_service.handler;

import org.skypro.counter_service.exeption.QuestionIllegalArgumentException;
import org.skypro.counter_service.exeption.QuestionNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.skypro.counter_service.handler.ExaminerServiceImplHandler;
import java.util.UUID;


@RestControllerAdvice
public class ExaminerServiceImplHandler {

    public ExaminerServiceImplHandler(int examinerServiceImplHandler) {

    }
    @ExceptionHandler(QuestionIllegalArgumentException.class)
    public ResponseEntity<String> handleException(Exception e) {
        String errorUUID = logErrorToNoSql(e);
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body("Количество запрашиваемых вопросов превышает количества вопросов в хранилище " + e.getMessage());
    }

    private String logErrorToNoSql(Exception e) {
        return UUID.randomUUID().toString();
    }

    public int getPower() {
        return 0;
    }
    @RestControllerAdvice
    static class JavaQuestionServiceHandler{

        public JavaQuestionServiceHandler(String service, ExaminerServiceImplHandler examinerServiceImplHandler) {

        }
    }
}