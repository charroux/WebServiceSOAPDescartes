package entreprise;

import javax.jws.WebService;

@WebService(endpointInterface="entreprise.MonService")
public class MonServiceWebImpl implements MonService{

	@Override
	public int maMethode(float f, char c) {
		System.out.println("Serveur : maMethode");
		return 1;
	}

}
