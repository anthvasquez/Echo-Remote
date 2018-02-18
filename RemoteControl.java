package remotecontrol;

import com.google.gson.*;

import java.io.*;

import com.amazon.speech.json.SpeechletResponseEnvelope;
import com.amazonaws.services.lambda.runtime.Context; 
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class RemoteControl implements RequestHandler<String, String> {

	
	public String handleRequest(String input, Context context) {
		
		SpeechletResponseEnvelope response = new SpeechletResponseEnvelope();
		response.setVersion("1.0");
		String test = "There was a problem";
		try {
			test = response.toJsonString();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		context.getLogger().log(test);
        return test;
    }
}
