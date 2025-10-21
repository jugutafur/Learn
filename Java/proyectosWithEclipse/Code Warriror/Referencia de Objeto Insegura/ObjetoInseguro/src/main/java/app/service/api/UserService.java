package app.service.api;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import model.dto.AccountActivationTokenDto;
import exception.UserNotFoundException;
import model.dto.UserRegistrationDto;
import model.entity.User;

import javax.management.relation.RoleNotFoundException;
import org.springframework.validation.BindingResult;

public interface UserService {
	String register(HttpServletRequest request,  
					UserRegistrationDto userRegistrationDto,
					BindingResult bindingresult) throws RoleNotFoundException;
	User findUserByUsername(String name);
	void activateUser(AccountActivationTokenDto tokenDto) throws UserNotFoundException;
	List<User> gelAllUser();

}
