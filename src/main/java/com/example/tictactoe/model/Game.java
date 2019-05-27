package com.example.tictactoe.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Game {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private TictactoeTable tabletop;
	
	private List<Player> players;

	public TictactoeTable getTabletop() {
		return tabletop;
	}

	public void setTabletop(TictactoeTable tabletop) {
		this.tabletop = tabletop;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	public Long getId() {
		return id;
	}

}
