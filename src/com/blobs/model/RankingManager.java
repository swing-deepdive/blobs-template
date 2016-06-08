package com.blobs.model;

import java.util.HashSet;
import java.util.Set;

import com.blobs.Constants;
import com.blobs.network.AzureConnector;

public class RankingManager {
	
	private AzureConnector connector;
	public RankingManager() {
		this.connector = new AzureConnector(Constants.GAME_ID);
	}
	
	public void addRanking(Ranking ranking) {
		this.connector.putScore(ranking.getName(), ranking.getHighscore());
	}
	
	public Set<Ranking> getRankings() {
		Set<Ranking> rankings = new HashSet<Ranking>();
		String json = this.connector.getScores();
		while(json.contains("\"Name\":")) {
			
			json = json.substring(json.indexOf("\"Name\":\"") + 8);
			String name = json.substring(0, json.indexOf('\"'));
			json = json.substring(json.indexOf("\"Score\":") + 8);
			int score = Integer.parseInt(json.substring(0, json.indexOf("}")));
			rankings.add(new Ranking(name, score));
		}
		return rankings;
	}
}
