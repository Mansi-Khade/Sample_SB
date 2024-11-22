package com.tka.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public class OpaerationDao {

	public List<String> getList() {

		ArrayList<String> slist = new ArrayList<String>();
		slist.add("Abhir");
		slist.add("Akash");

		return slist; 
	}

}
