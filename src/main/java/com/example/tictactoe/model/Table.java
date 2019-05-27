package com.example.tictactoe.model;

public class Table {
	
	private Square[][] table;

	public Square[][] getTable() {
		return table;
	}
	public void start(int size) {
		table = new Square[size][size];
	}

	public void setTable(Square[][] table) {
		this.table = table;
	}

	public Boolean isValidPosition() {
		return null;
	}

	public Boolean isInUse() {
		return null;
	}

}
