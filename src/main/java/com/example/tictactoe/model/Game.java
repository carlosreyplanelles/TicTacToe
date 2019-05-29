package com.example.tictactoe.model;


import java.util.List;
import lombok.Data;

@Data
public class Game {

	private int id;
	
	private Table table;
	
	private int turn;
	private List<Player> players;
	
	public Game() {
		start();
	}
	public Table getTable() {
		return table;
	}

	public void setTable(Table table) {
		this.table = table;
	}

	public int getId() {
		return id;
	}

	public void start() {
		table = new Table();
		table.start(3);
		turn = 0;
	}
	
	
}
