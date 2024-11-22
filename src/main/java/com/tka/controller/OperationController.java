package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.service.OperationService;

@RestController
public class OperationController {

	@Autowired
	OperationService service;
	
	@GetMapping("/getList")
	public List<String> getList()
	{
		return service.getList() ;
	}

	@GetMapping("/getAdd")
	public int Add()
	{
		return service.Add();
	}
}

