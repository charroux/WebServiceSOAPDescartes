package entreprise;

import javax.jws.WebService;

@WebService(endpointInterface="entreprise.MonService")
public class MonServiceImplantation implements MonService{

	@Override
	public int methode() {
		return 0;
	}

}
