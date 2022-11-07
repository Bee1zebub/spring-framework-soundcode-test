package com.atguigu.web.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice //专门处理异常的，默认加载容器中
public class MyExceptionHandler{

	@ExceptionHandler(value = ArithmeticException.class)
	@ResponseBody
	public String handlerZeroException(Exception exception){
		return "error";
	}

}
