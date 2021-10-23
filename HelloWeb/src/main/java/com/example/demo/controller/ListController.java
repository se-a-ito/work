package com.example.demo.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.Memolist;

@Controller
public class ListController {

	Memolist list1 = new Memolist("メロン","高いよ");
	Memolist list2 = new Memolist("リンゴ","おいしいよ");
	Memolist list3 = new Memolist("マスカット","つぶつぶです");

	@GetMapping("/list")
	public String list(Model model) {
		List<Object> text = new ArrayList<Object>();
		text.add(list1);
		text.add(list2);
		text.add(list3);
		model.addAttribute("text", text);
		return "list";
	}
}
