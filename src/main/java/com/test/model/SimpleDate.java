package com.test.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDate extends Date{

	private static final SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	
	public SimpleDate(String dateStr)throws Exception{
		setTime(format.parse(dateStr).getTime());
	}
}
