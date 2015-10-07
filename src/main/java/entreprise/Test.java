package entreprise;

import javax.xml.ws.Endpoint;

public class Test {

	public static void main(String[] args) {
		MonService monService = new MonServiceWebImpl();	
		Endpoint.publish("http://localhost:8080/WS/MonServiceWeb", monService);

	}

}
