package com;

public class Player {
	private String name;
	private int matchesPlayed;
	private int totalRuns;
	private String team;
	public Player() {
		this.name=null;
		this.matchesPlayed=0;
		this.totalRuns=0;
		this.team=null;
	}
	public Player(String name, int matchesPlayed, int totalRuns, String team) {
		super();
		this.name = name;
		this.matchesPlayed = matchesPlayed;
		this.totalRuns = totalRuns;
		this.team = team;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMatchesPlayed() {
		return matchesPlayed;
	}
	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}
	public int getTotalRuns() {
		return totalRuns;
	}
	public void setTotalRuns(int totalRuns) {
		this.totalRuns = totalRuns;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}

}
