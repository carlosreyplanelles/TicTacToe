package com.example.tictactoe.model;

public class Game {

	private int id;
	
	private Table table;
	
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
		table.start(3);
	}
}
