package com.blobs.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class AzureConnector {
	
	public static void main(String[] args) {
		new AzureConnector().getTable("highscore");
	}
	
	static final String TABLE_URL = "http://blobs-swing.azurewebsites.net/tables/%s?zumo-api-version=2.0.0";
	
	public void getTable(String table) {
		String url = String.format(TABLE_URL, table);
		try {
			URL obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			BufferedReader in = new BufferedReader(
			        new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
