package nikita.com.services;

import org.springframework.stereotype.Service;

import nikita.com.dto.LoginRequest;
import nikita.com.dto.LoginResponse;

@Service
public class LoginServices {
	
		public LoginResponse validate( LoginRequest loginRequest) {
			
			LoginResponse response = new LoginResponse();
			
			if(loginRequest.getUsername().equalsIgnoreCase("admin")&&
					loginRequest.getPassword().equals("admin123")) {
				response.setStatus("Success");
				response.setMessage("Login successful");
			
			}else {
				response.setStatus("Fail");
				response.setMessage("Login failure");
			}
			return response;
		}
}
