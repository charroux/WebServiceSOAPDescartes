package entreprise;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface MonService {
	
	@WebMethod
	public int methode();

}
