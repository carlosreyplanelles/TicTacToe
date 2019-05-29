package com.example.tictactoe.model;

import lombok.Data;

@Data
public class Table {
	
	private Square[][] table;

	public void start(int size) {
		table = new Square[size][size];
		initzializeTable();
	}
	
	public Boolean isValidPosition() {
		return null;
	}

	public Boolean isInUse() {
		return null;
	}
	
	public void initzializeTable() {
		for(int i = 0; i < table.length; i++) {
			initzialiceRow(i);
		}
	}
	
	public void initzialiceRow(int i) {
		for (int j=0; j < table[i].length;j++) {
			table[i][j] = new Square();
		}
	}
	
	public void printTable() {
		for(int i = 0; i < table.length; i++) {
			for(int j = 0; j < table[i].length;j++) {
				System.out.print(table[i][j]);
			}
			System.out.println();
		}
	}
}
