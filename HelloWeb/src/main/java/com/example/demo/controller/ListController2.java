package com.example.demo.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Memolist;

@Controller
public class ListController2 {


	@RequestMapping("list2")
	public String list(Model model, @RequestParam(value = "keyword", required = false) String keyword) {
		Memolist[] list = {
				new Memolist("メロン","高いよ"),
				new Memolist("リンゴ","おいしいよ"),
				new Memolist("マスカット","つぶつぶです")
		};
		List<Object> text = new ArrayList<Object>();
		for(Memolist lists: list) {
			if(keyword == null) {
				text.add(lists);
			} else if(lists.getFruits().contains(keyword) || lists.getMemo().contains(keyword)) {
				text.add(lists);
			}
		}
		model.addAttribute("text", text);
		model.addAttribute("keyword", keyword);
		return "list2";
	}
}