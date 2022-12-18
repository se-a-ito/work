package com.example.demo.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Memo;
@Controller
public class FruitsController {
	List<Memo> text = new ArrayList<Memo>();
	FruitsController() {
		text.add((new Memo(1,"momo","test")));
	}

	@PostMapping("fruits")
	public String list(@Validated Memo memo, BindingResult result, Model model) {
	    if (result.hasErrors()) {
	        return "new";
	      }

		text.add(new Memo(memo.getNumber(), memo.getFruits(), memo.getMemo()));
		model.addAttribute("text", text);
		return "redirect:/fruits";
	}

	@GetMapping("fruits")
	public String display(Model model) {
		model.addAttribute("text", text);
		return "fruits";
	}

	@RequestMapping("/new")
	public String index(Memo memo) {
		return "/new";
	}
	@RequestMapping("fruits/{number}")
	public String delete(Model model, @PathVariable("number") Integer number) {
		for (int i = 0; i < text.size(); i++) {
			if(text.get(i).getNumber() == number) {
				text.remove(i);
			}
		}
		return "/delete";
	}
	@GetMapping("fruits/{number}/update")
	public String update(@ModelAttribute Memo memo, @PathVariable("number") Integer number) {
		for (int i = 0; i < text.size(); i++) {
			if(text.get(i).getNumber() == number) {
				Memo edit = text.get(i);
				memo.setNumber(edit.getNumber());
				memo.setFruits(edit.getFruits());
				memo.setMemo(edit.getMemo());
			}
		}
		return "/update";
	}

	@PutMapping("fruits/{number}/update")
	@ResponseBody
    public String edit(@Validated Memo memo, BindingResult result, Model model, @PathVariable("number") Integer id) {
	    if (result.hasErrors()) {
	        return "update";
	      }
		for (int i = 0; i < text.size(); i++) {
			if(text.get(i).getNumber() == id) {
				text.set(i ,new Memo(memo.getNumber(), memo.getFruits(), memo.getMemo()));
			}
		}
		return "text";
    }
}
