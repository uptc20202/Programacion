package persistence;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;

import java.net.URL;

public class WebConsumer {

	public String WebServicePlainReader(String url) {
		URL obj;
		StringBuffer response = null;
		try {
		obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		int responseCode = con.getResponseCode();
		System.out.println("Response Code : " + responseCode);
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		response = new StringBuffer();
		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println("error en conexion "+e.getMessage());
		//e.printStackTrace();
		}
		return response.toString();
		}


}
