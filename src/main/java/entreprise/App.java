package entreprise;

import javax.xml.ws.Endpoint;

public class App {

	public static void main(String[] args) {
		MonService monService = new MonServiceImplantation();
		Endpoint.publish("http://localhost:8080/WS/MonServiceWeb", monService);
	}

}
