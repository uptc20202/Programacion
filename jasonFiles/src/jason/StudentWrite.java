package jason;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;

public class StudentWrite {
	public StudentWrite() throws FileNotFoundException, IOException {
		JsonGenerator jsonGenerator = new JsonFactory()
				.createGenerator(new FileOutputStream("data/newStuden.json"));
		jsonGenerator.writeStartObject();
		jsonGenerator.writeNumberField("code", 20220222);
		jsonGenerator.writeStringField("name", "Danna");
		jsonGenerator.writeStringField("lastName", "Sanabria");
		jsonGenerator.writeArrayFieldStart("grades");
		jsonGenerator.writeNumber(3.6);
		jsonGenerator.writeNumber(4.5);
		jsonGenerator.writeEndArray();
		jsonGenerator.writeObjectFieldStart("birthDate");
		jsonGenerator.writeNumberField("year",1998);
		jsonGenerator.writeNumberField("month",2);
		jsonGenerator.writeNumberField("day",16);
		jsonGenerator.writeEndObject();
		System.out.println("Hola v");
		jsonGenerator.flush();
		jsonGenerator.close();
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		new StudentWrite();
	}

}
