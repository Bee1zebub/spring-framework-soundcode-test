package com.atguigu.web.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(value = HttpStatus.CONFLICT,reason = "非法用户")
public class InvalidUserException extends RuntimeException{

	@java.io.Serial
	static final long serialVersionUID = -7034897190745766933L;

}
