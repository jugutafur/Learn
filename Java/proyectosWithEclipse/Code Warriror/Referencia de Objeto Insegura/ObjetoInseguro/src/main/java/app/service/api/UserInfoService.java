package app.service.api;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import model.dto.UserInfoResponseDto;
import model.dto.UserInfoRequestDto;

public interface UserInfoService {
	UserInfoResponseDto findByUserName(String username, HttpServletRequest request);
	UserInfoResponseDto updateUserInfo(UserInfoRequestDto userInfo, String username, HttpServletRequest request) throws IOException;
}
