package app.service.api;

import javax.servlet.http.HttpServletRequest;
import model.entity.AccountActivationToken;
import model.dto.AccountActivationTokenDto;
import model.entity.User;

public interface AccountActivationTokenService {	
	AccountActivationToken generateToken(User user);
	AccountActivationTokenDto findByToken(String token, HttpServletRequest reques);
	void deleteToken(AccountActivationTokenDto token);
}
