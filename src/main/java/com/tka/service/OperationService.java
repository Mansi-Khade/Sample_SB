package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.OpaerationDao;
@Service
public class OperationService {

	@Autowired
	OpaerationDao dao;
	
	public List<String> getList() {
		return dao.getList();
	}

	public int Add() {
		return dao.Add();
	}

}
