package com.orilore.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeCtrl {
	//将Url地址与特定方法绑定 网站根路径与welcome方进行绑定
	@RequestMapping("/index.do")
	public String welcome() {
		return "Hello SpringBoot!";
	}
	
	@RequestMapping("/list")
	public List<String> getNames(){
		List<String> list = new ArrayList<>();
		list.add("张三");
		list.add("张四");
		list.add("张五");
		list.add("张六");
		return list;
	}
}
