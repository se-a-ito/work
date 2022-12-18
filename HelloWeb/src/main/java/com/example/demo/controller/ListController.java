package com.example.demo.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.Memo;

@Controller
public class ListController {

	Memo list1 = new Memo(1,"メロン","高いよ");
	Memo list2 = new Memo(2,"リンゴ","おいしいよ");
	Memo list3 = new Memo(3,"マスカット","つぶつぶです");

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
