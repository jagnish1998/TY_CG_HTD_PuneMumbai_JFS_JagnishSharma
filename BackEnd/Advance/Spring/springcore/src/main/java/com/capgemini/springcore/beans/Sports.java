package com.capgemini.springcore.beans;

import java.util.Map;

public class Sports {
	private String name;
	private int totalPlayer;
	private Map<String,String > teamInfo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotalPlayer() {
		return totalPlayer;
	}
	public void setTotalPlayer(int totalPlayer) {
		this.totalPlayer = totalPlayer;
	}
	public Map<String, String> getTeamInfo() {
		return teamInfo;
	}
	public void setTeamInfo(Map<String, String> teamInfo) {
		this.teamInfo = teamInfo;
	}
	
	
}
