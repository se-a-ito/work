package com.example.demo;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Memo {
	@NotNull(message = "{0}を入力してください。")
	@DecimalMin (value = "1", message = "{0}は{value}以上の値を入力してください。")
	private Integer number;

	@NotBlank(message = "{0}を入力してください。")
	@Size(max=10, message = "{0}は{max}文字以内で入力してください。")
	private String fruits;

	@Size(min=5, max=50, message = "{0}は{min}～{max}文字で入力してください。")
	private String memo;

	public Memo(Integer number, String fruits, String memo) {
		this.number = number;
		this.fruits = fruits;
		this.memo = memo;
	}

	public String getFruits() {
		return this.fruits;
	}

	public String getMemo() {
		return this.memo;
	}

	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public void setFruits(String fruits) {
		this.fruits = fruits;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
}
