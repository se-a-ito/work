package com.example.demo.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DateController {
	@GetMapping("/")
	public String index() {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd EEEEEEE" , Locale.ENGLISH);
		return sdf.format(d);
	}
}
