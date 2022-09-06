package com.example.javaagenttest;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ：周超
 * @date ：2022/9/5  16:43
 */
@org.springframework.web.bind.annotation.RestController
@RequestMapping("/test")
public class RestController {

	@RequestMapping("/test")
	public void test() {
		Hello hello = new Hello();
		hello.test();
	}

}
