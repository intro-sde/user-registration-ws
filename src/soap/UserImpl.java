package soap;

import java.util.List;

import javax.jws.WebService;

import business.CheckUser;
//Service Implementation
@WebService(endpointInterface = "soap.User")
public class UserImpl implements User {

	@Override
	public List<String> listUsers() {
		List<String> users = CheckUser.listUsers();		
		return users;
	}

	@Override
	public String checkUser(String firstname, String lastname, String email, String birthyear) {
		String result = CheckUser.checkUser(firstname, lastname, email, birthyear);
		return result;
	}
	
	
	

}
