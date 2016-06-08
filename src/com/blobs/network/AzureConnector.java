package com.blobs.network;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import com.blobs.Constants;

public class AzureConnector {

	private String gameId;

	public AzureConnector(String gameId) {
		this.gameId = gameId;
	}
	
	public String getScores() {
		try {
			URL obj = new URL(Constants.API_URL + "&id=" + gameId);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			return response.toString();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}

	public void putScore(String name, int score) {
		String json = "{\"Name\":\"" + name + "\", \"Score\":" + Integer.toString(score) + ", \"game_id\":"
				+ this.gameId + "}";
		byte[] postData       = json.getBytes( StandardCharsets.UTF_8 );
		int    postDataLength = postData.length;
		URL url;
		try {
			url = new URL(Constants.TABLE_URL);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();           
			conn.setDoOutput( true );
			conn.setInstanceFollowRedirects( false );
			conn.setRequestMethod( "POST" );
			conn.setRequestProperty( "Content-Type", "application/json"); 
			conn.setRequestProperty( "charset", "utf-8");
			conn.setRequestProperty( "Content-Length", Integer.toString( postDataLength ));
			conn.setUseCaches( false );
			try( DataOutputStream wr = new DataOutputStream( conn.getOutputStream())) {
			   wr.write( postData );
			}
			conn.connect();
			
			BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
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
