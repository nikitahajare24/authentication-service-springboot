package nikita.com.dto;

import org.springframework.stereotype.Component;

@Component
public class LoginResponse {//DTO =>Data Tranfer Object
                            //View
	   
	
	private String status;
	private String message;
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
}
