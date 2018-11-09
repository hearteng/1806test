package com.tedu.Feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
@FeignClient("provider-user")
public interface HelloFeign {
	//对提供者调用
		@RequestMapping("/user/{name}")
		public String hello(@PathVariable("name") String name);
}
