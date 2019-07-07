package springDemo.com.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springDemo.com.service.AaaService;

@RestController
@RequestMapping("/demo")
public class DemoController {

	@Autowired
	private AaaService aaaService;
	
	@GetMapping("/aa")
	List<Map<String, Object>> test() {
		System.out.println(aaaService.toString()+" class: "+ aaaService.getClass());
		List<Map<String, Object>> list = aaaService.dataList();
		return list;
	}
	
	@RequestMapping("/test3")
	public String hello2() {	
		return "hello boot3";
	}
	
	@RequestMapping("/test2")
	public String hello3() {	
		return "hello boot2";
	}
}
