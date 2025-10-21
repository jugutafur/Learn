package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.validation.BindingResult;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import javax.validation.Valid;

import constant.ViewNames;
import model.dto.UserRegistrationDto;
import lombok.RequiredArgsConstructor;
import app.service.api.UserService;
import app.service.impl.RecaptchaService;

import model.dto.UserRegistrationDto;

import javax.management.relation.RoleNotFoundException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;
import util.SanitizeService;

@Controller
@RequestMapping(name = ViewNames.REGISTRATION_URL_)
@RequiredArgsConstructor
public class RegistrationController {
	
	private UserService userService;
	private RecaptchaService recaptchaService;
	private SanitizeService sanitizeService;
	
	@ModelAttribute("user")
	public UserRegistrationDto userRegistrationDto() {
		return new UserRegistrationDto();
	}
	
	@GetMapping
	public String getRegistrationPage(Model model) {
		model.addAttribute("sitekey", recaptchaService.getRecaptchPublic());
		return ViewNames.REGISTRATION_VIEW_NAME;
	}
	
	@PostMapping
	public String resgistrationUserAccount(
				@ModelAttribute("user") @Valid UserRegistrationDto userDto, 
				BindingResult result,
				HttpServletRequest request,
				Model model) throws RoleNotFoundException {
		model.addAttribute("messages", userService.register(request, sanitizeService.sanitizeUser(userDto), result));
		
		return ViewNames.REGISTRATION_VIEW_NAME;
	}

}
