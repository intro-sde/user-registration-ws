# User registration service

This SOAP service checks if the User is already registered in the system or not and registers their data if not. It is implemented using document style SOAP binding.

The wsdl is available at: https://sde-user-registration-ws.herokuapp.com/ws/user?wsdl

There are two SOAP operations:
- listUsers: list all users in the database,

- checkUser: checks if user is in the list of users and returns a text accordingly.

To use with a client you need to generate stubs by running in console: wsimport -keep https://sde-user-registration-ws.herokuapp.com/ws/user?wsdl
