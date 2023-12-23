package nikita.com.services;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import nikita.com.dto.AddUserRequest;
import nikita.com.dto.AddUserResponse;

@RestController
public class AddUserServices {
		
		@PostMapping(path="/api/auth/add-user")
		public AddUserResponse adduser(@RequestBody AddUserRequest AddUserRequest){
			AddUserResponse response = new AddUserResponse();
			
		response.setStatus("success");
		response.setMessage("user successfully added");
		response.setuserid(AddUserRequest.getuserid());
		response.setusername(AddUserRequest.getusername());
		response.setuseremail(AddUserRequest.getuseremail());
		response.setuserage(AddUserRequest.getuserage());
		
		return response;
		}
}
