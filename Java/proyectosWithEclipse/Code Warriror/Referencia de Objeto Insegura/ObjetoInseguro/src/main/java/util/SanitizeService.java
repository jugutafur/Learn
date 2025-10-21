package util;

import model.dto.UserRegistrationDto;
import model.dto.UserInfoRequestDto;

public interface SanitizeService {
	UserRegistrationDto sanitizeUser(UserRegistrationDto dto);
	UserInfoRequestDto sanitizeUserInfo(UserInfoRequestDto userInfo);

}
