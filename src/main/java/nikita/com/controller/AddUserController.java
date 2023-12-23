package nikita.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import nikita.com.dto.AddUserRequest;
import nikita.com.dto.AddUserResponse;
import nikita.com.services.AddUserServices;

@RestController
public class AddUserController {

	
		@Autowired
		AddUserServices AddUserServices;
		
		@PostMapping(
				path="/api/auth/add-user",consumes= {"application/json","application/xml"},produces = {"application/json","application/xml"})
				
				public AddUserResponse validate(@RequestBody AddUserRequest AddUserRequest) {
			return AddUserServices.adduser(AddUserRequest);
			
		}
	}