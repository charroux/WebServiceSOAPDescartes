package entreprise;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface = "entreprise.MonService")
public class MonServiceImplantation implements MonService{
	
	@WebMethod
	public int methode(){
		return 0;
	}

}
