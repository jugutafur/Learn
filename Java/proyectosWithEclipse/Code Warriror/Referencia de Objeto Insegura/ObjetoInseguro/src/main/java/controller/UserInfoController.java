package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import constant.ViewNames;
import lombok.RequiredArgsConstructor;
import util.SanitizeService;
import app.service.api.UserInfoService;
import model.dto.UserInfoResponseDto;
import java.io.IOException;
import java.security.Principal;
import org.springframework.web.bind.annotation.ModelAttribute;
import model.dto.UserInfoRequestDto;

@Controller
@RequestMapping(name = ViewNames.USER_INFO_URL)
@RequiredArgsConstructor
public class UserInfoController {

	private final UserInfoService userInfoService;
	private final SanitizeService sanitizeService;
	
	@GetMapping
	public String userInfoPage(@RequestParam String username, Model model, HttpServletRequest request) {
		UserInfoResponseDto userInfo = userInfoService.findByUserName(username, request);
		model.addAttribute("userInfoResponse", 
				userInfo == null? new UserInfoResponseDto() : userInfo);
		return ViewNames.USER_INFO_VIEW_NAME;
	}
	
	@PostMapping
	public String updateUserInfo(@ModelAttribute UserInfoRequestDto userInfo,
								 Principal principal, Model model,
								 HttpServletRequest request) throws IOException{
		UserInfoResponseDto update = userInfoService.updateUserInfo(
				sanitizeService.sanitizeUserInfo(userInfo), principal.getName(), request);
		model.addAttribute("userInfoResponse", update == null ? new UserInfoResponseDto() : update);
		model.addAttribute("userInfoRequest", new UserInfoRequestDto());
		return ViewNames.USER_INFO_VIEW_NAME;
	}
}
