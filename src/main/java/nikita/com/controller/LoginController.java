package nikita.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import nikita.com.dto.LoginRequest;
import nikita.com.dto.LoginResponse;
import nikita.com.services.LoginServices;

@RestController
public class LoginController {
	
	
		
		@Autowired
		LoginServices loginService;
		
		@PostMapping(path="/auth/validate", consumes= {"application/json","application/xml"}, produces= {"application/json","application/xml"})           
		public LoginResponse validate(@RequestBody LoginRequest loginRequest)
		{
			return loginService.validate(loginRequest);
	}
	}