package model;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

public class JSONTest {
	
	public void JSONTest() {
		
	}
	
	public static Word parseJSON( String nameField) {
			
			Word emp = new Word();
			
			//throws JsonParseException, IOException {
			// loop through the JsonTokens
			//JsonToken token;
			try {
				JsonParser jsonParser = new JsonFactory().createParser(new
						File(nameField));

				while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
				String name = jsonParser.getCurrentName();
				if (name != null) {
				switch (name) {
					case "id":
						jsonParser.nextToken();
						emp.setWord(jsonParser.getValueAsString());
						break;
					case "synonym1":
						jsonParser.nextToken();
						emp.setSynonyms(jsonParser.getText());
						break;
					case "synonym2":
						jsonParser.nextToken();
						emp.setSynonyms(jsonParser.getText());
						break;
					case "synonym3":
						jsonParser.nextToken();
						emp.setSynonyms(jsonParser.getText());
						break;
					}
				}
				}
			} catch (JsonParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return emp;	
	}
	

			
}
