package com.example.demo.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Memolist;
@Controller
public class FruitsController {
	@RequestMapping("fruits")
	public String list(Model model) {
		Memolist[] list = {
				new Memolist("メロン","高いよ"),
				new Memolist("リンゴ","おいしいよ"),
				new Memolist("マスカット","つぶつぶです")
		};
		List<Object> text = new ArrayList<Object>();
		for(Memolist lists: list) {
			text.add(lists);
		}
		model.addAttribute("text", text);
		return "fruits";
	}



	@RequestMapping("fruits/new")
	public String index() {
		return "/new";
	}
}
