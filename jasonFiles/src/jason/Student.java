package jason;


import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

import java.io.File;

public class Student {

    public Student() throws Exception {
        JsonParser jsonParser = new JsonFactory().createParser(new File("src/archivesJSON/data/student.JSON"));
        parseJSON(jsonParser);
    }

    public static void parseJSON(JsonParser jsonParser) throws Exception{
        while (jsonParser.nextToken() != JsonToken.END_OBJECT){
            String name = jsonParser.getCurrentName();
            if(name != null){
                switch (name){
                    case "code":
                    jsonParser.nextToken();
                        System.out.println("code = " + jsonParser.getIntValue());
                        break;
                    case "name":
                        jsonParser.nextToken();
                        System.out.println("name = " +jsonParser.getText());
                        break;
                    case "lastName":
                        jsonParser.nextToken();
                        System.out.println("lastName = " +jsonParser.getText());
                        break;
                    case "grades":
                        jsonParser.nextToken();
                        while (jsonParser.nextToken() != JsonToken.END_ARRAY){
                            System.out.println("grades = " +jsonParser.getDoubleValue());
                        }
                        break;
                    case "birthDate" :
                        jsonParser.nextToken();
                        parseJSON(jsonParser);
                        break;
                    case "year":
                        jsonParser.nextToken();
                        System.out.println(jsonParser.getIntValue());
                        break;
                    case"month":
                        jsonParser.nextToken();
                        System.out.println(jsonParser.getIntValue());
                        break;
                    case "day":
                        jsonParser.nextToken();
                        System.out.println(jsonParser.getIntValue());
                        break;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        new Student();
    }
}
