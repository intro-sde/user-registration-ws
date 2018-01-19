package soap;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style; 
import javax.jws.soap.SOAPBinding.Use;
//Service Endpoint Interface
@WebService
@SOAPBinding(style = Style.DOCUMENT, use=Use.LITERAL)
public interface User {

	
	@WebMethod(operationName="listUsers")
	@WebResult(name="userList") 
	public List<String> listUsers();


	@WebMethod(operationName="checkUser")
	@WebResult(name="userCheckResult") 
	public String checkUser(String firstname,String lastname,String email, String birthyear);


}