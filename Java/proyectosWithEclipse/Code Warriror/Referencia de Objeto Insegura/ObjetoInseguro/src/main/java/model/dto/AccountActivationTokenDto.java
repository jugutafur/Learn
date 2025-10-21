package model.dto;

import java.util.Date;
import lombok.Data;
import model.entity.User;

@Data
public class AccountActivationTokenDto {
	private Long id;
	private String token;
	private User user;
	private Date expiryDate;
	
	public boolean isExpired() {
		return new Date().after(this.expiryDate);
	}
}
