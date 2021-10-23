package com.example.demo;

import javax.validation.constraints.Pattern;

public class FormCheck {

	@Pattern(regexp = "^[0-9]")
	private String check;

	public String getCheck() {
	      return check;
	}

	public void setCheck(String check) {
	      this.check = check;
	}
}
