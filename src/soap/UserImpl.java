package soap;

import javax.jws.WebService;
//Service Implementation
@WebService(endpointInterface = "soap.User")
public class UserImpl implements User {
  @Override
  public String getUserNameAsString(String name) {
      return "Username: " + name;
  }
}
