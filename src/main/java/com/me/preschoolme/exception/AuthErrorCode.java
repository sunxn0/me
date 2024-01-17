package com.me.preschoolme.exception;

import com.google.api.Http;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum AuthErrorCode implements  ErrorCode{

    CHECK_DUPLICATION_ID(HttpStatus.BAD_REQUEST,"아이디 중복체크를 해주세요."),
    CHECK_CODE(HttpStatus.BAD_REQUEST,"식별코드를 확인하세요."),
    NOT_ENTER_ID(HttpStatus.BAD_REQUEST,"아이디를 입력하세요."),
    ALREADY_EXIST_ID(HttpStatus.BAD_REQUEST,"이미 존재하는 아이디"),
    SUCCES_SIGNUP(HttpStatus.OK,"회원가입완료"),
    NOT_EXIST_USER_ID(HttpStatus.NOT_FOUND,"아이디를 확인해주세요"),
    VALID_PASSWORD(HttpStatus.NOT_FOUND,"비밀번호를 확인해주세요"),
    CHANGE_JUST_ONETHING(HttpStatus.BAD_REQUEST, "한개 이상 입력하세요"),
    NEED_SIGNIN(HttpStatus.UNAUTHORIZED,"로그인이 필요합니다"),
    NOT_FOUND_REFRESH_TOKEN(HttpStatus.NOT_FOUND,"refresh-token이 없습니다");




    private final HttpStatus httpStatus;
    private final String message;
}
