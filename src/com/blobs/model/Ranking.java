package com.blobs.model;

/**
 * Created by root on 08.06.16.
 */
public class Ranking implements Comparable<Ranking> {
    private String name;
    private int highscore;

    public Ranking(String name, int highscore) {
        this.name = name;
        this.highscore = highscore;
    }

    public String getName() {
        return name;
    }

    public int getHighscore() {
        return highscore;
    }

	@Override
	public int compareTo(Ranking o) {
		// TODO Auto-generated method stub
		return o.getHighscore() - getHighscore();
	}
}
