package cn.sky.web;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.sky.util.JsonResult;


public class BaseController {

	@ExceptionHandler(Exception.class)
	@ResponseBody
	public JsonResult<Object> expHandler(Exception e){
		e.printStackTrace();
		return new JsonResult<Object>(e);
	}
}
