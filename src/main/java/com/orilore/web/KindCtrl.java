package com.orilore.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orilore.model.Kind;
import com.orilore.service.IKindService;
@RestController
@RequestMapping("/kind")
public class KindCtrl {
	@Resource
	private IKindService service;
	
	@RequestMapping("/list")
	public List<Kind> query(){
		return service.find();
	}
}
