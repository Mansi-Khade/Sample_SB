package com.tka.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Repository;
@Repository
public class OpaerationDao {

	public List<String> getList() {

		ArrayList<String> slist = new ArrayList<String>();
		slist.add("Abhir");
		slist.add("Akash");

		return slist; 
	}

	public int Add() {
		Scanner sc = new Scanner(System.in);
	   //System.out.println("Enter Number 1 :-");
	   int num1 = 5;
	   //System.out.println("Enter Number 2 :-");
	   int num2 = 10; 
	   int add =num1+num2;
		return add;    
	}

}
