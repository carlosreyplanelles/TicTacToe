package com.example.tictactoe.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Player {
	
	private String name;
	private int wins;
	
}
