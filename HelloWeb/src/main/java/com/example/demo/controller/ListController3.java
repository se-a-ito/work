package com.example.demo.controller;


import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Memolist;
@Controller
public class ListController3 {


	@RequestMapping("list3")
	public String list(Model model, @RequestParam(value = "keyword", required = false) String keyword) {
		try {
			List<Object> fruits = new ArrayList<Object>();
			Path path = Paths.get("src/main/resources/fruits.csv");
			BufferedReader br = Files.newBufferedReader(path);
            String line;
            while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            fruits.add(new Memolist(data[0], data[1]));
            }
    		model.addAttribute("text", fruits);
            br.close();
		} catch (IOException e) {
            System.out.println(e);
        }
		return "list3";
	}


}
