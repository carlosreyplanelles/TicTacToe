package com.example.tictactoe.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Square {
	
	private String symbol;
	private Boolean available;
	
	public Square() {
		symbol = "empty.png";
		available = true;
	}
	

}
