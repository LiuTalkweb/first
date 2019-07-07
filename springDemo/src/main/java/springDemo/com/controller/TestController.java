package springDemo.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springDemo.com.service.AaaService;

@RestController
@RequestMapping("/test")
public class TestController {

	@Autowired
	private AaaService aaaService;
	
	@RequestMapping("/test1")
	public String test1() {	
		System.out.println(aaaService.toString());
		return "hello test1";
	}
}
